package com.guvenkarabulut.foodrecipeapi.repository;

import com.guvenkarabulut.foodrecipeapi.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, String> {
}
