public class Cao{
  private int idade; // Só tem acesso dentro da classe

  public void setIdade(int idade){
    idade = idade;
  }
  public int getIdade(){
    return idade;
  }
  
  public void Andar(){
    System.out.println("Andando");
  }

  public boolean VerificarIdade(){
    if(idade > 10){
      return true;
    }else{
      return false;
    }
  }
  
}
