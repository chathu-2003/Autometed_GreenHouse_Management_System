package lk.ijse.gdse72.sensor_telemetry_service.controller;

import lk.ijse.gdse72.sensor_telemetry_service.entity.SensorData;
import lk.ijse.gdse72.sensor_telemetry_service.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensor")
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping
    public SensorData save(@RequestBody SensorData data){
        return service.save(data);
    }

    @GetMapping
    public List<SensorData> getAll(){
        return service.getAll();
    }
}