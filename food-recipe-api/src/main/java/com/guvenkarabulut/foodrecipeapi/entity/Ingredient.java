package com.guvenkarabulut.foodrecipeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private float quantity;
    @Column(name = "unit")
    private String unit;

    public Ingredient() {
    }
    public Ingredient(String id, Recipe recipe, String name, float quantity, String unit) {
        this.id = id;
        this.recipe = recipe;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Ingredient(Recipe recipe, String name, float quantity, String unit) {
        this.id = "";
        this.recipe = recipe;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}