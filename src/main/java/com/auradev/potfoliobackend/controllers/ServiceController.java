package com.auradev.potfoliobackend.controllers;

import com.auradev.potfoliobackend.models.ServiceEntity;
import com.auradev.potfoliobackend.services.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "https://www.auradev.in", allowCredentials = "true")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping
    public List<ServiceEntity> getAllServices() {
        return serviceService.getAllServices();
    }

    @PostMapping
    public ServiceEntity createService(@RequestBody ServiceEntity service) {
        return serviceService.createService(service);
    }

    @PutMapping("/{id}")
    public ServiceEntity updateService(@PathVariable Long id, @RequestBody ServiceEntity service) {
        return serviceService.updateService(id, service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }
}
