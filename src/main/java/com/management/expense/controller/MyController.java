package com.management.expense.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.management.expense.dto.ExpenceCreateDTO;
import com.management.expense.dto.ExpenseViewDTO;
import com.management.expense.service.ExpenseServices;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/expenses")
public class MyController {
	private final ExpenseServices expenseServices;
	MyController(ExpenseServices expenseServises){
		this.expenseServices=expenseServises;
	}

	@PostMapping
	public String addExpenses(@Valid @RequestBody ExpenceCreateDTO dto ) {
		return expenseServices.addExpense(dto);
	}
	
	@GetMapping
    public List<ExpenseViewDTO> getExpenses(
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate) {
        return expenseServices.getExpenses(startDate, endDate);
    }
	
	 @DeleteMapping("/{id}")
	    public void deleteExpense(@PathVariable Long id) {
	        expenseServices.deleteExpense(id);
	    }
}
