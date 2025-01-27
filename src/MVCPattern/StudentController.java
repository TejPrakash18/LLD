package MVCPattern;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    StudentController(StudentModel model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);

    }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public String getStudnetName(){
        return model.getName();
    }
    public void updateView(){
        view.PrintStudentDetails(model.getName(), model.getRollNo());
    }

}
