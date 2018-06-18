package edu.ubb.ProductList;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProductListController {
    @Autowired
    private ProductListDAO pDAO;

    @GetMapping(path="/termekek")
    public List<ProductListModel> getAll() {
        return pDAO.getAll();
    }

    @GetMapping(path="/termekek/{id}")
    public ProductListModel getModelById(@PathVariable int id) {
        return pDAO.getModelById(id);
    }

    @PostMapping(path="/termekek")
    public void create(@RequestBody ProductListModel termekekModel) {
        pDAO.createNewModel(termekekModel);
    }
}
