package com.example.checkpointspringbootinternet.app.repository;
import com.example.checkpointspringbootinternet.app.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
