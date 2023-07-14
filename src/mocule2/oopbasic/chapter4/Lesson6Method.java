package mocule2.oopbasic.chapter4;

public class Lesson6Method {
    void show() {
        System.out.println("This is Show Method");
    }
    static void display(){
        System.out.println("This is Display Method");
    }

    public static void main(String[] args) {
        Lesson6Method Method=new Lesson6Method();
        Method.show();
        display();
    }
}
