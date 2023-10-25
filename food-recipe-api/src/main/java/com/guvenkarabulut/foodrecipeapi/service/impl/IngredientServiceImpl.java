package com.guvenkarabulut.foodrecipeapi.service.impl;

import com.guvenkarabulut.foodrecipeapi.dto.IngredientDto;
import com.guvenkarabulut.foodrecipeapi.entity.Ingredient;
import com.guvenkarabulut.foodrecipeapi.entity.Recipe;
import com.guvenkarabulut.foodrecipeapi.repository.IngredientRepository;
import com.guvenkarabulut.foodrecipeapi.service.IngredientService;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public IngredientDto getIngredientById(String id) {
        Ingredient ingredient = findIngredientById(id);
        return IngredientDto.toDto(ingredient);
    }

    @Override
    public IngredientDto createIngredient(IngredientDto ingredientDto) {
        Ingredient ingredient = new Ingredient(
                ingredientDto.getName(),
                ingredientDto.getQuantity(),
                ingredientDto.getUnit()
        );
        return IngredientDto.toDto(ingredientRepository.save(ingredient));
    }

    private Ingredient findIngredientById(String id) {
        return ingredientRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Ingredient not found")
                );
    }
}
