package Buoi7.learn;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class LearnFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/falco/Desktop/LapTrinhNangCao/src/Buoi7/learn/text.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.isFile());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        System.out.println(file.isAbsolute());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        /*Date date = new Date();
        date.setTime(file.lastModified());
        System.out.println(date.toString());*/
        System.out.println(new Date(file.lastModified()));

    }
}
