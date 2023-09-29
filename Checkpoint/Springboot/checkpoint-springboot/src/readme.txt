*Exercise: Building a RESTful API for a Recipe Management System with Spring Boot (30 minutes)**

**Objective**: Create a Spring Boot application for managing recipes with CRUD operations through RESTful endpoints.

**Step 1: Define the Recipe Entity**
1. Define a "Recipe" object as follows:

```java
public class Recipe {
    private Long id;
    private String title;
    private String description;
    private List<String> ingredients;
    private String instructions;
    // getters and setters
}
```

2. Create a `Recipe` entity class with JPA annotations, mapping it to a database table.

**Step 2: Create a Recipe Repository**
1. Create a repository interface, e.g., `RecipeRepository`, that extends `JpaRepository<Recipe, Long>`.
2. This repository will allow you to perform CRUD operations on `Recipe` entities.

**Step 3: Create a RESTful Controller**
1. Create a RESTful controller class, e.g., `RecipeController`.
2. Implement endpoints for the following operations using appropriate annotations:
   - Add a new recipe (POST request)
   - Retrieve a recipe by ID (GET request)
   - Retrieve all recipes (GET request)
   - Update recipe details (PUT request)
   - Delete a recipe by ID (DELETE request)

**Step 4: Test Your API**
1. Use tools like Postman or curl to test your API endpoints.
2. Test adding, retrieving, updating, and deleting recipes from the system.

**Optional Enhancements**:
- Add validation for recipe addition (e.g., title, ingredients, and instructions are required).
- Implement sorting and filtering of recipes based on attributes like title or ingredients.
- Add pagination to handle a large number of recipes.
- Explore Spring Boot's exception handling to improve error responses.


