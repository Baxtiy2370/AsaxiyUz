package uz.b.asaxiyuz.controller;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @PostMapping("/create")
    public HttpEntity<?> create(){
        return null;
    }
    @PutMapping("/update")
    public HttpEntity<?> update(){
        return null;
    }
    @DeleteMapping("/deleteThemselves/{id}")
    public HttpEntity<?> deleteThemselves(@PathVariable UUID id){
        return null;
    }
    @DeleteMapping("/delete/{id}")
    public HttpEntity<?> delete(@PathVariable UUID id){
        return null;
    }

    @GetMapping("/get/{id}")
    public HttpEntity<?> getOneUser(@PathVariable String id){
        return null;
    }
    @GetMapping("/getAll")
    public HttpEntity<?> getAllUsers(){
        return null;
    }

}
