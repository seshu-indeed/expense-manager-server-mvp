package com.smc.thebigocompany.expensemanager.dao.repository;

import com.smc.thebigocompany.expensemanager.dao.entity.Category;
import com.smc.thebigocompany.expensemanager.dao.entity.Expense;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ExpenseRepository {

    Expense createExpense(Expense expense);

    List<Expense> getAllExpenses();

    Category createCategory(Category category);

    List<Category> getAllCategories();

    Optional<Category> findCategoryByCode(String code);

}