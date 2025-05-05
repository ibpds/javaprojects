public class ArithmeticOperator{
    public static int add(int d, int e){
        return d + e;
    }
    public static int sub(int d, int e){
        return d - e;
    }
    public static int multiply(int d, int e){
        return d * e;
    }
    public static int divide(int d, int e){
        return d / e;
    }
    public static void main(String[] args){
        int a  = 1;
        int b = 2;
        int c = 3;

        int result =  add(4,2);
        System.out.println(result);

        result =  sub(40,4);
        System.out.println(result);

        result =  multiply(40,4);
        System.out.println(result);

        result =  divide(40,4);
        System.out.println(result);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(c%b);
    };    
}