package edu.ubb.ProductList;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component
public class ProductListDAO {

    private static List<ProductListModel> termekek = new ArrayList<>();
    static {
        termekek.add(new ProductListModel(1, "Igazi Csiki", 25));
        termekek.add(new ProductListModel(2, "Mezes Csiki", 30));
        termekek.add(new ProductListModel(3, "Afonyas Csiki", 45));
        termekek.add(new ProductListModel(4, "Szekelysor", 100));
    }


    public List<ProductListModel> getAll() {
        return termekek;
    }

    public ProductListModel getModelById (int id) {
        for (ProductListModel model :termekek) {
            if (model.getId() == id) return model;
        }
        return null;
    }

    public void createNewModel (ProductListModel model) {
        termekek.add(model);
    }
}
