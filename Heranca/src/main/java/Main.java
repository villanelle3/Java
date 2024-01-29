public class Main {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    p.nome = "João";
    p.idade = 25;
    p.cpf = "123.456.789-00";

    Vendedor v = new Vendedor();
    v.nome = "Maria";
    v.idade = 30;
    v.cpf = "987.654.321-00";
    v.comissao = 0.1;

    Conta c = new Poupanca();
    c.setsaldo(1000.0);
    c.imprimeExtrato();
  }
}