package mocule2.oopbasic.chapter4;

import java.util.Scanner;

public class Lesson8ReturnIf {
    static String result(){
        Scanner scan =new Scanner(System.in);
        System.out.println("please ender number: ");
        int a = scan.nextInt();
        if (a%2==0){
            return "This is even number";
        }
        return "this is odd number";
    }
    public static void main(String[] args) {
        System.out.println(result());
    }
}
