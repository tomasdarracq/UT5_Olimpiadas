package com.ucu.olimpiadas.Repository;

import com.ucu.olimpiadas.Model.Category.ICategory;
import java.util.List;
import java.util.ArrayList;
public class CategoryRepository {

    private static CategoryRepository instance = null;
    private List<ICategory> categories;

    private CategoryRepository() {
        categories = new ArrayList<>();
    }

    public static CategoryRepository getInstance() {
        if (instance == null) {
            instance = new CategoryRepository();
        }
        return instance;
    }

    public void addCategory(ICategory category) {
        categories.add(category);
    }

    public List<ICategory> getCategories() {
        return categories;
    }

    public ICategory getCategoryByName(String name) {
        for (ICategory category : categories) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;
    }


}
