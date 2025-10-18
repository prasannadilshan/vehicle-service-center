package com.example.vehicle_service_center.controller;

import com.example.vehicle_service_center.model.Vehicle;
import com.example.vehicle_service_center.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/allVehicles/")
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/year/{year}")
    public List<Vehicle> getVehicleByYear(@PathVariable int year) {
        return vehicleService.getVehicleByYear(year);
    }

    @PostMapping("/saveVehicle/")
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }
    @GetMapping("/type/{serviceId}")
    public String getVehicleTypeByServiceId(@PathVariable int serviceId) {
        return vehicleService.getVehicleTypeByServiceId(serviceId);
    }

    @DeleteMapping("/year/{year}")
    public void deleteVehicleByYear(@PathVariable int year) {
        vehicleService.deleteByServiceYear(year);
    }



}
