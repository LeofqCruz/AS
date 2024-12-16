public class Main {
   public static void main(String[] args) {
      ContaPoupança p = new ContaPoupança(123456, "Leo", 2067.00, 10);
      ContaCorrente c = new ContaCorrente(654321, "Oel", 7602.00);

      p.depositar(200);
      c.depositar(200);
      System.out.println();

      p.sacar(10000);
      c.sacar(10000);
      System.out.println();

      p.imprimirSaldo();
      c.imprimirSaldo();
      System.out.println();
      
      p.aplicarRendimento();
      p.imprimirSaldo();

   }
}
