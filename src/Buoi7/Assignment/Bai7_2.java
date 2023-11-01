package Buoi7.Assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai7_2 {
    public static void main(String[] args) {
        String fileName = "Salary.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            double totalAssistantSalary = 0.0;
            double totalTeacherSalary = 0.0;
            double totalAssociateSalary = 0.0;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 4) {
                    String rank = parts[2];
                    double salary = Double.parseDouble(parts[3]);
                    if (rank.equals("assistant")) {
                        totalAssistantSalary += salary;
                    } else if (rank.equals("teacher")) {
                        totalTeacherSalary += salary;
                    } else if (rank.equals("associate")) {
                        totalAssociateSalary += salary;
                    }
                }
            }
            reader.close();
            // đinh dạng lại tổng lương bằng String.format("%,.0f", number)
            // Hiển thị tổng lương cho từng chức vụ
            System.out.println("Tổng lương cho chức vụ assistant: " + String.format("%,.0f", totalAssistantSalary));
            System.out.println("Tổng lương cho chức vụ teacher: " +String.format("%,.0f", totalTeacherSalary) );
            System.out.println("Tổng lương cho chức vụ associate: " +String.format("%,.0f", totalAssociateSalary));

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp dữ liệu: " + e.getMessage());
        }
    }
}
