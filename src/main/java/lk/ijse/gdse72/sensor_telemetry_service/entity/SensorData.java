package lk.ijse.gdse72.sensor_telemetry_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zone;

    private double temperature;

    private double humidity;

    private double soilMoisture;
}