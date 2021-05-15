package com.smc.thebigocompany.expensemanager.dao.entity;

import java.util.List;

public interface CanPerformActions {

    List<Action> getActions();

    void addAction(Action action);

}