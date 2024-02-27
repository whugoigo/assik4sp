package kz.aitu.assik4sp.services;

import kz.aitu.assik4sp.models.Measurement;
import kz.aitu.assik4sp.repositories.MeasurementRepositoryInterface;
import kz.aitu.assik4sp.services.interfaces.MeasurementServiceInterface;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class MeasurementService implements MeasurementServiceInterface {

    private final MeasurementRepositoryInterface repo;

    public MeasurementService(MeasurementRepositoryInterface repo) {
        this.repo = repo;
    }


    @Override
    public List<Measurement> getAll() {
        return repo.findAll();
    }

    @Override
    public Measurement getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Measurement create(Measurement measurement) {
        return repo.save(measurement);
    }

    @Override
    public List<Measurement> getByType(String type) {
        return repo.findByType(type);
    }

    @Override
    public List<Measurement> getByDate(Date date) {
        return repo.findByDate(date);
    }

    @Override
    public List<Measurement> getByValue(double value) {
        return repo.findByValue(value);
    }

    @Override
    public List<Measurement> getByUnit(String unit) {
        return repo.findByUnit(unit);
    }
}
