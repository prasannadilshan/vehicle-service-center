package com.example.vehicle_service_center.repository;

import com.example.vehicle_service_center.model.Vehicle;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

    List<Vehicle> findByServiceYear(int serviceYear);

    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(long serviceId);

    void deleteByServiceYear(int serviceYear);

    List<Vehicle> findAll();
}
