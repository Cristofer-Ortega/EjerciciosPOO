public class CuentaBancaria {
    //Atributos
    private String nombreCliente;
    private int numeroDeCuenta;
    private double saldo;
    private String email;
    private int numeroTelefono;
    private double depositar;
    private double retirar;
    private double montoDepositado;


    
    //Metodos constructores
    //Metodo constructor sin parametros
   public CuentaBancaria(){
        this();
    } 
    //Metodo constructor con todos los parametros
    public CuentaBancaria(String nombreCliente, int numeroDeCuenta, double saldo, String email, int numeroTelefono, double depositar, double retirar, double montoDepositado){
        this.nombreCliente = nombreCliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.retirar = retirar;
        this.depositar = depositar;
        this.montoDepositado = montoDepositado;
    }
    //Metodos getters y setters
    //Los metodos getters son para mostrar los valores de los atributos
    public String mostrarNombre_Cliente(){  //getNombre()
        return this.nombreCliente;
    }
    public int numeroDeCuenta(){  //getDuracion()
        return this.numeroDeCuenta;
    }
    public double mostrarsaldo() {
        return this.saldo;
    }    
    public String mostrarEmail() {
        return this.email;
    }    
    public int mostrarNumeroTelefono() {
        return this.numeroTelefono;
    }
    public double mostrarDeposito(){
        return this.depositar;
    }
    public double mostrarRetiro(){
        return this.retirar;
    }  
    public double mostarMontodepositado(){
        return this.montoDepositado;
    }  
    //Los metodos setters son para modificar los valores de los atributos    
    public void establecerNombre_Cliente(String nombreCliente){    //setNombre()
        this.nombreCliente = nombreCliente;
    }
    public void establecerNumeroDecuenta(int numeroDeCuenta){    //setDuracion()
        if (numeroDeCuenta < 0) {
            this.numeroDeCuenta = 0;
        } else {
            this.numeroDeCuenta= numeroDeCuenta;
        }  
    }
    public void establecerSaldo(double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }
    public void establecerEmail(String email) {
        this.email = email;
    }
    public void establecerNumeroTelefono(int numeroTelefono){    //setDuracion()
        if (numeroTelefono < 0) {
            this.numeroTelefono = 0;
        } else {
            this.numeroTelefono= numeroTelefono;
        }  
    }
    public void establecerDeposito(double depositar){
        if (depositar < 0) {
            this.depositar = 0;
        } else {
            this.depositar = depositar;
        }
    }
    public void establecerRetiro(double retirar){
        this.retirar = retirar;
    }
}