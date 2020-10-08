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
        System.out.println("Subject 'Hindee' (out of 100)");
        float sub1 = scm.nextFloat();
        System.out.println("Subject 'English (out of 100)");
        float sub2 = scm.nextFloat();
        System.out.println("Subject 'Science (out of 100)");
        float sub3 = scm.nextFloat();
        System.out.println("Subject 'Computer' (out of 100)");
        float sub4 = scm.nextFloat();
        System.out.println("Subject 'Environment (out of 100)");
        float sub5 = scm.nextFloat();

        float marks = sub1+sub2+sub3+sub4+sub5; // first calculate all marks in a variable

        System.out.println("Total " + marks + " out of 500 " + " Total " + marks*.2  + "%");  // here calculate total marks and percentage also

        scm.close(); 
    }
}
// Programe Ends
