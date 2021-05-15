package com.smc.thebigocompany.expensemanager.dao.repository;

import com.smc.thebigocompany.expensemanager.dao.entity.Action;
import com.smc.thebigocompany.expensemanager.dao.entity.Category;
import com.smc.thebigocompany.expensemanager.dao.entity.Expense;
import lombok.Synchronized;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.smc.thebigocompany.expensemanager.dao.entity.ActionType.*;

@Component
public class ExpenseRepositoryImplInMemory implements ExpenseRepository {

    private List<Expense> expenses = new ArrayList<>();
    private static long nextExpenseId=1;

    private List<Category> categories = new ArrayList<>();
    private static long nextCategoryId=1;

    @Override
    @Synchronized
    public Expense createExpense(Expense expense) {
        expense.setId(nextExpenseId++);
        expense.addAction(Action.builder().type(CREATE).build());

        expenses.add(expense);
        return expense;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    @Override
    @Synchronized
    public Category createCategory(Category category) {
        category.setId(nextCategoryId++);
        category.addAction(Action.builder().type(CREATE).build());

        categories.add(category);
        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Optional<Category> findCategoryByCode(String code) {
        return getAllCategories().stream().filter(category -> category.getCode().equalsIgnoreCase(code)).findFirst();
    }

}