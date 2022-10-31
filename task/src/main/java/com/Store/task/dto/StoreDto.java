package com.Store.task.dto;

import java.time.LocalDate;

public class StoreDto {

	private LocalDate dateOfPurchase;
	private String dayOfPurchase;
	private long noOfProductPurchased;
	private long totalIncome;
	private long totalExpense;

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
