import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        divisores();
    }
    
    /**
     * Método divisores a modificar. Debe incluir las acciones 
     * necesarias para mostrar por pantalla todos los divisores
     * de num mayores que 1 y menores que num
     */
    public static void divisores() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = input.nextInt();
        System.out.println("Sus divisores son: ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println(i);
            } else {
                
            }
        }
    }
}
