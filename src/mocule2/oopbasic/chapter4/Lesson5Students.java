package mocule2.oopbasic.chapter4;

public class Lesson5Students {
    String studentname;
    String  ID;
    int age;
    static String SchoolName ="Code Code";
    public static void main(String[] args) {
        Lesson5Students Student1 = new Lesson5Students();
        Student1.studentname="Khant Thu";
        Student1.age = 21;
        Student1.ID = "CW1001";
        Student1.SchoolName="world code";
        System.out.println(Student1.SchoolName);
        Lesson5Students Student2 = new Lesson5Students();
        Student2.studentname="Khant Thu";
        Student2.age = 21;
        Student2.ID = "CW1001";
        System.out.println(Student2.SchoolName);
    }
}
