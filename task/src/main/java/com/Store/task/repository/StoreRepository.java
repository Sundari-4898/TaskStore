package com.Store.task.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.Store.task.model.Store;

public interface StoreRepository extends CrudRepository<Store, Long>, StoreRepositoryCustom {

	public Optional<Store> findById(Long id);

	public List<Store> getByDayOfPurchase(String dayOfPurchase);
}
