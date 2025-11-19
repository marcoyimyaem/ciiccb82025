package chapter4;
import java.util.*;
import java.util.function.Predicate;
public class LambdaLesson {

    static void print(List<Animal> animals,Predicate<Animal> checker){
        for(Animal animal: animals){
            if( checker.test(animal)){
                System.out.print(animal+", ");
            }
        }
        System.out.println("*************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("Kangaroo", true, false,5));
        animals.add(new Animal("Rabbit", true, false,2));
        animals.add(new Animal("Trutle", false, true,10));
        animals.add(new Animal("Frog", true, true,2));
        animals.add(new Animal("Kaola", false, false,6));
        // print(animals, new CheckIfHopper());
        // print(animals, new CheckIfSwimmer());
        print(animals, a->a.canSwim());
        print(animals, a->a.canHop());
        print(animals, a->(a.canHop() && a.canSwim()));
        print(animals, a->(!a.canHop() && !a.canSwim()));
        print(animals, a->a.getAge()>3);
        NumberInterface sum = (a,b)->a+b;
        NumberInterface dif = (a,b)->a-b;
        NumberInterface prod = (a,b)->a*b;
        NumberInterface qou = (a,b)->a/b;
        System.out.println(sum.aOperateB(4, 4));
        System.out.println(dif.aOperateB(4, 4));
        System.out.println(prod.aOperateB(4, 4));
        System.out.println(qou.aOperateB(4, 4));
        DiscountItem tenper = (x)->(x-(x*0.10));
        DiscountItem twentyper = (x)->(x-(x*0.20));
        DiscountItem fiftyper = (x)->(x-(x*0.50));
        int backKick = 10_000_000;
        System.out.println(tenper.dc(backKick));
        System.out.println(twentyper.dc(backKick));
        System.out.println(fiftyper.dc(backKick));
        System.out.println(animals);
        animals.removeIf(a->a.canHop());
        System.out.println(animals);
        
    }
    
}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String speciesName,boolean hopper,boolean swimmer,int age){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.age = age;
    }
    public boolean canHop(){ return canHop;}
    public boolean canSwim(){ return canSwim;}
    public int getAge(){ return age;}
    public String toString(){ return species;}
}


// interface CheckTrait{
//     boolean test(Animal a);
// }
// class CheckIfHopper implements CheckTrait{
//     public boolean test(Animal a){
//         return a.canHop();
//     }
// }
// class CheckIfSwimmer implements CheckTrait{
//     public boolean test(Animal a){
//         return a.canSwim();
//     }
// }
interface NumberInterface{
    int aOperateB(int a, int b);
}
interface DiscountItem{
    double dc(double c);
}