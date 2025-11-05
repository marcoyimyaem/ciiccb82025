package chapter3;

public class ArrayLesson {
    public static void main(String[] args) {
        int [] i = new int[3];
        int[] numbers2 = new int[]{1,54,75,}; 
        int[] numbers3 = {1,54,75,};
        Student[] batch2 = {new Student(),new Student(),new Student(),new Student(),null,};
        for(int j = 0; j<numbers3.length;j++)
            System.out.println(numbers3[j]);
        // int[] table[];
        // table[row][col]
    }
}
class Student{
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;
}