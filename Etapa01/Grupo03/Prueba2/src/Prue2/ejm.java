package Prue2;

public class ejm {

    public static void main(String[] args) {
        Operation suma = new OperationI();
        Operation resta;
        resta = new Operation() {

            @Override
            public double operate(double a, double b) {
                return a - b;
            }

        };
        Operation multiplicacion = (a, b) ->a * b; 
        Operation division = (a, b) -> a / b;
        Operation porcentaje = (a, b) -> a % b;

        System.out.println("Suma=" + suma.operate(2, 2));
        System.out.println("Resta=" + resta.operate(2, 2));
        System.out.println("Multiplicacion=" + multiplicacion.operate(2, 2));
        System.out.println("Division=" + division.operate(11, 2));
        System.out.println("porcentaje=" + porcentaje.operate(10, 100));
    }
}
