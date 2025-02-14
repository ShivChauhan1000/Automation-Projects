public class Main {

    static String classLevelVar = "Hello this is class level variable";

    public static void main(String[] args){
        System.out.println(getText());
        System.out.println(getNumber(23));

        Calculator calc = new Calculator();
        System.out.println(calc.add(2,11));
        System.out.println(calc.subtract(12,10));
        System.out.println(calc.multiply(12,5));
        System.out.println(calc.divide(10,5));

        Greeting greeting = new Greeting();
        greeting.Hello();
    }

    public static void displayMessage(){
        String localMess = "Hello this is local variable message";
        System.out.println(localMess);
    }
    //Return Functions

    public static String getText(){
        return "Hello Shiv Chauhan";
    }
    public static int getNumber(int number){
        return number;
    }
}
