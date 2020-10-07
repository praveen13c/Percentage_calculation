// Code with Harry exercise 01 of calculation percentage from marks
// Coder - Praveen Singh Chauhan

// Programe Starts
package com.company;
import java.util.Scanner; // importing java utility Scanner module for input

public class exercise_01_marks_Calculation {
    public static void main(String[] args) {

        Scanner scm = new Scanner(System.in);  // making variable and store keyboard input
        // making a percentage calculator on the basis of 5 subjects marks
        System.out.println("Calculate Marks of Student ");
        System.out.println("Enter Marks of  ");
        System.out.println("Subject 01 (out of 100)");
        int sub1 = scm.nextInt();
        System.out.println("Subject 02 (out of 100)");
        int sub2 = scm.nextInt();
        System.out.println("Subject 03 (out of 100)");
        int sub3 = scm.nextInt();
        System.out.println("Subject 04 (out of 100)");
        int sub4 = scm.nextInt();
        System.out.println("Subject 05 (out of 100)");
        int sub5 = scm.nextInt();

        float marks = sub1+sub2+sub3+sub4+sub5; // first calculate all marks in a variable

        System.out.println("Total " + marks + " out of 500 " + " Total " + marks*.2  + "%");  // here calculate total marks and percentage also

        scm.close(); 
    }
}
// Programe Ends