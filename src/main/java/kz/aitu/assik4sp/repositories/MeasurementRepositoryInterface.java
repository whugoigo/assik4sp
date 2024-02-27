package kz.aitu.assik4sp.repositories;

import kz.aitu.assik4sp.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface MeasurementRepositoryInterface extends JpaRepository<Measurement, Integer> {
    List<Measurement> findByType(String type);
    List<Measurement> findByDate(Date date);
    List<Measurement> findByValue(double value);
    List<Measurement> findByUnit(String unit);
}
