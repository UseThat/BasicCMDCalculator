public class Calculate {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();

        Calculator calc = new Calculator();
        calc.add(a,b);
        calc.subtract(a,b);
        calc.divide(a,b);
        calc.multiply(a,b);
    }
}
