package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class IngredientController {

    private List<Meal> meals = new ArrayList<>();

    // Exercise 1: Create a PutMapping to add a new meal
    @PostMapping("/meal")
    public void addMeal(@RequestBody Meal newMeal) {
        meals.add(newMeal);
    }

    // Exercise 2: Create a PostMapping to update a meal by name
    @PutMapping("/meal/{name}")
    public void updateMealByName(@PathVariable String name, @RequestBody Meal updatedMeal) {
        meals = meals.stream()
                .map(meal -> meal.getName().equals(name) ? updatedMeal : meal)
                .collect(Collectors.toList());
    }

    // Exercise 3: Create a DeleteMapping to delete a meal by name
    @DeleteMapping("/meal/{name}")
    public void deleteMealByName(@PathVariable String name) {
        meals.removeIf(meal -> meal.getName().equals(name));
    }

    // Exercise 4: Create a DeleteMapping to delete all meals above a certain price
    @DeleteMapping("/meal/price/{price}")
    public void deleteMealsAbovePrice(@PathVariable double price) {
        meals.removeIf(meal -> meal.getPrice() > price);
    }

    // Exercise 5: Create a PutMapping to update the price of a meal by name
    @PutMapping("/meal/{name}/price")
    public void updateMealPriceByName(@PathVariable String name, @RequestBody Double updatedPrice) {
        meals = meals.stream()
                .map(meal -> meal.getName().equals(name) ? new Meal(name, updatedPrice) : meal)
                .collect(Collectors.toList());
    }

    // Get all meals (for testing purposes)
    @GetMapping("/meals")
    public List<Meal> getAllMeals() {
        return meals;
    }

    // Model class for Meal
    static class Meal {
        private String name;
        private double price;

        public Meal(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
