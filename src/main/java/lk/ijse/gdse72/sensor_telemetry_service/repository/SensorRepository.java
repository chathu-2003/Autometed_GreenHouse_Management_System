package lk.ijse.gdse72.sensor_telemetry_service.repository;

import lk.ijse.gdse72.sensor_telemetry_service.entity.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<SensorData, Long> {
}