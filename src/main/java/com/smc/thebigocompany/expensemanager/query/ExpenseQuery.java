package com.smc.thebigocompany.expensemanager.query;

import com.smc.thebigocompany.expensemanager.dao.entity.Expense;
import com.smc.thebigocompany.expensemanager.service.ExpenseService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

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

}