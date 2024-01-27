import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    int numero_sorteado = (int) (Math.random() * 100);

    Scanner entrada = new Scanner(System.in);
    System.out.println("Advinhe o número: ");
    int numero_escolhido = entrada.nextInt();
    
    if (numero_escolhido == numero_sorteado){
      System.out.println("Parabéns, você acertou!");
    }else{
      System.out.println("Fim de jogo!, A resposta era: " + numero_sorteado);
    }
    
    }
}
