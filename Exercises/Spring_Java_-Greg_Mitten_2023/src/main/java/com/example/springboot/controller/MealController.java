package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MealController {

    private List<Meal> meals = new ArrayList<>();

    // Exercise 1: Create a GetMapping that returns a list of meals
    @GetMapping("/meals")
    public List<Meal> getAllMeals() {
        return meals;
    }

    // Exercise 2: Create a GetMapping that returns a meal by name
    @GetMapping("/meal/{name}")
    public Meal getMealByName(@PathVariable String name) {
        return meals.stream()
                .filter(meal -> meal.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    // Exercise 3: Create a GetMapping that returns a meal by any word of description
    @GetMapping("/meal/description-match/{phrase}")
    public Meal getMealByDescription(@PathVariable String phrase) {
        return meals.stream()
                .filter(meal -> meal.getDescription().contains(phrase))
                .findFirst()
                .orElse(null);
    }

    // Exercise 4: Create a GetMapping that returns a meal by price range
    @GetMapping("/meal/price")
    public List<Meal> getMealsByPriceRange(@RequestParam double min, @RequestParam double max) {
        return meals.stream()
                .filter(meal -> meal.getPrice() >= min && meal.getPrice() <= max)
                .collect(Collectors.toList());
    }

    // Model class for Meal
    static class Meal {
        private String name;
        private String description;
        private double price;

        public Meal(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }
    }
}
