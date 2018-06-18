package edu.ubb.DronMenedzsment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DronMenedzsmentController {


        @Autowired
        private DronMenedzsmentDAO dronmDAO;

        @GetMapping(path="/dronMenedzsment")
        public List<DronMenedzsmentModel> getAll() {
            return dronmDAO.getAll();
        }

        @GetMapping(path="/dronMenedzsment/{id}")
        public DronMenedzsmentModel getModelById(@PathVariable int id) {
            return dronmDAO.getModelById(id);
        }

        @PostMapping(path="/dronMenedzsment")
        public void create(@RequestBody DronMenedzsmentModel dronMenedzsmentModel) {
            dronmDAO.createNewModel(dronMenedzsmentModel);
        }

    }