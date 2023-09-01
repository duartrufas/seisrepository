import java.util.Random;
import java.util.Scanner;

public class ContrasenaAleatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Definir el conjunto de caracteres para la contraseña
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        
        // Solicitar al usuario la longitud deseada de la contraseña
        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = sc.nextInt();
        
        // Validar que la longitud sea mayor que 0
        if (longitud <= 0) {
            System.out.println("La longitud debe ser mayor que 0.");
        } else {
            // Generar la contraseña aleatoria
            String contrasena = generarContrasena(caracteres, longitud);
            
            // Mostrar la contraseña generada
            System.out.println("Contraseña generada: " + contrasena);
        }
        
        sc.close();
    }
    
    // Función para generar una contraseña aleatoria
    public static String generarContrasena(String caracteres, int longitud) {
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contrasena.append(caracterAleatorio);
        }
        
        return contrasena.toString();
    }
}
