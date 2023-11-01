package Buoi8.Assignment;

import java.io.*;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws IOException {
        ArrayList <String> arrayList = new ArrayList<>();
        try(  BufferedReader input = new BufferedReader(new FileReader("Assignment_7_bai1.txt"))){
            String line;
            while ((line = input.readLine()) != null ){
                    String [] words = line.split(" ");
                   arrayList.addAll(Arrays.asList(words));
            }
        }

        // Sắp xếp các từ theo thứ tự bảng chữ cái tăng dần
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println("Danh sách các từ theo thứ tự bảng chữ cái tăng dần:");
        System.out.println(arrayList);

        // Sắp xếp các từ theo thứ tự bảng chữ cái giảm dần
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        }.reversed());
        System.out.println("Danh sách các từ theo thứ tự bảng chữ cái tăng dần:");
        System.out.println(arrayList);
    }
}
