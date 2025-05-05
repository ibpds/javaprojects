class Calculadora {
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
}
public class Calculator {
   public static void main(String[] args){
    Calculadora cal = new Calculadora();
    
    int result = cal.add(4,2);
    System.out. println(result);

    result = cal.sub(8,3);
    System.out. println(result);

    result = cal.multiply(6, 8);
    System.out. println(result);

    result = cal.divide(10, 2);
    System.out. println(result);
}
}