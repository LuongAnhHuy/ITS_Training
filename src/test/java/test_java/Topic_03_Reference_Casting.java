package test_java;

public class Topic_03_Reference_Casting {
    String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void showStudentName(){
        System.out.println("Student name = " + studentName);
    }
    public static void main(String[] args) {
        Topic_03_Reference_Casting firstStudent = new Topic_03_Reference_Casting();
        Topic_03_Reference_Casting secondStudent = new Topic_03_Reference_Casting();

        firstStudent.setStudentName("Nguyen Van A");
        secondStudent.setStudentName("Luong Anh B");

        firstStudent.showStudentName();
        secondStudent.showStudentName();

        // Ep kieu
        firstStudent = secondStudent;

        firstStudent.showStudentName();
        secondStudent.showStudentName();

        secondStudent.setStudentName("Do Thi Mai");

        firstStudent.showStudentName();
        secondStudent.showStudentName();


    }
}
