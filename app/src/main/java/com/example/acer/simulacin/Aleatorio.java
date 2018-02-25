package com.example.acer.simulacin;

public class Aleatorio {

    public double mixto(double x, double a, double c, double m) {
        return ((x * a + c) % m) / m;
    }

    public double multiplicativo(int x, int a, int c, int m) {
        return 0;
    }
}
