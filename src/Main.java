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

        System.out.println("EXPENSE TRACKER SYSTEM");

        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        System.out.println("1. Add category\n2. Add subcategory\n3. Set expense limit");

        switch (option){
            case 1 -> System.out.print("1");
            case 2 -> System.out.print("2");
            case 3 -> System.out.print("3");
            case 4 -> System.out.print("4");
        }
        System.out.println("Create expense category");


    }
}