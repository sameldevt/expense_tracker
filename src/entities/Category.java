package entities;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String title;
    private List<SubCategory> subCategories = new ArrayList<>();

    public Category(String title){
        this.title = title;
    }

    public void addSubCategory(SubCategory subCategory){
        subCategories.add(subCategory);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
