package edu.ubb.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersDAO usersDAO;

    @GetMapping(path="/users")
    public List<UsersModel> getAll() {
        return usersDAO.getAll();
    }

    @GetMapping(path="/users/{id}")
    public UsersModel getModelById(@PathVariable int id) {
        return usersDAO.getModelById(id);
    }

    @PostMapping(path="/users")
    public void create(@RequestBody UsersModel usersModel) {
        usersDAO.createNewModel(usersModel);
    }

}
