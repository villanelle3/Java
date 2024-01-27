import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    String valor = "R$ 1.000,00";
    String curso = "Curso de Java";
    String nome;
    
    System.out.println(valor);
    
    System.out.println(curso.contains("Java"));
    System.out.println(curso.length());
    System.out.println(curso.replace("Java", "JavaScript"));
    System.out.println(curso.toUpperCase());
    System.out.println(curso.toLowerCase());
    System.out.println(curso.substring(0, 5));
    System.out.println(curso.substring(10));
    // ===========================================================
    System.out.println("Nome:");

    Scanner entrada = new Scanner(System.in);
    nome = entrada.nextLine();
    System.out.println("Olá, " + nome);
  }

  // Sytem.out...
  // println = mostrar na tela, pula linha
  // print = print, nao pula linha
  // printf = print formatado, não pula linha

  // System.in... TEM QUE IMPORTAR
  // entrada de dados

  
}
