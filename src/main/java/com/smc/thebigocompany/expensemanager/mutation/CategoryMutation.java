package com.smc.thebigocompany.expensemanager.mutation;

import com.smc.thebigocompany.expensemanager.dao.entity.Category;
import com.smc.thebigocompany.expensemanager.service.ExpenseService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class CategoryMutation implements GraphQLMutationResolver {

    private final ExpenseService expenseService;

    public CategoryMutation(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public Category createCategory(final String code, final String definition) {
        return this.expenseService.createCategory(code, definition);
    }
}