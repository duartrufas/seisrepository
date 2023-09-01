import java.util.Scanner;

public class RangoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario el rango inicial
        System.out.print("Ingrese el rango inicial: ");
        int rangoInicial = sc.nextInt();
        
        // Solicitar al usuario el rango final
        System.out.print("Ingrese el rango final: ");
        int rangoFinal = sc.nextInt();
        
        // Validar si el rango es válido (rangoInicial debe ser menor o igual a rangoFinal)
        if (rangoInicial <= rangoFinal) {
            int sumaPares = 0; // Variable para almacenar la suma de los números pares
            
            // Iterar desde rangoInicial hasta rangoFinal (inclusive)
            for (int i = rangoInicial; i <= rangoFinal; i++) {
                // Verificar si el número es par
                if (i % 2 == 0) {
                    sumaPares += i; // Sumar el número par a la suma total
                }
            }
            
            // Mostrar la suma de los números pares
            System.out.println("La suma de los numeros pares en el rango de " + rangoInicial + " a " + rangoFinal + " es: " + sumaPares);
        } else {
            // Si el rango no es válido, mostrar un mensaje de error
            System.out.println("aguevado ponelo bien, bruto tapado, matildo, sapo hpta, negr*.");
        }
        
        sc.close();
    }
}

