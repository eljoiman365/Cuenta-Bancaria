import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        double valorRetirar = 0;
        double saldoDepositar = 0;

        System.out.println("""
                *********************************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f""".formatted(nombreCliente,tipoCuenta,saldo) + "$");


        int valorUsuario = 0;

        while (valorUsuario != 9){

            System.out.println("""
                
                *********************************************
                **Escriba el número de la opción deseada**
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """);

            valorUsuario = teclado.nextInt();

            if (valorUsuario == 1){
                System.out.println("Saldo disponible " + saldo + "$");
                System.out.println("""

                                *********************************************
                                
                                Ingresa el número 4 para regresar al menú principal o 9 para salir
                                
                                *********************************************
                                """);
                valorUsuario = teclado.nextInt();
                if (valorUsuario == 4){
                    continue;
                }else if (valorUsuario == 9){
                    break;
                }

            }else if (valorUsuario == 2) {
                System.out.println("Digita el valor que deseas retirar:");
                valorRetirar = teclado.nextDouble();
                System.out.println(" ");
                if (valorRetirar > saldo){
                    System.out.println("""
                            *********************************************
                            
                            Saldo insuficiente
                            """);
                    continue;
                }else if (valorRetirar < saldo) {
                    saldo -= valorRetirar;
                    System.out.println("""
                            *********************************************
                            
                            Operación exitosa!!!
                            
                            *********************************************
                            """);
                    System.out.println("Saldo disponible: " + saldo + "$");
                    System.out.println("""
                            
                            *********************************************
                            
                            Ingresa el número 4 para regresar al menú principal o 9 para salir
                            
                            *********************************************
                            """);
                    valorUsuario = teclado.nextInt();
                    if (valorUsuario == 4) {
                        continue;
                    } else if (valorUsuario == 9) {
                        break;
                    }
                }
            }else if (valorUsuario == 3) {
                System.out.println("Ingresa el valor a depositar:");
                saldoDepositar = teclado.nextDouble();
                saldo += saldoDepositar;
                System.out.println("""
                                *********************************************
                                
                                Operación exitosa!!!
                                
                                ********************************************
                                """);
                System.out.println("Saldo disponible: " + saldo + "$");
                System.out.println("""
                                
                                *********************************************
                                
                                Ingresa el número 4 para regresar al menú principal o 9 para salir
                                
                                *********************************************
                                """);
                valorUsuario = teclado.nextInt();
                if (valorUsuario == 4) {
                    continue;
                } else if (valorUsuario == 9) {
                    break;
                }

            }else if (valorUsuario != 1 || valorUsuario != 2 || valorUsuario != 3 || valorUsuario != 9){
                System.out.println("""
                    *********************************************\n
                    Número invalido\n
                    *********************************************""");
            }
        }
        System.out.println("""
           *********************************************

           Operación finalizada
                               
           Gracias por utilizar nuestros servicios!!
                                
           *********************************************
           """);
    }

}