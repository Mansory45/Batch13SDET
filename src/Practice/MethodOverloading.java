package Practice;

public class MethodOverloading {
    static int plusMethodInt(int x, int y){
        return x+y;
    }
    static double plusMethodDobuble(double x , double y){
        return x+y;


    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8,5);
        double myNum2 = plusMethodDobuble(4.3,6.26);
        System.out.println("int: "+ myNum1);
        System.out.println("double: " + myNum2);
    }
}
