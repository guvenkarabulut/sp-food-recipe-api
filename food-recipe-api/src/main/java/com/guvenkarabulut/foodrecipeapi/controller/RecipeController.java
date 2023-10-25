package com.guvenkarabulut.foodrecipeapi.controller;

import com.guvenkarabulut.foodrecipeapi.dto.RecipeRequestDto;
import com.guvenkarabulut.foodrecipeapi.service.RecipeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${spring.food.recipe.api.basemapping}/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping
    public void createRecipe(@RequestBody RecipeRequestDto recipeRequestDto) {
        recipeService.createRecipe(recipeRequestDto);
    }
}
