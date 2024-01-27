import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int a, b;
    a = 4;
    b = 8;
    System.out.println(a > b);
    // =======================================
    int nota = 4;
    
    if(nota >= 5){
      System.out.println("Aprovado");
    }else if(nota >= 3 && nota < 5){
      System.out.println("Exame");
    }else{
      System.out.println("Reprovado");
    }

    // =======================================
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escolha uma opção: ");
    System.out.println("1 - moto");
    System.out.println("2 - carro");
    System.out.println("3 - avião");
    System.out.println("4 - helicóptero");
    int numero = entrada.nextInt();
    switch(numero){
      case 1:
        System.out.println("Você escolheu moto");
        break;
      case 2:
        System.out.println("Você escolheu carro");
        break;
      case 3:
        System.out.println("Você escolheu avião");
        break;
      case 4:
        System.out.println("Você escolheu helicóptero");
        break;
      default:
        System.out.println("Opção inválida");
      
    }
    
  }
}
