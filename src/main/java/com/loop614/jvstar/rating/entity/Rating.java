package com.loop614.jvstar.rating.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "RATING")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal value;

    private String userId;

    private String customerId;

    private String objectId;

    public Rating() {}

    public Rating(BigDecimal value, String userId, String customerId, String objectId) {
        this.value = value;
        this.userId = userId;
        this.customerId = customerId;
        this.objectId = objectId;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
}
