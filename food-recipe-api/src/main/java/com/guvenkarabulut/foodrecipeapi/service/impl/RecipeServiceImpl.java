package com.guvenkarabulut.foodrecipeapi.service.impl;

import com.guvenkarabulut.foodrecipeapi.entity.Recipe;
import com.guvenkarabulut.foodrecipeapi.dto.RecipeRequestDto;
import com.guvenkarabulut.foodrecipeapi.repository.RecipeRepository;
import com.guvenkarabulut.foodrecipeapi.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public RecipeRequestDto getRecipeById(String id) {
        return null;
    }

    @Override
    public RecipeRequestDto createRecipe(RecipeRequestDto recipeRequestDto) {
        Recipe recipe = new Recipe();
        recipe.setName(recipeRequestDto.getName());
        recipe.setDescription(recipeRequestDto.getDescription());
        recipe.setCreatedDate(new Date().toInstant());
        recipeRepository.save(recipe);
        return null;
    }

    private Recipe findRecipeById(String id) {
        return recipeRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Recipe not found")
                );
    }
}
