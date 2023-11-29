package MVCDemo;
public class StudentView {
    // Phương thức để hiển thị chi tiết của một sinh viên
    public void printStudentDetails(String studentName, Student student) {
        System.out.println(studentName + ": ");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Sex: " + student.getSex());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Country: " + student.getCountry());
        System.out.println("Driver License: " + student.getDriverLicense());
    }
}
