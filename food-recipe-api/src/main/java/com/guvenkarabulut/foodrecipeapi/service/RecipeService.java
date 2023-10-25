package com.guvenkarabulut.foodrecipeapi.service;

import com.guvenkarabulut.foodrecipeapi.dto.RecipeRequestDto;

public interface RecipeService {
    RecipeRequestDto getRecipeById(String id);

    RecipeRequestDto createRecipe(RecipeRequestDto recipeRequestDto);
}
