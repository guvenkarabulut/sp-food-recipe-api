package com.guvenkarabulut.foodrecipeapi.controller;

import com.guvenkarabulut.foodrecipeapi.dto.IngredientDto;
import com.guvenkarabulut.foodrecipeapi.service.IngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${spring.food.recipe.api.basemapping}/ingredients")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @GetMapping("/{id}")
    public IngredientDto getIngredientById(@PathVariable String id) {
        return ingredientService.getIngredientById(id);
    }
    @PostMapping
    public IngredientDto createIngredient(@RequestBody IngredientDto ingredientDto) {
        return ingredientService.createIngredient(ingredientDto);
    }
}
