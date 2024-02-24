package kz.aitu.assik4sp.services.interfaces;

import kz.aitu.assik4sp.models.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);
}
