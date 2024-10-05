package com.codegym.repository;

import com.codegym.model.Expense;

import java.util.Optional;

public interface ExpenseService {
    Iterable<Expense> findAllByUserId(Long userId);
    Optional<Expense> findById(Long id);
    Expense save(Expense expense);
    void deleteById(Long id);
}