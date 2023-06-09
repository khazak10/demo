package com.test.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.test.demo.model.enums.PositionEnum;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private LocalDate birthDate;
    private PositionEnum position;

    public String getName() {
        return this.name;
    }

    public LocalDate getbirthDate() {
        return this.birthDate;
    }

    public long getId() {
        return this.id;
    }

    public PositionEnum getPosition() {
        return this.position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthdate) {
        this.birthDate = birthdate;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

}