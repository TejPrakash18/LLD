package prototypepattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(01, "BCA0120225","Tej", "Iglas");
        System.out.println(student);

        Student cloneObj = (Student) student.clone();
        System.out.println(cloneObj);

        // configure
        cloneObj = new Student(02, "BCA022025","Shukla","Noida");
        System.out.println(cloneObj);
    }
}
