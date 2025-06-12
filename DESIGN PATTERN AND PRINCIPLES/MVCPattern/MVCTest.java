package MVCPattern;

public class MVCTest {

    public static void main(String[] args) {
        Student student = new Student("INDRAYUDH", "22053513", "E");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        controller.setStudentName("INDRAKSHI");
        controller.setStudentGrade("B");
        controller.updateView();
    }
    
}
