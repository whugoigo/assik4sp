package kz.aitu.assik4sp.controllers;

import kz.aitu.assik4sp.models.Activity;
import kz.aitu.assik4sp.models.User;
import kz.aitu.assik4sp.services.interfaces.UserServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserServiceInterface service;

    public UserController(UserServiceInterface service) {
        this.service = service;
    }

    @GetMapping("hello")
    public String hello(){
        return "Say Hello";
    }

    @GetMapping("/")
    public List<User> getAll(){
        return service.getAll();
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<User> getById(@PathVariable("user_id") int id){
        User user = service.getById(id);
        if(user==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);//404

        return new ResponseEntity<>(user, HttpStatus.OK);//200
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user){
        User createdUser = service.create(user);
        if(createdUser==null)
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
    @GetMapping ("/sname/{user_sname}")
    public List<User> getAllBySurname(@PathVariable("user_sname") String sname){
        return service.getBySurname(sname);
    }
    @GetMapping("/fname/{fname}")
    public List<User> getAllByFirstName(@PathVariable("fname") String fname){
        return service.getByFname(fname);
    }
    @GetMapping("/dateofbirth/{dateofbirth}")
    public List<User> getAllByDate(@PathVariable("dateofbirth") Date dateofbirth){
        return service.getByDateofbirth(dateofbirth);
    }

    @GetMapping("/height/{height}")
    public List<User> getAllByHeight(@PathVariable("height") int height){
        return service.getByHeight(height);
    }
    @GetMapping("/weight/{weight}")
    public List<User> getAllByWeight(@PathVariable("weight") int weight){
        return service.getByWeight(weight);
    }
    @GetMapping("/gender/{gender}")
    public List<User> getAllByGender(@PathVariable("gender") String gender){
        return service.getByGender(gender);
    }
}
