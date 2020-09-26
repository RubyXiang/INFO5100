
/** 
* Assignment 2-1:
*/

import java.util.ArrayList;
import java.util.Comparator;

class Employee {
    String name;
    int age;
    Gender gender;
    double salary; // salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        this.name = name;
    }

}

enum Gender {
    MALE,
    FEMALE;
}

public class Assignment2_1 {
// Assignment

/**
 * Write a method to calculate the Social Security Tax of an employee and print it.
 * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
 * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
 */
public void socialSecurityTax(Employee employee) {
    double tax = 0;
    if(employee.salary <= 8900) {
        tax = 0.062 * employee.salary;
    }else{
        tax = 106800 * 0.062;
    }
    System.out.println(tax);
}

/**
 * Write a method to calculate an employee's contribution for insurance coverage and print it.
 * Amount of deduction is computed as follows:
 * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
 * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
 */
public void insuranceCoverage(Employee employee) {
    double coverage = 0;
    if(employee.age < 35) coverage = 0.03 * employee.salary;
    else if(employee.age < 50) coverage = 0.04 * employee.salary;
    else if(employee.age < 60) coverage = 0.05 * employee.salary;
    else coverage = 0.06 * employee.salary;
    System.out.println(coverage);
}

/**
 * Write a method to sort three employees' salary from low to high, and then print their name in order.
 * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
 * John Alice Jenny
 */
public void sortSalary(Employee e1, Employee e2, Employee e3) {
    ArrayList<Employee> employee = new ArrayList<>();
    employee.add(e1);
    employee.add(e2);
    employee.add(e3);
    employee.sort(Comparator.comparingDouble(e -> e.salary));

    for(Employee e : employee)
        System.out.println(e.getName());
}

/**
 * Write a method to raise an employee's salary to three times of his/her original salary.
 * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
 * Do not change the input of this method.
 * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
 */
public void tripleSalary(Employee employee) {
     employee.salary = employee.salary * raiseSalary(3.0);
}

public double raiseSalary(double byPercent){
    return byPercent;
}
//Extra credit

/**
 * I have written some code below. What I want is to swap two Employee objects.
 * One is Jenny and one is John. But after running it, I got the result below:
 * Before: a=Jenny
 * Before: b=John
 * After: a=Jenny
 * After: b=John
 * There is no change after swap()! Do you know the reason why my swap failed?
 * Write your understanding of the reason and explain it.
 */
 /*
  * In java, there is only value transfer, 
  * which means that the basic type passes the basic type itself, 
  * and the object passes the reference to the object, 
  * so the swap method just swaps the references of x and y, 
  * and does not change the corresponding value of the memory address.
  */
public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        }

public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        }
}

/**
 * Assignment 2-2:
 */

public class Assignment2-2 {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + Math.max(nums[i - 1], 0);
            sum = Math.max(sum, nums[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums;
        nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray.(nums);
    }
}
