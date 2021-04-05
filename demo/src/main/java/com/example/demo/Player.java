package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Player implements Comparable<Player> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int age;
    private int jersey;
    private String city;

    /**
     * @return the jersey
     */
    public int getJersey() {
        return jersey;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param jersey the jersey to set
     */
    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    @Override
    public int compareTo(Player o) {
       
        return  this.id - o.id;
    }
    @Override
    public String toString() {
        return id + " " + name + " age: " + age + " jersey: " + jersey  + " City: " + city+ "\n";
    }
}

