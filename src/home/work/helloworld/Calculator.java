package home.work.helloworld;

/**
 * Created by Lena on 30.05.2016.
 */
public class Calculator {
    public Double Calculator(double a, String action, double b) {
        Double result;
        if (action.equals("+")) {
            result = add(a, b);
            System.out.println(a + " + " + b + " = " + result);
            return result;
        }
        if (action.equals("-")) {
            result = sub(a, b);
            System.out.println(a + " - " + b + " = " + result);
            return result;
        }
        if (action.equals("*")) {
            result = multi(a, b);
            System.out.println(a + " * " + b + " = " + result);
            return result;
        }
        if (action.equals("/")) {
            if (a == 0) {
                System.out.println("Impossible operation 0/");
                return null;
            } else if(b==0) {
                System.out.println( " operation  = " + "Infinity");
                return null;
            }else{
                result = div(a, b);
                System.out.println(a + " / " + b + " = " + result);
                return result;

            }

        }
        System.out.println("Unknown operation");
        return null;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
            return a / b;

    }

}
