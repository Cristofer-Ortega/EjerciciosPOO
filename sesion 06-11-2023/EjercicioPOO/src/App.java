import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        CuentaBancaria cuentaBamk = new CuentaBancaria();
        //System.out.println("Nombre: " + endgame.mostrarNombre());
      
        
        System.out.print("Ingrese tu nombre: ");
        String nombreCliente = lector.next();
        cuentaBamk.establecerNombre_Cliente(nombreCliente);

        System.out.print("Ingresa tu numero de cuenta: ");
        int numeroCuneta = lector.nextInt();
        cuentaBamk.establecerNumeroDecuenta(numeroCuneta);

        System.out.print("Ingresa tu saldo: ");
        double saldo = lector.nextDouble();
        cuentaBamk.establecerSaldo(saldo);


        System.out.print("Ingresa tu email: ");
        String email = lector.nextLine();
        cuentaBamk.establecerEmail(email);

        System.out.print("Ingresa tu numero de telefono: ");
        int numeroTelefono = lector.nextInt();
        cuentaBamk.establecerNumeroTelefono(numeroTelefono);

         System.out.println("Ingresa una cantidad a depositar");
         double montoDepositado = lector.nextDouble();
         

        System.out.println("Eliga que transaccion desea realizar");
        System.out.println("1) Depositar");
        System.out.println("2)Retirar");
        byte opc = lector.nextByte();
       
        switch (opc) {
            case 1:
            System.out.println("Ingrese la cantidad a depositar");
            double deposito = lector.nextDouble();
            cuentaBamk.establecerDeposito(deposito);
                
                break;
            case 2:
            System.out.println("Ingrese la cantidad que desea");
                
                break;

        
    }
}
}