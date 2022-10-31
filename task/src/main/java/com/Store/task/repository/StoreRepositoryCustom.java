package com.Store.task.repository;

import java.time.LocalDate;
import java.util.List;

public interface StoreRepositoryCustom {

	List<Long> findByStartDateAndEndDate(LocalDate startDate, LocalDate endDate);
}
