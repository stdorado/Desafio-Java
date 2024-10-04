import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int Saldo = 1600;
    int Operaciones = 0;

    while (Operaciones !=9){
        System.out.println("Hola Bienvenido a su cuenta de banco, como lo podemos ayudar");
        System.out.println("""
            Diferentes Operaciones A realizar : 
            Ingrese 1 para consultar su saldo
            Ingrese 2 para Retirar saldo
            Ingrese 3 para Depositar su saldo
            Ingrese 9 para salir de su cuenta 
            """);
        Operaciones = teclado.nextInt();

        switch (Operaciones) {
            case 1:
                System.out.println("Usted presionó consultar su saldo, su saldo es de: $" + Saldo);
                System.out.println("Gracias por realizar su operacion");
                System.out.println("--------------------------------------------------------------");
                break;
            case 2:
                System.out.println("Usted presionó el botón de retirar saldo, ingrese la cantidad a retirar:");
                int retirar = teclado.nextInt();
                if (retirar > Saldo) {
                    System.out.println("No puede realizar este retiro, ya que excede la cantidad de dinero disponible.");
                    System.out.println("------------------------------------------------------------");
                } else {
                    Saldo -= retirar;
                    System.out.println("Su retiro fue un éxito. El dinero que le queda es de: $" + Saldo);
                    System.out.println("-------------------------------------------------------------");
                }
                break;
            case 3:
                System.out.println("Usted presionó el botón de depositar saldo, ingrese la cantidad a depositar:");
                int depositar = teclado.nextInt();
                Saldo += depositar;
                System.out.println("Su depósito fue un éxito. El nuevo saldo es de: $" + Saldo);
                System.out.println("-----------------------------------------------------------------");
                break;
            case 9:
                System.out.println("Usted presionó el botón de salir de su cuenta. Gracias y que tenga un buen día.");
                System.out.println("-----------------------------------------------------------------");
                break;
            default:
                System.out.println("Operación no válida. Intente nuevamente.");
                System.out.println("-----------------------------------------------------------------");

        }
    }


}
}

//faltaria agregar un loop a esto y cambiar el switch por un if/else