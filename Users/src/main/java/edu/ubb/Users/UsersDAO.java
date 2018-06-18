package edu.ubb.Users;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersDAO
{

    private static List<UsersModel> users = new ArrayList<>();
    static {
        users.add(new UsersModel(1, "Kiss Andras", "Horea nr. 10", "kis.andras@yahoo.com"));
        users.add(new UsersModel(2, "Nagy Kinga", "Babes nr. 23", "nagy@kinga@yahoo.com"));
        users.add(new UsersModel(3, "Fodor Anna", "Craiova nr 34", "fodor@anna@gmail.com"));
        users.add(new UsersModel(4, "Pop Marci", "Dorobantilor nr. 22", "pop.marci@gmail.com"));
    }


    public List<UsersModel> getAll() {
        return users;
    }

    public UsersModel getModelById (int id) {
        for (UsersModel model :users) {
            if (model.getId() == id) return model;
        }
        return null;
    }

    public void createNewModel (UsersModel model) {
        users.add(model);
    }
}