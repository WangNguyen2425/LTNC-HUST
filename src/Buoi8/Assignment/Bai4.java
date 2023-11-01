package Buoi8.Assignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


// class employee
class Employee{
    private String lastName;
    private String firstName;
    private  String position;
    private Double salary;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                 lastName + " " + firstName +" " + position + " " + salary ;

    }
}

public class Bai4 {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/Salary.txt";
        ArrayList<Employee> listEmployee = new ArrayList<>();
        try ( BufferedReader input = new BufferedReader(new FileReader(filePath))
        ) {
            String line;
            while ((line = input.readLine()) != null){
                String [] information = line.split(" ");
                Employee employee = new Employee();
                employee.setLastName(information[0]);
                employee.setFirstName(information[1]);
                employee.setPosition(information[2]);
                employee.setSalary(Double.valueOf(information[3]));
                // add vào list
                listEmployee.add(employee);
            }
        }
        System.out.println("Danh sách nhân viên sắp xếp theo thứ tự tăng dần của lương là: ");
        Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               /* if(o1.getSalary() > o2.getSalary()){
                    return 1;
                }
                else if(o1.getSalary() < o2.getSalary()){
                    return -1;
                }
                else return 0;*/
                return o1.getSalary().compareTo(o2.getSalary());  // tương tự như câu lệnh trên
            }
        });

        // in ra màn hình
        for(Employee employee : listEmployee){
            System.out.println(employee.toString());
        }

        System.out.println("Danh sách nhân viên sắp xếp theo thứ tự giảm dần của lương là: ");
        Collections.reverse(listEmployee);

        // hoặc

       /* Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2     .getSalary());
            }
        }.reversed);  // reversed để sắp xếp theo thứ tự nghịch đảo lại*/
        // hoặc dùng
     /*     Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary().compareTo(o1.getSalary());
            }
        });*/
        for(Employee employee : listEmployee){
            System.out.println(employee.toString());
        }
    }
}
