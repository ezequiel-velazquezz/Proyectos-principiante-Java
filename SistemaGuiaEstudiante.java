import java.util.Scanner;

public class SistemaGuiaEstudiante {
    public static void main(String[] args) {
        System.out.println("""
                           *** Sistema de guia para el estudiante ***
                           \nBienvenido estudiante, proporciona el modulo de la materia
                           que estas cursando y te diremos en que piso se encuentra tu clase
                           """);
        
        var consola = new Scanner(System.in);
        
        System.out.print("Ingresa el modulo de tu curso (en numeros 0-5) ");
        var modulo = Integer.parseInt(consola.nextLine());
                
        switch(modulo){
            case 1, 5-> System.out.println("Tu clase esta en el primer piso");
            case 2, 4 -> System.out.println("Tu clase esta en el segundo piso");
            case 3 -> System.out.println("Tu clase esta en el tercer piso");
            default -> System.out.println("Este modulo no existe");
        };
    }
}
