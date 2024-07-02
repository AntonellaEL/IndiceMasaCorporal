package dev.anto;

import java.util.Scanner;

public final class App {
    private App() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, estatura;
        System.out.println("Ingrese su peso (kg):");
        peso = scanner.nextDouble();
        System.out.println("Ingrese su estatura (m):");
        estatura = scanner.nextDouble();

        double imc = CalcularImc.calcularImc(peso, estatura);
        System.out.println("Su nivel de peso es: " + CalcularImc.nivelPeso(imc));

        scanner.close(); 
    }
}

