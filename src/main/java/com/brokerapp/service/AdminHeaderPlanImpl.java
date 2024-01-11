package com.brokerapp.service;

import com.brokerapp.entity.AdminHeaderPlan;
import com.brokerapp.payload.AdminHeaderPlanDto;
import com.brokerapp.repository.AdminHeaderPlanRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminHeaderPlanImpl implements AdminHeaderPlanService{

    private AdminHeaderPlanRepository adminHeaderPlanRepository;

    private ModelMapper modelMapper;

    public AdminHeaderPlanImpl(AdminHeaderPlanRepository adminHeaderPlanRepository, ModelMapper modelMapper) {
        this.adminHeaderPlanRepository = adminHeaderPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public AdminHeaderPlanDto createAdminHeaderPlan(AdminHeaderPlanDto adminHeaderPlanDto) {
        AdminHeaderPlan adminHeaderPlan = mapToEntity(adminHeaderPlanDto);
        AdminHeaderPlan savedAdminHeaderPlan = adminHeaderPlanRepository.save(adminHeaderPlan);
        return mapToDto(savedAdminHeaderPlan);

    }

    @Override
    public List<AdminHeaderPlanDto> getAllAdminHeaderPlans() {
        List<AdminHeaderPlan> adminHeaderPlans = adminHeaderPlanRepository.findAll();
        List<AdminHeaderPlanDto> adminHeaderPlanDtos = adminHeaderPlans.stream().map(plan -> mapToDto(plan)).collect(Collectors.toList());
        return adminHeaderPlanDtos;
    }

    AdminHeaderPlan mapToEntity(AdminHeaderPlanDto adminHeaderPlanDto){
        AdminHeaderPlan adminHeaderPlan = modelMapper.map(adminHeaderPlanDto, AdminHeaderPlan.class);
        return adminHeaderPlan;
    }
    AdminHeaderPlanDto mapToDto(AdminHeaderPlan adminHeaderPlan){
        AdminHeaderPlanDto adminHeaderPlanDto = modelMapper.map(adminHeaderPlan, AdminHeaderPlanDto.class);
        return adminHeaderPlanDto;
    }
}
