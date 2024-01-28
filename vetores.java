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
    int total = 0;
    int totalPrimeiraSemana = 0;
    int totalSegundaSemana = 0;
    int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

    for (int i = 0; i < passarosPorDia.length; i++){
      total = total + passarosPorDia[i];
      if(i < 7){
        totalPrimeiraSemana = totalPrimeiraSemana + passarosPorDia[i];
      }else{
          totalSegundaSemana = totalSegundaSemana + passarosPorDia[i];
      }
    }



    System.out.println("Total de passaros: " + total);
    System.out.println("Total de passaros na primeira semana: " + totalPrimeiraSemana);
    System.out.println("Total de passaros na segunda semana: " + totalSegundaSemana);
    
  };
}
