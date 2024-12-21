package se.lexicon;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                          /* Comparison operators */
        // an expression is a piece of code that give us a value
        // == != <= >= are comparison operators that gives us an expression with a boolean value
        int x = 1;
        int y = 2 ;
        System.out.println( x == y);
        //------------------------------------------------------------------------------------------------------
                           /* Logical operators */
        // we use logical operators when we want to combine multiple boolean expression
        int temperature = 12;
        boolean isWarm = temperature < 20 && temperature > 30;// && = and
        System.out.println(isWarm);
        // java will start reading from left to right , and if the first statement is wrong it will ignore the rest
        // || = or , java will read from left to right but java here will continue reading if the first expression is wrong
        // we can combine both && and || in one expression
        //---------------------------------------------------------------------------------------------------------
                          /* if statement */
        // we use if statement to create a contains to run a a block of code
        int temp = 32;
        if (temp >30){ //  we put the condition inside the ()
            System.out.println("hot day!"); // if we have many lines of code to execute we use {}
            System.out.println("drink water!");
        }
        else if(temp > 20) // we use else if when we want to add other conditions
            System.out.println("beautifull day");
        else // else means anything else = any other condition
            System.out.println("cold day");
        //---------------------------------------------------------------------------------------------
        // we cant declare a variable inside an if statement without putting it in a block {}
        // whatever declared inside a scope of a block is not accessible from the outside
        int income = 12_000;
        if (income>100_000){
            boolean hasHighIncome = true;
            System.out.println(hasHighIncome);
        }
        /*System.out.println(hasHighIncome);*/ //cant access the variable from outside
        int inCome1 = 12000;
        //String className ;
        /*if (income>100_000)
            className = " First";
        else
            className = " Economy";*/
        String className = (inCome1 >100_000) ? "First" : "Economy";
        // this is called the ternary operator where () = condition, ? = result, : = else
    //-------------------------------------------------------------------------------------------------------------
                                      /* Switch statement */

        // switch is an alternative of if/statement
        //used when you are comparing a single variable or expression against multiple possible constant values (e.g., integers, strings, or enums).
        int role = 1;
        switch (role) {
            case 1 :   // here we're basically saying if role = 1
                System.out.println("hi");
                break; // we use breaks to jump out of the block and not execute other cases
            case 2 :
                System.out.println("yo!");
                break;
            default: // default is like else in if statement
                System.out.println("bye"); // we don't need a break after default
        }
        // ----------------------------------------------------------------------------------------------------------
                                           /* For loop */
        // we use for loop when we know how many times we want to repeat our code
        for (int i = 0; i < 5; i++) {
            System.out.println("holla" + i);
            System.out.println("--------------");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("holla" + i);
            System.out.println("--------------");
        }
        for (int i = 5; i > 1; i--) {
            System.out.println("holla" + i);
            System.out.println("--------------");
        }
        // these are different variation of how to use a for loop
                                           /* while loop */
        // we use while loops when we don't know how many times the code will be executed
        // while loops often combined with a boolean expression
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){ // we use .equals when comparing strings and not == or !=
            System.out.println("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        // a break statement terminates the loop while continue statement moves control to the beginning of the loop

                                        /* do while loop */
        // same as while loop but the code will be executed at least once
        // not commonly used but good to know
        do {
            System.out.println("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));
                                     /* for each loop */
        // we use it to irritate throw arrays or collections
        // the for each loop irritate forward only so we cant irritate backwards
        // we cant access the index of each value
        String [] fruits = {"Apple","Mango","Orange"};
        for (String fruit : fruits)   // (first we put the type of array , then name of element , then name of an array)
            System.out.println(fruit);
    }
}