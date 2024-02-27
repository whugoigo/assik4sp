package kz.aitu.assik4sp.services;

import kz.aitu.assik4sp.models.Goal;
import kz.aitu.assik4sp.repositories.GoalRepositoryInterface;
import kz.aitu.assik4sp.services.interfaces.GoalServiceInterface;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service

public class GoalService implements GoalServiceInterface {
    private final GoalRepositoryInterface repo;

    public GoalService(GoalRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Goal> getAll() {
        return repo.findAll();
    }

    @Override
    public Goal getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Goal create(Goal goal) {
        return repo.save(goal);
    }

    @Override
    public List<Goal> getByType(String type) {
        return repo.findByType(type);
    }

    @Override
    public List<Goal> getByStartDate(Date StartDate) {
        return repo.findByStartDate(StartDate);
    }

    @Override
    public List<Goal> getByTargetValue(double TargetValue) {
        return repo.findByTargetValue(TargetValue);
    }

    @Override
    public List<Goal> getByDurationDays(int DurationDays) {
        return repo.findByDurationDays(DurationDays);
    }

    @Override
    public List<Goal> getByAchieved(boolean achieved) {
        return repo.findByAchieved(achieved);
    }
}
