public class ContaPoupança extends Conta {
   protected double rendimento;

   public ContaPoupança(int numeroConta, String titular, double saldo, double rendimento) {
      super(numeroConta, titular, saldo);
      this.rendimento = rendimento;
   }

   @Override
   public double sacar(double valor) {       // Método sobrescrito para sacar valor
      if (valor > 0 && valor <= this.saldo) {
         this.saldo -= valor;
      } else {
         System.out.println("Saldo Insuficiente!");
      }
      return this.saldo;
   }

   @Override
   public void depositar(double valor) {     // Método sobrecarregado para depositar valor
      System.out.println("Valor depositado!");
      this.saldo += valor;
   }

   public double aplicarRendimento() {       // Método para aplicar rendimento do saldo
      this.saldo += this.saldo * (this.rendimento / 100);
      return this.saldo;
   }

   @Override
   public void imprimirSaldo() {             // Método para imprimir saldo atualizado
      System.out.println("O valor atualizado de seu saldo é de R$" + this.saldo);
   }
}
