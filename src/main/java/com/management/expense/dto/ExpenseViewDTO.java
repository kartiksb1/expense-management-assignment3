package com.management.expense.dto;

import java.time.LocalDate;
public class ExpenseViewDTO {

 private Long id;
 private String category;
 private double amount;
 private LocalDate expenseDate;
 private String description;

 public ExpenseViewDTO(Long id, String category, double amount,
                       LocalDate expenseDate, String description) {
     this.id = id;
     this.category = category;
     this.amount = amount;
     this.expenseDate = expenseDate;
     this.description = description;
 }

 public Long getId() {
	return id;
 }

 public void setId(Long id) {
	this.id = id;
 }

 public String getCategory() {
	return category;
 }

 public void setCategory(String category) {
	this.category = category;
 }

 public double getAmount() {
	return amount;
 }

 public void setAmount(double amount) {
	this.amount = amount;
 }

 public LocalDate getExpenseDate() {
	return expenseDate;
 }

 public void setExpenseDate(LocalDate expenseDate) {
	this.expenseDate = expenseDate;
 }

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }
}
