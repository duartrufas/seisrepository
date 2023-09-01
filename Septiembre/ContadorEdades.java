import java.util.Scanner;

public class ContadorEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mayoresDe18 = 0;
        int menoresDeEdad = 0;
        
        while (true) {
            System.out.print("Ingrese la edad (- para salir): ");
            int edad = sc.nextInt();
            
            if (edad < 0) {
                break;
            } else if (edad >= 18) {
                mayoresDe18++;
            } else {
                menoresDeEdad++;
            }
        }
        
        System.out.println("Personas mayores de 18: " + mayoresDe18);
        System.out.println("Personas menores de edad: " + menoresDeEdad);
        
        sc.close();
    }
}
