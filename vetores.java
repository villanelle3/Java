// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    
    int[] dados = new int[5];
    dados[0] = 1;
    dados[1] = 2;
    dados[2] = 3;
    dados[3] = 4;
    dados[4] = 5;
    
    for (int i = 0; i < dados.length; i++){
      System.out.println(dados[i]);
    }


    //int[][] matriz = new int[3][3];
    // int total = 0;
    // int totalPrimeiraSemana = 0;
    // int totalSegundaSemana = 0;
    // int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

    // for (int i = 0; i < passarosPorDia.length; i++){
    //   total = total + passarosPorDia[i];
    //   if(i < 7){
    //     totalPrimeiraSemana = totalPrimeiraSemana + passarosPorDia[i];
    //   }else{
    //       totalSegundaSemana = totalSegundaSemana + passarosPorDia[i];
    //   }
    // }

    // System.out.println("Total de passaros: " + total);
    // System.out.println("Total de passaros na primeira semana: " + totalPrimeiraSemana);
    // System.out.println("Total de passaros na segunda semana: " + totalSegundaSemana);

    // int first = 9;
    // int second = 5;
    // --------------------------------------------
    int[][] matriz = new int[3][3];
    // for(int i = 0; i < matriz.length; i++){
    //   for(int j = 0; j < matriz[i].length; j++){
    //     if(i == 0){
    //       matriz[i][j] = first;
    //       first = first - 1;
    //     }else if(i == 1){
    //         matriz[i][j] = second;
    //         second = second + 2;
    //     }else{
    //         matriz[i][j] = 6;
    //     }
        
    //   } 
    // }
    matriz[0][0] = 9;
    matriz[0][1] = 8;
    matriz[0][2] = 7;
    matriz[1][0] = 5;
    matriz[1][1] = 3;
    matriz[1][2] = 2;
    matriz[2][0] = 6;
    matriz[2][1] = 6;
    matriz[2][2] = 7;

    int MaiorElementoLinha = 0;
    int MenorElementoColuna = 10000;

    int[] VetorMaioresDaLinha = {0, 0, 0};
    int[] VetorMenoresDaColuna = {0, 0, 0};
    
    System.out.println(" ");
    System.out.println("Matriz: ");
    
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        if (i == 0){
          for(int linha = 0; linha < matriz.length; linha++){
            if(matriz[linha][j] < MenorElementoColuna){
              MenorElementoColuna = matriz[linha][j];
            }
          }
          VetorMenoresDaColuna[j] = MenorElementoColuna;
          MenorElementoColuna = 10000;
        }
        
        if(matriz[i][j] > MaiorElementoLinha){
          MaiorElementoLinha = matriz[i][j];
        }
        System.out.print(matriz[i][j] + " ");
      }

      VetorMaioresDaLinha[i] = MaiorElementoLinha;
      System.out.println(" ");   
      MaiorElementoLinha = 0;
    }


    System.out.println("------------------------------------------------");
    System.out.println(VetorMaioresDaLinha[0]);
    System.out.println(VetorMaioresDaLinha[1]);
    System.out.println(VetorMaioresDaLinha[2]);
    System.out.println("------------------------------------------------");

    System.out.println("------------------------------------------------");
    System.out.println(VetorMenoresDaColuna[0]);
    System.out.println(VetorMenoresDaColuna[1]);
    System.out.println(VetorMenoresDaColuna[2]);
    System.out.println("------------------------------------------------");

    for(int i = 0; i < VetorMaioresDaLinha.length; i++){
      for(int j = 0; j < VetorMenoresDaColuna.length; j++){

        if (VetorMaioresDaLinha[i] == VetorMenoresDaColuna[j]){
            System.out.println(VetorMenoresDaColuna[j]);

        }
        
      }
    }

    
    // System.out.println(" ");
    // if(TemCela){
    //   System.out.println("Tem cela: " + cela);
    // }




    
  };
}
