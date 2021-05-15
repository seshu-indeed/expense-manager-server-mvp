package com.smc.thebigocompany.expensemanager.query;

import com.smc.thebigocompany.expensemanager.dao.entity.Category;
import com.smc.thebigocompany.expensemanager.dao.entity.Expense;
import com.smc.thebigocompany.expensemanager.service.ExpenseService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExpenseQuery implements GraphQLQueryResolver {

    private final ExpenseService expenseService;

    public ExpenseQuery(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public List<Expense> getExpenses() {
        return this.expenseService.getAllExpenses();
    }

    public List<Expense> getExpensesWithCode(String code) {
        List<Expense> expenses = getExpenses();

        List<Expense> shortListed = new ArrayList<>();
        for (Expense expense : expenses) {
            if (expense.getCategory().getCode().equalsIgnoreCase(code)) {
                shortListed.add(expense);
            }
        }

        return shortListed;
    }

}