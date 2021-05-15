package com.smc.thebigocompany.expensemanager.mutation;

import com.smc.thebigocompany.expensemanager.dao.entity.Expense;
import com.smc.thebigocompany.expensemanager.service.ExpenseService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class ExpenseMutation implements GraphQLMutationResolver {

    private final ExpenseService expenseService;

    public ExpenseMutation(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public Expense createExpense(final int amount, final String categoryCode) {
        return this.expenseService.createExpense(amount, categoryCode);
    }
}