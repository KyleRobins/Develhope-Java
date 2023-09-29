package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

class Meal {
    private String name;
    private double price;
    private String description;

    public Meal(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}

@RestController
public class MealController {

    @GetMapping("/meals")
    public List<Meal> getMeals() {
        return Arrays.asList(new Meal("Breakfast", 5.99, "Morning meal"),
                new Meal("Lunch", 10.99, "Afternoon meal"),
                new Meal("Dinner", 15.99, "Evening meal"));
    }

    @GetMapping("/meal/{name}")
    public Meal getMealByName(@PathVariable String name) {
        // Retrieve the meal by name from the database or any data source
        return new Meal(name, 10.99, "Description for " + name);
    }

    @GetMapping("/meal/description-match/{phrase}")
    public Meal getMealByDescription(@PathVariable String phrase) {
        // Retrieve the meal by description from the database or any data source
        return new Meal("Meal with description: " + phrase, 12.99, phrase);
    }

    @GetMapping("/meal/price")
    public List<Meal> getMealsByPriceRange(@RequestParam double min, @RequestParam double max) {
        // Retrieve meals within the specified price range from the database or any data source
        return Arrays.asList(new Meal("Breakfast", 5.99, "Morning meal"),
                new Meal("Lunch", 10.99, "Afternoon meal"));
    }
}
