package com.loop614.jvstar.star.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "STAR")
public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private BigDecimal value;

    private Long count;

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

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
