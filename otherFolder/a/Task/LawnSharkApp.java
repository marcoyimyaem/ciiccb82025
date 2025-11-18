package otherFolder.a.Task;

public class LawnSharkApp {
    public static void main(String[] args) {
        Lawner user1 = new Lawner("Marc", "near SM Fairview", 44_000_000_000.00, 12);
        user1.setName("marco");
        // user1.name = "blue";
        System.out.println(user1.getName());
        user1.payLawnAmount(900_000_000);
        System.out.println(user1.getLawnAmount());
    }
    
}

class Lawner{
    private String name;
    private String address;
    private double lawnAmount;
    private float interest; 
    Lawner(String name, String address, double lawnAmount, float interest){
        this.name = (isStringValid(name))?name:null;
        this.address = (isStringValid(address))?address:null;
        this.lawnAmount =(isNumberValid(lawnAmount))?lawnAmount:0;
        this.interest =(isNumberValid(interest))?interest:0;
    }
    void setName(String name){ 
        if(isStringValid(name))
            this.name = name;
        else
            throw new RuntimeException("invalid length of characters in a string");
      
    }
    String getName(){
        return name;
    }
    
    void payLawnAmount(double payment){
        if(isNumberValid(payment))
            setLawnAmount(lawnAmount-payment);
        else
            throw new RuntimeException("invalid amount");
    }
    private boolean isNumberValid(double number) {
        return (number>=1)? true:false;
    }
    private boolean isStringValid(String text) {
        return (text.length()>=1)? true:false;
    }
    private void setLawnAmount(double lawnAmount){
        this.lawnAmount = lawnAmount;
    }
    double getLawnAmount(){
        return lawnAmount;
    }
}
