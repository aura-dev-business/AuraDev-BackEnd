package com.auradev.potfoliobackend.repositories;

import com.auradev.potfoliobackend.models.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
