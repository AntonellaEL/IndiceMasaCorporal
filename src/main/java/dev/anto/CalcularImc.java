package dev.anto;

public class CalcularImc {
    
    public static double calcularImc(double peso, double estatura) {
        return peso / Math.pow(estatura, 2); 
    }

    public static String nivelPeso(double IMC) {
        if (IMC < 16) {
            return "Delgadez severa";
        } else if (IMC >= 16.01 && IMC <= 17) {
            return "Delgadez moderada";
        } else if (IMC >= 17.01 && IMC <= 18.5) {
            return "Delgadez leve";
        } else if (IMC >= 18.6 && IMC <= 25) {
            return "Peso normal";
        } else if (IMC >= 25.01 && IMC <= 30) {
            return "Sobrepeso";
        } else if (IMC >= 30.01 && IMC <= 35) {
            return "Obesidad leve";
        } else if (IMC >= 35.01 && IMC <= 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}

