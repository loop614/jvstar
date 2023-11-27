package com.loop614.jvstar.rating.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RATING")
public class Rating {
    @Id
    private int id;
    private String name;

    public Rating() {
    }

    public Rating(String name) {
        this.name = name;
    }

    public Rating(int id, String name) {
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

        Rating Rating = (Rating) o;

        return name.equals(Rating.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
