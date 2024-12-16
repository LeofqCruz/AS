public class ContaCorrente extends Conta {

   public ContaCorrente(int numeroConta, String titular, double saldo) {
      super(numeroConta, titular, saldo);
   }

   @Override
   public double sacar(double valor) { // Método sobrescrito para sacar valor
      double taxa = (valor / 100 * 2.5);
      if (valor > 0 && valor < this.saldo) {
         this.saldo -= valor;
         this.saldo -= taxa;
      } else {
         System.out.println("Saldo Insuficiente!");
      }
      return this.saldo;
   }

   @Override
   public void depositar(double valor) {  // Método sobrecarregado para depositar valor
      System.out.println("Valor depositado!");
      this.saldo += valor;
   }

   @Override
   public void imprimirSaldo() {
      System.out.println("O valor atualizado de seu saldo é de R$" + this.saldo);
   }
}
