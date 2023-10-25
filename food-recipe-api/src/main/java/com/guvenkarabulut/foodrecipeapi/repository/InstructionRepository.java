package com.guvenkarabulut.foodrecipeapi.repository;

import com.guvenkarabulut.foodrecipeapi.entity.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionRepository extends JpaRepository<Instruction, String> {
}
