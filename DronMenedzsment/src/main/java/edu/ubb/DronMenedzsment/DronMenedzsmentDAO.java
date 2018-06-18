package edu.ubb.DronMenedzsment;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class DronMenedzsmentDAO {

    private static List<DronMenedzsmentModel> dronMenedzsment = new ArrayList<>();
    static {
        dronMenedzsment.add(new DronMenedzsmentModel(1, "Csiki pityoka", 10, true));
        dronMenedzsment.add(new DronMenedzsmentModel(2, "Csiki male", 12, false));
        dronMenedzsment.add(new DronMenedzsmentModel(3, "Csiki sor", 21, true));
        dronMenedzsment.add(new DronMenedzsmentModel(4, "Csiki medve", 5,true));
    }


    public List<DronMenedzsmentModel> getAll() {
        return dronMenedzsment;
    }

    public DronMenedzsmentModel getModelById (int id) {
        for (DronMenedzsmentModel model :dronMenedzsment) {
            if (model.getId() == id) return model;
        }
        return null;
    }

    public void createNewModel (DronMenedzsmentModel model) {
        dronMenedzsment.add(model);
    }
}