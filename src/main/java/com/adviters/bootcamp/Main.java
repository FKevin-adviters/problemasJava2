package com.adviters.bootcamp;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //actividadUno();
        //calculadora();
        //actividadTres();
        //actividadCuatro();
        //actividadCinco();
        //actividadSeis();
        //actividadSiete();
        //actividadOcho();
        //actividadNueve();
        //actividadDiez();

    }

    public static void actividadUno() {
        System.out.println("Hello World");
    }

    public static void calculadora() {
        Integer resultado = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        Integer num1 = scanner.nextInt();
        System.out.print("Ingrese otro número: ");
        Integer num2 = scanner.nextInt();

        System.out.println("Por favor, seleccione su operación: \n 1 - Suma \n 2 - Resta \n 3 - Division \n 4 - multiplicacion");
        Integer operacion = scanner.nextInt();
        switch (operacion) {
            case 1: {
                System.out.println("Resultado: " +  suma(num1, num2));
                break;
            }
            case 2: {
                System.out.println("Resultado: " + resta(num1, num2));
                break;
            }
            case 3: {
                System.out.println("Resultado: " + division(num1, num2));
                break;
            }
            case 4: {
                System.out.println("Resultado: " + multiplicacion(num1, num2));
                break;
            }

        }
    }

    private static Integer suma(int num1, int num2) {
        return num1 + num2;
    }
    private static Integer resta(int num1, int num2) {
        return num1 - num2;
    }
    private static Integer division(int num1, int num2) {
        return num1 / num2;
    }
    private static Integer multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    public static void actividadTres() {
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("Par: " + i);
            } else {
                System.out.println("Impar: " + i);
            }
        }
    }
    public static void actividadCuatro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        Integer num = scanner.nextInt();

        Integer res = 1;

        if(num == 0 || num == 1) {
            System.out.println("El factorial de: " + num + " es igual a: " + 1);
        } else {
            for (int i = 1; i <= num ; i++) {

                if(num == 1) {
                    res += res + 1;
                } else {
                    res = res * i;
                }
        }
        }
        System.out.println("El factorial de: "+ num+ " es " + res);
    }

    public static void actividadCinco() {
        //Escribe un programa que calcule el área de un círculo a partir de su radio ingresado por el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        Integer radio = scanner.nextInt();
        double areaCirculo = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + areaCirculo);

    }

    public static void actividadSeis() {
        //formula: (0 °C × 9/5) + 32 => celcius a fahrenheit
        //formula: (ºF -32) / 1,8 => fahrenheit a celcius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese grados C°: ");
        Integer celcius = scanner.nextInt();
        System.out.print("Ingrese grados fahrenheit: ");
        Integer fahrenheit = scanner.nextInt();
        Integer conversion = (celcius * 9/5) + 32;
        double conversion2 = ((fahrenheit - 32) / 1.8);

        System.out.println("Los grados celcius ingresados: " + celcius + " pasados a fahrenheit es igual a: " + conversion);
        System.out.println("Los grados fahrenheit ingresados: " + fahrenheit + " pasados a celcius es igual a: " + conversion2);
    }

    public static void actividadSiete() {
        //Escribe un programa que solicite al usuario un
        //conjunto de números enteros y calcule su promedio.
        List<Integer> numeros = new ArrayList<>();
        Integer res = 0;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero, y ponga 0 si quiere finalizar el agregado de nums.: ");
            Integer num = scanner.nextInt();
            if(num == 0) {
                for (int numero :
                        numeros) {
                    res += numero;
                }
                System.out.println("El promedio es: " + (double)res / (double)numeros.size());
                break;
            }
            numeros.add(num);
        }
    }

    public static void actividadOcho() {
        // Crea un programa que sume dos matrices de enteros de tamaño fijo
        // y muestre el resultado en la consola.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el limite de sus matrices: ");
        Integer limite = scanner.nextInt();
        int[] matriz1 = new int[limite];
        int[] matriz2 = new int[limite];

        List<Integer> listRes = new ArrayList<>();
        Integer acumulador = 0;

       while (true) {


           if(acumulador == limite) {
               //hacer logica de suma de los arrays
               for (int i = 0; i < limite; i++) {
                   int suma = matriz1[i] + matriz2[i];
                   listRes.add(suma);
               }
               System.out.println(listRes);
               break;
           } else {
               System.out.print("Ingrese un número para la primera matriz: ");
               Integer num1 = scanner.nextInt();
               System.out.print("Ingrese un número para la segunda matriz: ");
               Integer num2 = scanner.nextInt();
               matriz1[acumulador] = num1;
               matriz2[acumulador] = num2;
               acumulador++;
           }
       }

    }

    public static void actividadNueve() {
        //Escribe un programa que cuente la cantidad de caracteres en una
        //cadena de texto ingresada por el usuario, excluyendo los espacios en blanco.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        int res = 0;
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
            char car = cadena.charAt(i);
            if(!Character.isSpaceChar(car)) {
            res++;
            }
        }
        System.out.println("La cantidad de caracteres sin contar los espacios es: " + res);
    }

    public static void actividadDiez() {
        //Crea un programa que verifique si una palabra ingresada por el usuario
        //es un palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar una palabra");
        String palabra = scanner.nextLine().toLowerCase();
        String palabraInversa = new StringBuilder(palabra).reverse().toString().toLowerCase();
        if(palabra.equals(palabraInversa)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }


    }
}