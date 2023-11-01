package Buoi9.Learn;


import java.util.Collections;

public class LearnGeneric {
    public static void main(String[] args) {
      Integer [] a = {1,2,3};
      LearnGeneric.<Integer>print(a);
        
    }
    public static <E> void print(E [] list){
        for(int i = 0 ; i < list.length; i ++){
            System.out.print(list[i] + " ");
        }
    }
}
