package com.loop614.jvstar.star.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STAR")
public class Star {
    @Id
    @SequenceGenerator(name = "star_id", sequenceName = "star_id", allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "star_id")
    private int id;
    private Double value;
    private Integer count;
    private String userId;
    private String objectId;

    public Star() {
    }

    public Star(String userId, String objectId) {
        this.userId = userId;
        this.objectId = objectId;
    }

    public int getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
