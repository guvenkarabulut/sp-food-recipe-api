package com.guvenkarabulut.foodrecipeapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instruction")
public class Instruction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "step_number")
    private int step;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Instruction() {
    }

    public Instruction(String id, int step, String description, Recipe recipe) {
        this.id = id;
        this.step = step;
        this.description = description;
        this.recipe = recipe;
    }

    public Instruction(int step, String description, Recipe recipe) {
        this.id = "";
        this.step = step;
        this.description = description;
        this.recipe = recipe;
    }
}