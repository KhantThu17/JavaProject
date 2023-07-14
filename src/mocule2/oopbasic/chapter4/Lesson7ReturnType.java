package mocule2.oopbasic.chapter4;

public class Lesson7ReturnType {
    static int sum(){
        int a=5;
        System.out.println(a);
        return 3;
    }
    static String name(){
        String b="koko";
        System.out.println(b);
        return "Khant";
    }
    public static void main(String[] args) {
       sum();
       name();
        System.out.println(sum());
        System.out.println(name());
    }
}
