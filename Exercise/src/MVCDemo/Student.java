package MVCDemo;
public class Student {
    private String name;
    private int age;
    private String address;
    private String sex;
    private String email;
    private String country;
    private String driverLicense;

    // Constructor để khởi tạo đối tượng Student với các thông tin ban đầu
    public Student(String name, int age, String address, String sex, String email, String country, String driverLicense) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.email = email;
        this.country = country;
        this.driverLicense = driverLicense;
    }

    // Getter và Setter cho các trường dữ liệu
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}
