package com.brokerapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="head_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdminHeaderPlan {

    @Id
    private long planId;
    @Column(name="plan_name",unique = true)
    private String planName;
    @Column(name="plan_validity")
    private String planValidity;
    @Column(name="price")
    private double price;
    @Column(name="relationship_manager")
    private Boolean relationshipManager;
    @Column(name="rental_agreement")

    private Boolean rentalAgreement;
    @Column(name="poperty_promotion")
    private Boolean popertyPromotion;
    @Column(name="guaranteed_tenants")
    private Boolean guaranteedTenants;
    @Column(name="showing_property")
    private Boolean showingProperty;
    @Column(name="facebook_marketing_of_property")
    private Boolean facebookMarketingOfProperty;


}
