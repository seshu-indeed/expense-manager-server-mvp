package com.smc.thebigocompany.expensemanager.query;

import com.smc.thebigocompany.expensemanager.dao.entity.Category;
import com.smc.thebigocompany.expensemanager.service.ExpenseService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryQuery implements GraphQLQueryResolver {

    private final ExpenseService expenseService;

    public CategoryQuery(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    public List<Category> getCategories() {
        return this.expenseService.getAllCategories();
    }

    public Category getCategory(String code) {
        List<Category> categories = getCategories();

        for (Category category : categories) {
            if (category.getCode().equalsIgnoreCase(code)) {
                return category;
            }
        }

        throw new RuntimeException("Cannot find Category code: '" + code + "'");
    }

}