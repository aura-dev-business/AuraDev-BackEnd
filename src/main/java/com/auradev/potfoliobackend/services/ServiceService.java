package com.auradev.potfoliobackend.services;

import com.auradev.potfoliobackend.models.ServiceEntity;
import com.auradev.potfoliobackend.repositories.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    public ServiceEntity createService(ServiceEntity service) {
        return serviceRepository.save(service);
    }
}
