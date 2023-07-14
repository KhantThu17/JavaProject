package chapter3.array;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter the number_");
        int userinput=scn.nextInt();
        System.out.println(userinput);
        System.out.println("Enter your Name: ");
        String Input=scn.nextLine();
        System.out.println(Input);
    }
}
