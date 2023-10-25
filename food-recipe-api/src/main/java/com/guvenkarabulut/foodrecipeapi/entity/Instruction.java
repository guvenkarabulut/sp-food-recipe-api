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

    public Instruction() {
    }

    public Instruction(String id, int step, String description) {
        this.id = id;
        this.step = step;
        this.description = description;
    }

    public Instruction(int step, String description) {
        this.id = "";
        this.step = step;
        this.description = description;
    }
}