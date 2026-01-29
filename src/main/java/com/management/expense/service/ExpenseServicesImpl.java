package com.management.expense.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.management.expense.dto.ExpenceCreateDTO;
import com.management.expense.dto.ExpenseViewDTO;
import com.management.expense.entity.Expense;
import com.management.expense.repository.ExpenseRepository;

@Service
public class ExpenseServicesImpl implements ExpenseServices {

    private final ExpenseRepository expenseRepository;

    public ExpenseServicesImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public String addExpense(ExpenceCreateDTO dto) {
        Expense expense = new Expense();
        expense.setCategory(dto.getCategory());
        expense.setAmount(dto.getAmount()); // BigDecimal
        expense.setExpenseDate(dto.getExpenseDate()); // LocalDateTime
        expense.setDescription(dto.getDescription());

        expenseRepository.save(expense);
        return "Expense added successfully";
    }

    @Override
    public List<ExpenseViewDTO> getExpenses(LocalDate startDate, LocalDate endDate) {

        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime endDateTime = endDate.atTime(23, 59, 59);

        return expenseRepository
                .findByExpenseDateBetween(startDateTime, endDateTime)
                .stream()
                .map(expense -> new ExpenseViewDTO(
                        expense.getId(),
                        expense.getCategory(),
                        expense.getAmount(),
                        expense.getExpenseDate(),
                        expense.getDescription()
                ))
                .toList();
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
