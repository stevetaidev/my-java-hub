package MVCDemo;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> studentList;
    private StudentView view;

    // Constructor để khởi tạo danh sách và view
    public StudentController(StudentView view) {
        this.studentList = new ArrayList<>();
        this.view = view;
    }

    // Phương thức để thêm sinh viên mới vào danh sách
    public void addStudent(String name, int age, String address, String sex, String email, String country, String driverLicense) {
        Student student = new Student(name, age, address, sex, email, country, driverLicense);
        studentList.add(student);
    }

    // Phương thức để chỉnh sửa thông tin của một sinh viên trong danh sách
    public void editStudent(int index, String name, int age, String address, String sex, String email, String country, String driverLicense) {
        if (index >= 0 && index < studentList.size()) {
            Student student = studentList.get(index);
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);
            student.setSex(sex);
            student.setEmail(email);
            student.setCountry(country);
            student.setDriverLicense(driverLicense);
        }
    }

    // Phương thức để xóa một sinh viên khỏi danh sách
    public void deleteStudent(int index) {
        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
        }
    }

    // Phương thức để hiển thị danh sách sinh viên
    public void displayStudentList() {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            view.printStudentDetails("Student #" + (i + 1), student);
        }
    }
}
