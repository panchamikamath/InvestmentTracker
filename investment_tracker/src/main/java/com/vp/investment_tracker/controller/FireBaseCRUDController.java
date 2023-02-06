package com.vp.investment_tracker.controller;

import com.vp.investment_tracker.model.User;
import com.vp.investment_tracker.service.FireBaseCRUDService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class FireBaseCRUDController {

    public FireBaseCRUDService fireBaseCRUDService;

    public FireBaseCRUDController(FireBaseCRUDService fireBaseCRUDService) {
        this.fireBaseCRUDService = fireBaseCRUDService;
    }

    @GetMapping("/getUser")
    public User getUserDetails(@RequestParam String documentID) throws ExecutionException, InterruptedException {
        return fireBaseCRUDService.getUserDetails(documentID);
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return fireBaseCRUDService.saveUserDetails(user);
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user) throws ExecutionException, InterruptedException {
        return fireBaseCRUDService.updateUserDetails(user);
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestParam String documentID) throws ExecutionException, InterruptedException {
        return fireBaseCRUDService.deleteUserDetails(documentID);
    }
}
