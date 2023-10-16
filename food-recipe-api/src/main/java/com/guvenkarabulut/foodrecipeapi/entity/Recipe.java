package com.guvenkarabulut.foodrecipeapi.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "ingredients")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipe")
    private List<Ingredient> ingredients;
    @Column(name = "instructions")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipe")
    private List<Instruction> instructions;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public Recipe() {
    }

    public Recipe(String id,
                  String title,
                  String description,
                  List<Ingredient> ingredients,
                  List<Instruction> instructions,
                  Date createdAt,
                  Date updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Recipe(String title,
                  String description,
                  List<Ingredient> ingredients,
                  List<Instruction> instructions,
                  Date createdAt,
                  Date updatedAt) {
        this.id = "";
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
