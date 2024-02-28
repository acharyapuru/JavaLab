import java.io.*;
public class Qno1 {

    public static void main(String[] args)
    {
        try
        {
            int result = divide(10,0);
            System.out.println("Result:" + result);

        }catch(ArithmeticException e){
            System.out.println("Exception occured :" + e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
    public static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}