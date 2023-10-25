package com.guvenkarabulut.foodrecipeapi.dto;

import com.guvenkarabulut.foodrecipeapi.entity.Recipe;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Recipe}
 */
public class RecipeRequestDto implements Serializable {
    private final String name;
    private final String description;

    public RecipeRequestDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeRequestDto entity = (RecipeRequestDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.description, entity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ")";
    }
}