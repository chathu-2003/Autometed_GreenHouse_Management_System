package lk.ijse.gdse72.crop_service.repositiory;

import lk.ijse.gdse72.crop_service.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}