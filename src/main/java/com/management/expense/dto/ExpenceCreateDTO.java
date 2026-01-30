package com.management.expense.dto;

import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ExpenceCreateDTO {

 private String category;

 @Positive(message = "Amount must be greater than 0")
 private BigDecimal amount;

 @PastOrPresent(message = "Expense date cannot be in the future")
 private LocalDateTime expenseDate;

 private String description;

 public String getCategory() {
	return category;
 }

 public void setCategory(String category) {
	this.category = category;
 }

 public BigDecimal getAmount() {
	return amount;
 }

 public void setAmount(BigDecimal amount) {
	this.amount = amount;
 }

 public LocalDateTime getExpenseDate() {
	return expenseDate;
 }

 public void setExpenseDate(LocalDateTime expenseDate) {
	this.expenseDate = expenseDate;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }
}
