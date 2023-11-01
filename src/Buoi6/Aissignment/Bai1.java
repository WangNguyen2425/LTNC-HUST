package Buoi6.Aissignment;

import java.util.Date;

/**
@author Nguyễn Việt Hoàng 20192874
 */
class Person{
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
// Class con của lớp Person
class Student extends Person{

    private int status;
    /**
     * status rơi vào một trong 4 trường hợp sau:
     * 1=freshman,
     * 2=sophomore,
     * 3=junior,
     * 4= senior
     */
    public Student() {
    }

    public Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String statusStr = null;
        if(status == 1){
            statusStr = "freshman";
        }else if (status == 2 ){
            statusStr = "sophomore";
        } else if (status == 3) {
            statusStr = "junior";
        }
        else {
            statusStr = "senior";
        }
        return "Student{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", status= '" + statusStr + '\'' +
                '}';
    }
}

class Employee extends Person{
    private String office;
    private double salary;
    private Date startDate;

    public Employee() {
    }

    public Employee(String office, double salary, Date startDate) {
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, Date startDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                "office='" + office + '\'' +
                ", salary=" + salary + " vnđ"+
                ", startDate=" + startDate +
                '}';
    }
}
// class con của lớp Employee
class Lecturer extends Employee {
    private double officeHours;
    private String title;

    public Lecturer() {
    }

    public Lecturer(double officeHours, String title) {
        this.officeHours = officeHours;
        this.title = title;
    }

    public Lecturer(String name, String address, String phoneNumber, String email, String office, double salary, Date startDate, double officeHours, String title) {
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.officeHours = officeHours;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                " office='" + this.getOffice() + '\'' +
                ", salary=" + this.getSalary() + " vnđ"+
                ", startDate=" + this.getStartDate().toString() +
                ", officeHours=" + officeHours +
                ", title='" + title + '\'' +
                '}';
    }
}

class Staff extends Employee{
    private String rank;

    public Staff() {
    }

    public Staff(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", office='" + this.getOffice() + '\'' +
                ", salary=" + this.getSalary() + " vnđ"+
                ", startDate=" + this.getStartDate().toString() +
                '}';
    }
}
public class Bai1 {
    public static void main(String[] args) {
        // sử dụng lớp person
        Person p1 = new Person("Hoàng","Hưng Yên","0352110121","hoang.nv.2425@gmail.com");
        System.out.println("Thông tin của person 1 là: ");
        System.out.println(p1.toString());
        // sử dụng lớp Student
        Student student= new Student();
        student.setName("Nguyễn Việt Hoàng");
        student.setAddress("Tiên Lữ, Hưng Yên");
        student.setPhoneNumber("0972386534");
        student.setEmail("Hoang.nv192874@sis.hust.edu.vn");
        student.setStatus(3);
        System.out.println("Thông tin của student là: \n" + student.toString());
        // sử dụng lớp Employee
        Employee employee = new Employee("Nguyễn Thị Hường", "Hưng Yên", "0388180244",
                "huong.nt.1121@gmail.com","Viettel",20000000,new Date());
        System.out.println("Thông Tin của Employee: \n" + employee.toString());
        // sử dụng lớp Lecturer
        Lecturer lecturer = new Lecturer("Nguyễn Văn Vũ", "Hưng Yên", "0344066122",
                "vu.nv.53231@gmail.com","Trường ABC",19000000,new Date(),8,"TS.Vật Lý Nguyên Tử");
        System.out.println("Thông tin của lecturer: \n" + lecturer.toString());
        // sử dụng lớp staff
         Staff staff = new Staff();
         staff.setName("Nguyễn Đức Lực");
         staff.setOffice("Viettel");
         staff.setAddress("Hưng yên");
         staff.setEmail("Luc.nd.2124@gmail.com");
         staff.setPhoneNumber("0973555441");
         staff.setSalary(18000000);
         staff.setStartDate(new Date());
         staff.setRank("Leader Marketing");
        System.out.println("Thông tin của staff: \n " + staff.toString());

    }
}
