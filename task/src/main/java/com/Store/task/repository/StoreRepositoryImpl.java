package com.Store.task.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Store.task.model.Store;

@Component
public class StoreRepositoryImpl implements StoreRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<Long> findByStartDateAndEndDate(LocalDate startDate, LocalDate endDate) {
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Long> createQuery = criteriaBuilder.createQuery(Long.class);
		Root<Store> store = createQuery.from(Store.class);
		Predicate startDatePredicate = criteriaBuilder.greaterThanOrEqualTo(store.get("dateOfPurchase"), startDate);
		Predicate endDatePredicate = criteriaBuilder.lessThanOrEqualTo(store.get("dateOfPurchase"), endDate);
		createQuery.where(startDatePredicate, endDatePredicate);
		createQuery.multiselect(criteriaBuilder.diff(store.get("totalIncome"), store.get("totalExpense")));
		TypedQuery<Long> query = entityManager.createQuery(createQuery);
		System.out.println(query);
		return query.getResultList();
	}
}
