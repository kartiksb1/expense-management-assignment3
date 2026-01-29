package com.management.expense.repository;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.expense.dto.ExpenseViewDTO;
import com.management.expense.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

	Collection<ExpenseViewDTO> findByExpenseDateBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

}
