package kz.aitu.assik4sp.services;

import kz.aitu.assik4sp.models.Activity;
import kz.aitu.assik4sp.repositories.ActivityRepositoryInterface;
import kz.aitu.assik4sp.services.interfaces.ActivityServiceInterface;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

@Service
public class ActivityService implements ActivityServiceInterface {
    private final ActivityRepositoryInterface repo;

    public ActivityService(ActivityRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Activity> getAll() {
        return repo.findAll();
    }

    @Override
    public Activity getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Activity create(Activity activity) {
        return repo.save(activity);
    }

    @Override
    public List<Activity> getByType(String type) {
        return repo.findByType(type);
    }

    @Override
    public List<Activity> getByDate(Date date) {
        return repo.findByDate(date);
    }

    @Override
    public List<Activity> getByDuration(Time duration) {
        return repo.findByDuration(duration);
    }

    @Override
    public List<Activity> getByDistance(double distance) {
        return repo.findByDistance(distance);
    }

    @Override
    public List<Activity> getByCalories(int calories_burned) {
        return repo.findByCalories(calories_burned);
    }

    @Override
    public List<Activity> getByNotes(String notes) {
        return repo.findByNotes(notes);
    }


}
