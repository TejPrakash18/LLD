package builderdesignpattern.traditionalway;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().setId(01).setRollNo("BCA01").setName("Tej").setCourse("BCA")
                .setEmail("tej22upa@gmail.com").build();
        System.out.println(student);
        Student student1 = new Student.StudentBuilder().setId(01).setRollNo("BCA01").setName("Tej").setCourse("BCA")
                .setEmail("tej22upa@gmail.com").setPhoneNo("8171480579").setAddress("Iglas").build();
        System.out.println(student1);
    }
}
