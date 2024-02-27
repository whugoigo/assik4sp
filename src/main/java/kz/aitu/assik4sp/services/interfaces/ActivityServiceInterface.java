package kz.aitu.assik4sp.services.interfaces;

import kz.aitu.assik4sp.models.Activity;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

public interface ActivityServiceInterface {
    List<Activity> getAll();
    Activity getById(int id);
    Activity create(Activity activity);
    List<Activity> getByType(String type);
    List<Activity> getByDate(Date date);
    List<Activity> getByDuration(Time time);
    List<Activity> getByDistance(double distance);
    List<Activity> getByCalories(int calories_burned);
    List<Activity> getByNotes(String notes);
}
