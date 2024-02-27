package kz.aitu.assik4sp.repositories;

import kz.aitu.assik4sp.models.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface GoalRepositoryInterface extends JpaRepository<Goal, Integer> {
    List<Goal> findByType(String type);
    List<Goal> findByStartDate(Date StartDate);
    List<Goal> findByTargetValue(double TargetValue);
    List<Goal> findByDurationDays(int DurationDays);
    List<Goal> findByAchieved(boolean achieved);
}
