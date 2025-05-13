import java.util.Scanner;

public class SistemaAccesos {
    public static void main(String[] args) {
        System.out.println("*** Sistema de accesos estadio ***");
        
        var consola = new Scanner(System.in);
        
        System.out.println("""
                           \nBienvenido/a al estadio
                           Por favor dinos cual es tu sector y te
                           diremos en que acceso debes ingresar
                           """);
        
        System.out.print("""
                         Ingresa tu sector
                         - platea
                         - norte
                         - sur
                         - preferencia
                         \n\n""");
        var sector = consola.nextLine().strip().toLowerCase();
        
       switch(sector){
           case "platea" -> System.out.println("\nAcceso Avenida Carlos Antonio Lopez");
           case "norte" -> System.out.println("\nAcceso Avenida Alejo Garcia y Juan Diaz de Solis");
           case "sur" -> System.out.println("\nAcceso calle Orihuela");
           case "preferencia" -> System.out.println("\nAcceso calle Antonio Ruiz Diaz de Arellano");
           default -> System.out.println("\nEste sector no existe");
       }
        System.out.println("\nDisfruta del espectaculo");
    }
}
