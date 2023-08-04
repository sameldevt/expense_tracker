package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExpenseTracker {

    private static List<Category> categories = new ArrayList<>();

    public static void addCategory(Category category){
        categories.add(category);
    }

    public static List<Category> getCategories(){
        return categories;
    }

    public static Category chooseCategory(String categoryTitle){
        for(Category category : categories){
            if(Objects.equals(category.getTitle(), categoryTitle)){
                return category;
            }
        }
        throw new RuntimeException("a");
    }

    public static void printAllCategories(){
        for(Category category : categories){
            System.out.println(category);
            if(category.getSubCategoryList() != null){
                for(SubCategory subCategory : category.getSubCategoryList()){
                    System.out.println(subCategory);
                }
            }
        }
    }

    public static void printCurrentCategory(){

    }
}
