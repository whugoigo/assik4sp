package kz.aitu.assik4sp.controllers;

import kz.aitu.assik4sp.models.Activity;
import kz.aitu.assik4sp.services.interfaces.ActivityServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.sql.Date;
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

    @GetMapping("/type/{type}")
    public List<Activity> getAllByType(@PathVariable("type") String type){
        return service.getByType(type);
    }
    @GetMapping("/date/{date}")
    public List<Activity> getAllByDate(@PathVariable("date")Date date){
        return service.getByDate(date);
    }
    @GetMapping("/duration/{duration}")
    public List<Activity> getAllByDuration(@PathVariable("duration")Time time){
        return service.getByDuration(time);
    }
    @GetMapping("/distance/{distance}")
    public List<Activity> getAllByDistance(@PathVariable("distance") double distance){
        return service.getByDistance(distance);
    }
    @GetMapping("/calories/{calories}")
    public List<Activity> getAllByCalories(@PathVariable("calories") int calories_burned){
        return service.getByCalories(calories_burned);
    }
    @GetMapping("/notes/{notes}")
    public List<Activity> getAllByNotes(@PathVariable("notes") String notes){
        return service.getByNotes(notes);
    }
}
