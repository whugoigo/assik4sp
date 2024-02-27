package kz.aitu.assik4sp.services.interfaces;

import kz.aitu.assik4sp.models.Goal;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface GoalServiceInterface {
    List<Goal> getAll();
    Goal getById(int id);
    Goal create(Goal goal);
    List<Goal> getByType(String type);
    List<Goal> getByStartDate(Date StartDate);
    List<Goal> getByTargetValue(double TargetValue);
    List<Goal> getByDurationDays(int DurationDays);
    List<Goal> getByAchieved(boolean achieved);
}
