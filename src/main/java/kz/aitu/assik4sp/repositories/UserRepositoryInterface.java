package kz.aitu.assik4sp.repositories;
import java.util.List;
import kz.aitu.assik4sp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
    List<User> findBySname(String sname);
}
