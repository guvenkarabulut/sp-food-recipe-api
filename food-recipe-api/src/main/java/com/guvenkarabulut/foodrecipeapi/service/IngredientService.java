package com.guvenkarabulut.foodrecipeapi.service;

import com.guvenkarabulut.foodrecipeapi.dto.IngredientDto;

public interface IngredientService {
    IngredientDto getIngredientById(String id);

    IngredientDto createIngredient(IngredientDto ingredientDto);

}
