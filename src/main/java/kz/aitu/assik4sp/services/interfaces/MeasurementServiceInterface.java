package kz.aitu.assik4sp.services.interfaces;

import kz.aitu.assik4sp.models.Measurement;

import java.sql.Date;
import java.util.List;

public interface MeasurementServiceInterface {
    List<Measurement> getAll();
    Measurement getById(int id);
    Measurement create(Measurement measurement);
    List<Measurement> getByType(String type);
    List<Measurement> getByDate(Date date);
    List<Measurement> getByValue(double value);
    List<Measurement> getByUnit(String unit);
}
