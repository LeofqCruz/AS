public abstract class Conta {
   protected int numeroConta;
   protected String titular;
   protected double saldo;

   public Conta(int numeroConta, String titular, double saldo) {
      this.numeroConta = numeroConta;
      this.titular = titular;
      this.saldo = saldo;
   }

   public int getNumeroConta() {
      return numeroConta;
   }

   public void setNumeroConta(int numeroConta) {
      this.numeroConta = numeroConta;
   }

   public String getTitular() {
      return titular;
   }

   public void setTitular(String titular) {
      this.titular = titular;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public abstract double sacar(double valor);

   public void depositar(double valor) {
      this.saldo += valor;
      
   }

   public abstract void imprimirSaldo();

}