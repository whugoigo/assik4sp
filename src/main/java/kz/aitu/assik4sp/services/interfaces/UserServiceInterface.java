package kz.aitu.assik4sp.services.interfaces;

import kz.aitu.assik4sp.models.User;

import java.sql.Date;
import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);
    List<User> getByFname(String fname);
    List<User> getByDateofbirth(Date date);
    List<User> getByHeight(int height);
    List<User> getByWeight(int weight);
    List<User> getByGender(String gender);
}
