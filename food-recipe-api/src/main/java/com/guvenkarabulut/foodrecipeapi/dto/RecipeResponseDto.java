package com.guvenkarabulut.foodrecipeapi.dto;

import com.guvenkarabulut.foodrecipeapi.entity.Recipe;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link Recipe}
 */
public class RecipeResponseDto implements Serializable {
    private final String name;
    private final String description;
    private final Instant createdDate;
    private final Instant lastModifiedDate;
    private final List<IngredientDto> ingredients;

    public RecipeResponseDto(String name, String description, Instant createdDate, Instant lastModifiedDate, List<IngredientDto> ingredients) {
        this.name = name;
        this.description = description;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public List<IngredientDto> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeResponseDto entity = (RecipeResponseDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.createdDate, entity.createdDate) &&
                Objects.equals(this.lastModifiedDate, entity.lastModifiedDate) &&
                Objects.equals(this.ingredients, entity.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, createdDate, lastModifiedDate, ingredients);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "createdDate = " + createdDate + ", " +
                "lastModifiedDate = " + lastModifiedDate + ", " +
                "ingredients = " + ingredients + ")";
    }
}