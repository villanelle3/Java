import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

      // ===============================

    
    int num = 0;
    while(num != 99){
      System.out.println("Digite um número ou 99 para sair: ");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
    }

    // ===============================
    
    do{
      System.out.println("Digite um número ou 85 para sair: ");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
    }while(num != 85);


    // ===============================
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        System.out.println(i + "*" + j + "=" + (i*j));
      }
      System.out.println("-------------------------------------");
    }
    

  }
  
}
