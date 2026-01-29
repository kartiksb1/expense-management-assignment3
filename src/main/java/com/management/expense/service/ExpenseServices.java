package com.management.expense.service;

import java.time.LocalDate;
import java.util.List;

import com.management.expense.dto.ExpenceCreateDTO;
import com.management.expense.dto.ExpenseViewDTO;

import jakarta.validation.Valid;

public interface ExpenseServices {

	String addExpense(@Valid ExpenceCreateDTO dto);

	List<ExpenseViewDTO> getExpenses(LocalDate startDate, LocalDate endDate);

	void deleteExpense(Long id);

}
