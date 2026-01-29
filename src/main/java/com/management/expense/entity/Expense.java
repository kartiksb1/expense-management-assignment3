package com.management.expense.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="expenses")
public class Expense {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="expense_id")
private Long id;

@Column(nullable = false)
private String category;

@Positive
@Column(nullable = false)
private BigDecimal amount;

@PastOrPresent
@Column(nullable=false)
private LocalDateTime expenseDate;

private String description;

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
