Class Carro{
  String nome;
  String cor;
  int ano;
  double peso;

  public Carro(){
    // todos os carros começam com 500 kg
    peso = 500.0;
  }

  public Carro(String nome, String cor, int ano, double peso){
    this.nome = nome;
    this.cor = cor;
    this.ano = ano;
    this.peso = peso;
  }

  public void Anda(){
    System.out.println("O carro está andando");
  }
  public void Freia(){
    System.out.println("O carro está freiando");
  }
  public void Dados(){
    System.out.println("Nome: " + nome);
    System.out.println("Cor: " + cor);
    System.out.println("Ano: " + ano);
    System.out.println("Peso: " + peso);
  }
}
