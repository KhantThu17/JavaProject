package chapter3.array;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
//        System.out.println("please enter number: ");
//        int userinput= snc.nextInt();
//        if (userinput%2 ==0){
//            System.out.println(userinput+"is even number");}
//        else{
//            while(userinput!=0){
//                Scanner scan = new Scanner(System.in);
//                System.out.println("enter number again");
//                userinput=scan.nextInt();
//            }
//            System.out.println(userinput+"is odd number");
//        }
        while (true) {
            System.out.println("Ender the number=");
            int Input = snc.nextInt();
            if (Input % 2 == 0) {
                System.out.println(Input + "is even number");
                break;
            } else {
                System.out.println(Input + "is odd number");
            }
        }

    }
}
