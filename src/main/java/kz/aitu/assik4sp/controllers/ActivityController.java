package kz.aitu.assik4sp.controllers;

import kz.aitu.assik4sp.models.Activity;
import kz.aitu.assik4sp.services.interfaces.ActivityServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("activities")
public class ActivityController {
    private final ActivityServiceInterface service;

    public ActivityController(ActivityServiceInterface service) {
        this.service = service;
    }
    @GetMapping("/")
    public List<Activity> getAll(){
        return service.getAll();
    }
    @GetMapping("/{activityid}")
    public ResponseEntity<Activity> getbyId(@PathVariable("activityid") int id){
        Activity activity = service.getById(id);
        if(activity==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(activity, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Activity> create(@RequestBody Activity activity){
        Activity createdActivity = service.create(activity);
        if(createdActivity==null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(createdActivity, HttpStatus.CREATED);
    }

    @GetMapping("/type/{activity_type}")
    public List<Activity> getAllByType(@PathVariable("activity_type") String type){
        return service.getByType(type);
    }
    @GetMapping("/date/{activity_date}")
    public List<Activity> getAllByDate(@PathVariable("activity_date")Date date){
        return service.getByDate(date);
    }
    @GetMapping("/duration/{activity_duration}")
    public List<Activity> getAllByDuraion(@PathVariable("activity_duration")Time time){
        return service.getByDuration(time);
    }
    @GetMapping("/distance/{activity_distance}")
    public List<Activity> getAllByDistance(@PathVariable("activity_distance") double distance){
        return service.getByDistance(distance);
    }
    @GetMapping("/calories_burned/{activity_calories}")
    public List<Activity> getAllByCalories(@PathVariable("calories_burned") int calories_burned){
        return service.getByCalories(calories_burned);
    }
    @GetMapping("/notes/{activity_notes}")
    public List<Activity> getAllByNotes(@PathVariable("activity_notes") String notes){
        return service.getByType(notes);
    }
}
