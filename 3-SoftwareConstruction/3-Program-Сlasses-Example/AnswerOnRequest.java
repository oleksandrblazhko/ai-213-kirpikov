package com.uedge.lab9.model;

import jakarta.persistence.*;

@Entity
public class AnswerOnRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private float measuredAirLevel;

    private String answerTime;

    private String answerStatus;

    @ManyToOne
    @JoinColumn (name = "requestairquality_id")
    private RequestWaterLevel requestAirLevel;

    @ManyToOne
    @JoinColumn (name = "safeEcoBot_id")
    private SafeWater safeEcoBot;

    public AnswerOnRequest() {
    }


}