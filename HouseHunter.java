import java.util.Scanner;

public class HouseHunter {



    static double addMonthlySavings(double current_savings, double annual_salary, double portion_saved){
        double monthly_return = (double) ((current_savings * 0.04) / 12);
        double newSavings = monthly_return + ((annual_salary / 12) * portion_saved);
        return newSavings;
    }


    static double getNumMonths(int months, double current_savings, double annual_salary, double total_cost, double portion_saved){
        current_savings = current_savings + addMonthlySavings(current_savings, annual_salary, portion_saved);
        months++;
        if(current_savings < total_cost){

            return getNumMonths(months, current_savings, annual_salary, total_cost, portion_saved);
        }
        else{
            return months;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double portion_down_payment = 0.25d;
        double current_savings = 0d;
        double r = 0.04d;
        int months = 0;

        System.out.println("Enter your annual salary: ");
        double annual_salary = sc.nextDouble();
        System.out.println("Enter the percent of your monthly income you will save: ");
        double portion_saved = sc.nextDouble();
        System.out.println("Enter the total cost of the home you wish to purchase: ");
        double total_cost = sc.nextDouble();
        total_cost = total_cost * 0.25;

        System.out.println(getNumMonths(months, current_savings, annual_salary, total_cost, portion_saved));

    }

}

