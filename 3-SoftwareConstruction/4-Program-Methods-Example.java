package com.uedge.lab9.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SafeWater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private float measuredWaterLevel;
    private float analyzeWater;
    private String provideRecommendation;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> user;

    public String checkWater(String requestor, String location) {
        String result = "";
        int waterQualityIndex = 4;
        float temperature = 19;

        if (location.length() > 20 || !requestor.matches("^[a-zA-Z\\s]+$") || requestor.isBlank()) {
            result = "Помилка авторизації";
        } else {
            result = "The city of Memphis today has excellent water quality. " +
                    "Index of Water Quality today is " + waterQualityIndex +
                    ". Temperature in the nearby water places is " + temperature + " C";
        }
        return result;
    }



    public SafeWater() {
    }

    public SafeWater(float measuredWaterLevel, float analyzeWater, String provideRecommendation, List<User> user) {
        this.measuredWaterLevel = measuredWaterLevel;
        this.analyzeWater = analyzeWater;
        this.provideRecommendation = provideRecommendation;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getMeasuredWaterLevel() {
        return measuredWaterLevel;
    }

    public void setMeasuredWaterLevel(float measuredWaterLevel) {
        this.measuredWaterLevel = measuredWaterLevel;
    }

    public float getAnalyzeWater() {
        return analyzeWater;
    }

    public void setAnalyzeWater(float analyzeWater) {
        this.analyzeWater = analyzeWater;
    }

    public String getProvideRecommendation() {
        return provideRecommendation;
    }

    public void setProvideRecommendation(String provideRecommendation) {
        this.provideRecommendation = provideRecommendation;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "SafeWater{" +
                "id=" + id +
                ", measuredWaterLevel=" + measuredWaterLevel +
                ", analyzeWater=" + analyzeWater +
                ", provideRecommendation='" + provideRecommendation + '\'' +
                ", user=" + user +
                '}';
    }
}
