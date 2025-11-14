package chapter4;
import static java.util.Arrays.asList;
import java.util.Collection;

public class VarArgsLesson{
    int counter;
    static final int COUNTDOWN=10;
    public static float marsGravity = 3.72f;

    public int sumOfAllNums(int... y){
        int sum = 0;
        for(int num:y)
            sum+=num;
        return sum;
    }
    public int sumOfAllNums2(String h,int p,int... y){
        int sum = 0;
        System.out.println(h);
        for(int num:y)
            sum+=num;
        return sum;
    }
    public static float getEarthsGravity(){
        return 9.8f;
    }
    public static void main(String[] args) {
        VarArgsLesson vl = new VarArgsLesson();
        VarArgsLesson vl2 = new VarArgsLesson();
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(vl.sumOfAllNums(1,2,3,4,5,6,7,8,9,10));
        System.out.println(vl.sumOfAllNums(a));
        System.out.println(vl.sumOfAllNums2("Marc",1,2,3,4,5,6,7,8,9,10));
        System.out.println(getEarthsGravity());
        System.out.println(marsGravity);
        System.out.println(vl.marsGravity);
        // COUNTDOWN=100;
        vl.marsGravity =100;
        vl.counter=3;
        System.out.println(vl.marsGravity);
        System.out.println(vl.counter);
        System.out.println(vl2.marsGravity);
        System.out.println(vl2.counter);
        vl=null;
        // System.out.println(vl.counter);
        System.out.println(vl.marsGravity);
    }
}