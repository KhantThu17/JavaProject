package chapter3.array;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random r=new Random();
      int number=  r.nextInt(25);
        System.out.println(number);
    }
}
