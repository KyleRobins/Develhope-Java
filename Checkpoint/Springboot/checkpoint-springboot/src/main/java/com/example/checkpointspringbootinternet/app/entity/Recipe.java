package com.example.checkpointspringbootinternet.app.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import java.util.List;
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private List <String> ingredients;
    private String instructions;
    //getters and setters

    public Recipe() {

    }

    public Recipe(String title, String description, List<String> ingredients, String instructions) {
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<String> getIngredients(){
        return ingredients;
    }

    public void setIngredients(List<String> ingredients){
        this.ingredients = ingredients;
    }

    public String getInstructions(){
        return instructions;
    }

    public void setInstructions(String instructions){
        this.instructions = instructions;
    }
}
