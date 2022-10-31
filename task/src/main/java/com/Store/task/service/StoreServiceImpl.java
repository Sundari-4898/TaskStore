package com.Store.task.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Store.task.model.Store;
import com.Store.task.repository.StoreRepository;

@Component
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreRepository storeRepository;

	@Override
	public List<Long> findByStartDateAndEndDate(LocalDate startDate, LocalDate endDate) {
		return storeRepository.findByStartDateAndEndDate(startDate, endDate);
	}

	@Override
	public Optional<Store> findById(Long id) {
		return storeRepository.findById(id);
	}
}
