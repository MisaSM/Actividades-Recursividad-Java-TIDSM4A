/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadextraclase;

/**
 *
 * @author LENOVO
 */
public class RecursividadExtraClase {
// 0, 1, 1, 2, 3, 5, 8, 13, 21

    public static int fibo(int current, int previous, int limit) {
        if (current >= limit) {
            return current;
        }
        System.out.println(current);
        fibo(previous, current + previous, limit);
        return current;
    }

    public static int sumaNum(int n) {

        if (n == 1) {
            return 1;
        }
        return n + sumaNum(n - 1);
    }

    public static int numNatural(int n) 
    {
        if (n == 0) {
            return n;
        }
        
        return numNatural(n / 10) + (n % 10);
        
    }
    
    public static void main(String[] args) {
        System.out.println("EJERCICIO FIBONACCI");
        fibo(0, 1, 377);
        System.out.println("\n");
        System.out.println("EJERCICIO SUMA DE NUMEROS");
        System.out.println(sumaNum(5));
        System.out.println("\n");
        System.out.println("EJERCICIO NUMEROS NATURALES");
        System.out.println(numNatural(123));
    }

}
