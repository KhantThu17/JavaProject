package mocule2.oopbasic;

public class ObjectEg1 {
    int b=5;
    static int c=7;
    public static void main(String[] args) {
        int a=3;
        System.out.println(c);
        ObjectEg1 d =new ObjectEg1();
        System.out.println(d.b);
    }
}
class AnotherClass{
    public static void main(String[] args) {
        System.out.println(ObjectEg1.c);

        ObjectEg1 d =new ObjectEg1();
        System.out.println(d.b);
    }
}
