public class Poupanca extends Conta{
  public void imprimeExtrato(){
    System.out.println("Saldo: " + this.getsaldo());
  }
}

// public class Poupanca implements Conta{
//   private double saldo;
//   public void depositar(double valor){
//     this.saldo += valor;  
//}
// public double getsaldo(){
//   return this.saldo;
// }
// public void sacar(){
// this.saldo -= valor;
//}
//}