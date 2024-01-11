package com.brokerapp.service;

import com.brokerapp.payload.AdminHeaderPlanDto;

import java.util.List;

public interface AdminHeaderPlanService {
    public AdminHeaderPlanDto createAdminHeaderPlan(AdminHeaderPlanDto adminHeaderPlanDto);

    List<AdminHeaderPlanDto> getAllAdminHeaderPlans();
}
