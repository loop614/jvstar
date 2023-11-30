package com.loop614.jvstar.rating.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "RATING")
public class Rating {
    @Id
    @SequenceGenerator(name = "rating_id", sequenceName = "rating_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rating_id")
    private int id;
    private Double value;
    private String userId;
    private String customerId;
    private String objectId;

    public Rating() {
    }

    public Rating(Double value, String userId, String customerId, String objectId) {
        this.value = value;
        this.userId = userId;
        this.customerId = customerId;
        this.objectId = objectId;
    }

    public int getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
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
