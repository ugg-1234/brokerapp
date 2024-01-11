package com.brokerapp.controller;

import com.brokerapp.payload.AdminHeaderPlanDto;
import com.brokerapp.service.AdminHeaderPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adminHeaderPlan")
public class AdminHeaderPlanController {
    @Autowired
    private AdminHeaderPlanService adminHeaderPlanService;
    @PostMapping
    public ResponseEntity<AdminHeaderPlanDto>createAdminHeaderPlan(@RequestBody AdminHeaderPlanDto adminHeaderPlanDto){
        AdminHeaderPlanDto dto = adminHeaderPlanService.createAdminHeaderPlan(adminHeaderPlanDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping
    public List<AdminHeaderPlanDto>getAllAdminHeaderPlans(){
        return adminHeaderPlanService.getAllAdminHeaderPlans();
    }
}
