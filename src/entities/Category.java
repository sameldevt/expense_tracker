package entities;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String title;
    private Double expenseLimit;
    private Double currentExpense;

    private List<SubCategory> subCategories = new ArrayList<>();

    public Category(String title, Double expenseLimit){
        this.title = title;
        this.expenseLimit = expenseLimit;
        currentExpense = 0.0;
    }

    public void addSubCategory(SubCategory subCategory){
        subCategories.add(subCategory);
        currentExpense += subCategory.getValue();
    }

    public void setExpenseLimit(double value){
        expenseLimit = value;
    }

    public List<SubCategory> getSubCategoryList(){
        return subCategories;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        if(currentExpense > expenseLimit){
            System.out.println("EXPENSE LIMIT EXCEEDED!");
            System.out.println("EXCEEDED VALUE: " + (expenseLimit - currentExpense));
        }
        return " * " + title + " - Expense limit: $" + expenseLimit +
                " - Current expense: $" + currentExpense;
    }
    public void setExpenseLimit(Double expenseLimit) {
        this.expenseLimit = expenseLimit;
    }
}
