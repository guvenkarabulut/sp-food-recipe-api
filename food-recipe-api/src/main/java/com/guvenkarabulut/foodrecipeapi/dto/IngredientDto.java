package com.guvenkarabulut.foodrecipeapi.dto;

import com.guvenkarabulut.foodrecipeapi.entity.Ingredient;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Ingredient}
 */
public class IngredientDto implements Serializable {
    private final String name;
    private final float quantity;
    private final String unit;

    public IngredientDto(String name, float quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public static IngredientDto toDto(Ingredient ingredient) {
        return new IngredientDto(
                ingredient.getName(),
                ingredient.getQuantity(),
                ingredient.getUnit()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IngredientDto entity = (IngredientDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.quantity, entity.quantity) &&
                Objects.equals(this.unit, entity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity, unit);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "quantity = " + quantity + ", " +
                "unit = " + unit + ")";
    }
}