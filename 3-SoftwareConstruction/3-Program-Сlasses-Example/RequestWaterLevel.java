package com.uedge.lab9.model;

import jakarta.persistence.*;

@Entity
public class RequestWaterLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String location;
    private String requestTime;
    private String requestStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public RequestWaterLevel() {
    }

    public RequestWaterLevel(String location, String requestTime, String requestStatus, User user) {
        this.location = location;
        this.requestTime = requestTime;
        this.requestStatus = requestStatus;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RequestWaterLevel{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", requestTime='" + requestTime + '\'' +
                ", requestStatus='" + requestStatus + '\'' +
                ", user=" + user +
                '}';
    }
}