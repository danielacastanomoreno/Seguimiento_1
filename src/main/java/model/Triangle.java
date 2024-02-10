package model;

public class Triangle {

    // Attributes
    double a;
    double b;
    double c;

    // Constructor
    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }
    public boolean evaluateEquilateralTriangule(double a, double b, double c) {

        if(a == b && b == c && a == c) {

            // Equilatero
            return true;

        }

        return false;

    }

    public boolean evaluateIsoscelesTriangule(double a, double b, double c) {

        if((a == b || a == c) && (b == a || b == c)) {

            // Isosceles
            return true;

        }

        return false;

    }

    public boolean evaluateScaleneTriangule(double a, double b, double c) {

        if(a != b && b != c && a != c) {

            return true;

        }

        return false;

    }


}
