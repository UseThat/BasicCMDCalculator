public class Calculator {
    void add(double a, double b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }

    void subtract(double a, double b){
        System.out.println(a+" - "+b+" = "+(a-b));
    }

    void multiply(double a, double b){
        System.out.println(a+" * "+b+" = "+(a*b));
    }

    void divide(double a, double b){
        if(b == 0){
            System.out.println("Unable to divide by 0");
        }else{
            System.out.println(a+" / "+b+" = "+(a/b));
        }
    }
}
