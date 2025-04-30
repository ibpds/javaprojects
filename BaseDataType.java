public class BaseDataType {
    public static void main(String [] args){
        byte a1 = 1; //1 byte = 8bits
        short a2 = 10; //2 bytes = 16bits
        int a3 = 100; //4 bytes = 32 bits 
        long a4 = 1000; //8 bytes = 64 bits


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        double b1 = 10.1; //8 bytes = 32 bits
        float b2 = 12.2f; // 4 bytes = 32 bits
        System.out.println(b1);
        System.out.println(b2);

        char c1 = 'a';
        System.out.println(c1);

        boolean d1 = true;
        boolean d2 = false;
        System.out.println(d1);
        System.out.println(d2);
    }
}
