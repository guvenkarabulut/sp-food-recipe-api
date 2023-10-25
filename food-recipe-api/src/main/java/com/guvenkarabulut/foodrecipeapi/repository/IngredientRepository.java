package com.guvenkarabulut.foodrecipeapi.repository;

import com.guvenkarabulut.foodrecipeapi.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
