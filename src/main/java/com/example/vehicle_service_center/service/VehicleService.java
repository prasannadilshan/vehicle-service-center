package com.example.vehicle_service_center.service;

import com.example.vehicle_service_center.model.Vehicle;
import com.example.vehicle_service_center.repository.VehicleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    @Autowired
    private  VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicleByYear(int year) {
        return vehicleRepository.findByServiceYear(year);
    }

    public String getVehicleTypeByServiceId(long serviceId) {
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }

    @Transactional
    public void deleteByServiceYear(int serviceYear) {
        vehicleRepository.deleteByServiceYear(serviceYear);
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }
}
