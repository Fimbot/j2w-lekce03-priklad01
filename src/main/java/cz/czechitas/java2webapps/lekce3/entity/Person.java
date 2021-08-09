package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    String name;
    String surName;
    LocalDate birthDate;

    public Person() {
    }

    public Person(String name, String surName, LocalDate birthDate) {
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge(){
        Objects.requireNonNull(birthDate);

        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }
}
