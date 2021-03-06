package com.smc.thebigocompany.expensemanager.dao.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@Builder
@EqualsAndHashCode
public class Expense extends ActionableEntity {
    private static final long serialVersionUID = 1L;

    long id;

    int amount;

    Category category;

    public String categoryCode() {
        return category.getCode();
    }

    public List<Action> actions() {
        return actions;
    }

}