package com.codegym.service.impl;

import com.codegym.model.Expense;
import com.codegym.repository.ExpenseRepository;
import com.codegym.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public Iterable<Expense> findAllByUserId(Long userId) {
        // Implement this method to fetch expenses by userId if needed
        return expenseRepository.findAll();
    }

    @Override
    public Optional<Expense> findById(Long id) {
        return expenseRepository.findById(id);
    }

    @Override
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public void deleteById(Long id) {
        expenseRepository.deleteById(id);
    }
}