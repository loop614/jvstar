package com.loop614.jvstar.star.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STAR")
public class Star {
    @Id
    private int id;
    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    public Star(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Star Rating = (Star) o;

        return name.equals(Rating.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
