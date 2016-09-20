package ru.javawebinar.topjava.dao;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Bitpunk on 17.09.16.
 */
public class MealDaoImpl implements MealDao{
    @Override
    public void addMeal(Meal meal) {

    }

    @Override
    public void deleteMeal(int mealId) {

    }

    @Override
    public void updateMeal(Meal meal) {

    }

    @Override
    public List<Meal> getAllMeals() {
        List<Meal> meals = Arrays.asList(
                new Meal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
                new Meal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
                new Meal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
                new Meal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new Meal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
                new Meal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510)
        );
        return meals;
    }

    @Override
    public Meal getMealById(int mealId) {
        return null;
    }
}
