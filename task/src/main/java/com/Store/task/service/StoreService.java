package com.Store.task.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.Store.task.model.Store;

public interface StoreService {

	List<Long> findByStartDateAndEndDate(LocalDate startDate, LocalDate endDate);

	Optional<Store> findById(Long id);
}
