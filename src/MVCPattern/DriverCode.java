package MVCPattern;

public class DriverCode {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentModel db = retriveStudentFromDB();

        StudentController studentController = new StudentController(db, studentView);
        studentController.updateView();
        studentController.setStudentName("Neha");
        studentController.updateView();
    }

    public static StudentModel retriveStudentFromDB(){
        StudentModel student = new StudentModel();
        student.setRollNo("BCA001");
        student.setName("Tej Upadhyay");
        return student;
    }
}
