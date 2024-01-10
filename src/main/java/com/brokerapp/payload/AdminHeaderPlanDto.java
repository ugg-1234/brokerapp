package com.brokerapp.payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdminHeaderPlanDto {


    private long planId;

    private String planName;

    private String planValidity;

    private double price;

    private Boolean relationshipManager;


    private Boolean rentalAgreement;

    private Boolean popertyPromotion;

    private Boolean guaranteedTenants;

    private Boolean showingProperty;

    private Boolean facebookMarketingOfProperty;


}
