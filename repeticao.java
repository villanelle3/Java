import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    for(int i = 0; i < 10; i++){
      System.out.println(i + " oi!");
    }

    // ===============================

    
    int num = 0;
    while(num != 99){
      System.out.println("Digite um número ou 99 para sair: ");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
    }
    

  }
}
