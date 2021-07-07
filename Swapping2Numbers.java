public class Swapping2Numbers{
    public static void main(String[] args){
        int a=10, b=20;
        System.out.println("Before swapping values are.."+a+" "+b);
        //Logic 1 - Using third variable
        //int c=a;
        //a=b;
        //b=c;
        
        //Logic 2 - Using + and - without third variable
        //a=a+b;
        //b=a-b;
        //a=a-b;
        
        //Logic 3 - Using * and / without third variable 
        //a=a*b;
        //b=a/b;
        //a=a/b;
        
        //Logic 4 - Bitwise XOR(^)
        //a=a^b;
        //b=a^b;
        //a=a^b;
        
        //Logic 5 - Single Statement
        b=a+b-(a=b);
        
        System.out.println("After swapping values are.."+a+" "+b);
    }
}