package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    private int age;
    private int jersey;
    private String city;

    public void setCity(String value) {
        city = value;
    }

    public void setName(String value) {
        name = value;
    }

    public void setAge(int value) {
        age = value;
    }

    public void setJersey(int value) {
        jersey = value;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getJersey() {
        return jersey;
    }

    public String getCity() {
        return city;
    }
}