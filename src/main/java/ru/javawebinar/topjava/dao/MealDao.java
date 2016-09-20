package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.Meal;

import java.util.List;

/**
 * Created by Bitpunk on 17.09.16.
 */
public interface MealDao {
    public void addMeal(Meal meal);
    public void deleteMeal(int mealId);
    public void updateMeal(Meal meal);
    public List<Meal> getAllMeals();
    public Meal getMealById(int mealId);
}
