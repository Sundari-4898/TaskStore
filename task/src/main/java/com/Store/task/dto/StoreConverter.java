package com.Store.task.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.Store.task.model.Store;

@Component
public class StoreConverter {

	public StoreDto storeToDto(Store store) {
		StoreDto storeToDto = new StoreDto();
		storeToDto.setDateOfPurchase(store.getDateOfPurchase());
		storeToDto.setDayOfPurchase(store.getDayOfPurchase());
		storeToDto.setNoOfProductPurchased(store.getNoOfProductPurchased());
		storeToDto.setTotalIncome(store.getTotalIncome());
		storeToDto.setTotalExpense(store.getTotalExpense());
		return storeToDto;
	}

	public List<StoreDto> storeToDto(List<Store> store) {
		return store.stream().map(x -> storeToDto(x)).collect(Collectors.toList());
	}

	public Store storeToEntity(StoreDto storeDto) {
		Store storeToEntity = new Store();
		storeToEntity.setDateOfPurchase(storeDto.getDateOfPurchase());
		storeToEntity.setDayOfPurchase(storeDto.getDayOfPurchase());
		storeToEntity.setNoOfProductPurchased(storeDto.getNoOfProductPurchased());
		storeToEntity.setTotalIncome(storeDto.getTotalIncome());
		storeToEntity.setTotalExpense(storeDto.getTotalExpense());
		return storeToEntity;
	}

	public List<Store> storeToEntity(List<StoreDto> storeDto) {
		return storeDto.stream().map(x -> storeToEntity(x)).collect(Collectors.toList());
	}
}
