package chapter1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student student1 = new Student();
        student1.Name = "Cardo Dalisay";
        
        student1.id = 101;
        student1.age =26;
        student1.address = "Tanay Rizal";
        student1.grades = null; //no grades yet
        Student student2 = new Student();
        student2.Name = "Diwata Pares";
        student2.id = 102;
        student2.age =31;
        student2.address = "Pasay City";
        student2.grades = null;
        student2.setName("Hiwaga Pares");
        
/*
 * this
 * is
 * a 
 * multi-line comment
 */
        System.out.println(student1.Name);
        System.out.println(student2.Name);
        // System.out.println(args[2]);
        Random r = new Random();
        System.out.println(r.nextInt());
        int[] winningCombi = {1,2,3,4,5,6};
        Scanner input = new Scanner(System.in);
        System.out.println("Find your number: ");
        int num = input.nextInt();
        System.out.println(Arrays.binarySearch(winningCombi, num));
        //create and instance of a Toy class = Toy object

        /*   this
        *    is a
        * multiline 
        *comment
*/
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        System.out.println();
        ArrayList al = new ArrayList<>();
        Date date1 = new Date();
    }
}
/**
 * Student class creates an object where it has
 * Name, id, age,address, and grades
 */
class Student{
    String Name;
    int id;
    int age;
    String address;
    Grades[] grades;
    /**
     * this method sets the object name
     * @param Name
     */
    void setName(String Name){
        this.Name=Name;
    }
}
class Grades{
    int id;
    String subject;
    int rating;
}
/**
 * Plant class creates a Plant object
 * that has a property branch,name, and leaves
 */
class Plant{
    int branch;
    String name;
    int leaves;
    /**
     * setBranch modifies the number of leaves
     */
    void setBranch(int leaves){
        this.leaves=leaves;
    }
    int getBranch() {
        return branch;
    }
}