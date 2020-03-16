package com.example.exam.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exam.model.UserBean;
import com.example.exam.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/user/{id}")
    public ResponseEntity < UserBean > getUserById(@PathVariable(value = "id") Long userId)
    throws ResourceNotFoundException {
        UserBean user = userRepo.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
        return ResponseEntity.ok().body(user);
    }
	
	
	@PostMapping("/user")
    public UserBean createUser(@RequestBody UserBean user) {
        return userRepo.save(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity < UserBean > updateUser(@PathVariable(value = "id") Long uId,
        @Valid @RequestBody UserBean userDetails) throws ResourceNotFoundException {
        UserBean user = userRepo.findById(uId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + uId));

        
        user.setF_Name(userDetails.getF_Name());
        user.setL_Name(userDetails.getL_Name());
        user.setEmail_Id(userDetails.getEmail_Id());
        user.setAddress(userDetails.getAddress());
        user.setMobile(userDetails.getMobile());
        
        final UserBean updatedUser = userRepo.save(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/user/{id}")
    public Map < String, Boolean > deleteUser(@PathVariable(value = "id") Long UserId)
    throws ResourceNotFoundException {
        UserBean user = userRepo.findById(UserId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));

        userRepo.delete(user);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
