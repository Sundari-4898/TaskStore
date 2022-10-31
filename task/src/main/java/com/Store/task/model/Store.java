package com.Store.task.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "store_grocery")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long siNo;
	private LocalDate dateOfPurchase;
	private String dayOfPurchase;
	private long noOfProductPurchased;
	private long totalIncome;
	private long totalExpense;

	public long getSiNo() {
		return siNo;
	}

	public void setSiNo(long siNo) {
		this.siNo = siNo;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getDayOfPurchase() {
		return dayOfPurchase;
	}

	public void setDayOfPurchase(String dayOfPurchase) {
		this.dayOfPurchase = dayOfPurchase;
	}

	public long getNoOfProductPurchased() {
		return noOfProductPurchased;
	}

	public void setNoOfProductPurchased(long noOfProductPurchased) {
		this.noOfProductPurchased = noOfProductPurchased;
	}

	public long getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(long totalIncome) {
		this.totalIncome = totalIncome;
	}

	public long getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(long totalExpense) {
		this.totalExpense = totalExpense;
	}
}
