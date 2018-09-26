public class Main {
    public static void main(String[] args) {

        Number hejo = new Number() {
            @Override
            public double calculate(double a, double b) {
                return a+b;
            }
    };
    //==
    Number hejo1 = (a, b) ->  a - b;
        System.out.println(hejo1.calculate(5, 5));



}
}
