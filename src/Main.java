import entities.Category;
import entities.ExpenseTracker;
import entities.SubCategory;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Expense Tracker:
    Complex Requirement: Allow users to create multiple expense categories and subcategories.
     Each subcategory can have its own budget limit, and the system should notify the user if they exceed the budget.
    Explanation: In addition to basic expenses, users can now create categories like "Food," "Transportation,"
     and "Entertainment." Under each category, they can define subcategories like "Restaurants" and "Groceries" under "Food."
     Users can set a budget for each subcategory, and the program should track expenses accordingly. When an expense pushes
     a subcategory over its budget, the system will notify the user.
*/
public class Main {
    public static void main(String[] args) {

        Category currentCategory = null;

        System.out.println("EXPENSE TRACKER SYSTEM");

        try(Scanner sc = new Scanner(System.in)){
            while(true) {
                if(currentCategory == null){
                    System.out.print("Enter category title: ");
                    String categoryTitle = sc.nextLine();

                    System.out.print("Enter category expense limit: ");
                    double categoryExpenseLimit = sc.nextDouble();

                    Category newCategory = new Category(categoryTitle, categoryExpenseLimit);
                    ExpenseTracker.addCategory(newCategory);
                    currentCategory = newCategory;
                }

                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(currentCategory);

                System.out.println(
                        "1. Add category" +
                        "\n2. Add subcategory" +
                        "\n3. Set category expense limit" +
                        "\n4. Choose category" +
                        "\n5. View all categories" +
                        "\n6. ");

                System.out.print("Choose an option: ");
                int option = sc.nextInt();
                sc.nextLine();


                switch (option) {
                    case 1 : {
                        System.out.print("Enter category title: ");
                        String categoryTitle = sc.nextLine();

                        System.out.print("Enter category expense limit: ");
                        double categoryExpenseLimit = sc.nextDouble();

                        Category newCategory = new Category(categoryTitle, categoryExpenseLimit);
                        ExpenseTracker.addCategory(newCategory);
                        currentCategory = newCategory;
                        break;
                    }
                    case 2 : {
                        System.out.print("Enter sub category title: ");
                        String subCategoryTitle = sc.nextLine();

                        System.out.print("Enter value: ");
                        double subCategoryExpenseLimit = sc.nextDouble();

                        currentCategory.addSubCategory(new SubCategory(subCategoryTitle, subCategoryExpenseLimit));
                        break;
                    }
                    case 3 : {
                        System.out.print("Enter new limit value: ");
                        double newLimit = sc.nextDouble();
                        currentCategory.setExpenseLimit(newLimit);
                        break;
                    }
                    case 4 : {
                        System.out.print("Enter category name: ");
                        String categoryName = sc.nextLine();
                        currentCategory = ExpenseTracker.chooseCategory(categoryName);
                        break;
                    }
                    case 5 : {
                        ExpenseTracker.printAllCategories();
                        break;
                    }
                }
            }
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
}