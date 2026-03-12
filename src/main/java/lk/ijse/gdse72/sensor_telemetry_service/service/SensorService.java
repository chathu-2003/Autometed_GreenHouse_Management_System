package lk.ijse.gdse72.sensor_telemetry_service.service;

import lk.ijse.gdse72.sensor_telemetry_service.entity.SensorData;
import lk.ijse.gdse72.sensor_telemetry_service.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repo;

    public SensorService(SensorRepository repo) {
        this.repo = repo;
    }

    public SensorData save(SensorData data) {
        return repo.save(data);
    }

    public List<SensorData> getAll() {
        return repo.findAll();
    }
}