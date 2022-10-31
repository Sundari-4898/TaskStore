package com.Store.task.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Store.task.dto.StoreConverter;
import com.Store.task.dto.StoreDto;
import com.Store.task.model.Store;
import com.Store.task.repository.StoreRepository;
import com.Store.task.service.StoreService;

@RestController
@RequestMapping("/api")
public class StoreController {

	@Autowired
	StoreService storeService;

	@Autowired
	StoreConverter storeConverter;

	@Autowired
	StoreRepository storeRepository;

	@GetMapping("/getalldetails")
	public Iterable<Store> findAll() {
		return storeRepository.findAll();
	}

	@GetMapping("/getbyid/{ID}")
	public StoreDto findById(@PathVariable(value = "ID") long id) {
		Store dto = storeRepository.findById(id).orElse(null);
		return storeConverter.storeToDto(dto);
	}

	@PostMapping("/postdetails")
	public StoreDto save(@RequestBody StoreDto store) {
		Store entity = storeConverter.storeToEntity(store);
		entity = storeRepository.save(entity);
		return storeConverter.storeToDto(entity);
	}

	@PostMapping("/findbydate")
	public List<Long> findDate(@RequestParam("fromDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
			@RequestParam("toDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
		List<Long> stores = storeRepository.findByStartDateAndEndDate(startDate, endDate);
		return stores;
	}

	@GetMapping("/getbyday/{dayOfPurchase}")
	public List<Store> findByDayOfPurchase(@PathVariable(value = "dayOfPurchase") String dayOfPurchase) {
		List<Store> day = storeRepository.getByDayOfPurchase(dayOfPurchase);
		return day;
	}
}
