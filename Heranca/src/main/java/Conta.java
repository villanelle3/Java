abstract class Conta{
  private double saldo;
  public void setsaldo(double saldo){
    this.saldo = saldo;
  }
  public double getsaldo(){
    return saldo;
  }
  public abstract void imprimeExtrato();
}

// interface Conta{
//  void depositar(double valor);
//  void sacar(double valor);
//  double getsaldo();
//}