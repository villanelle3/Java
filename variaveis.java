import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    String valor = "R$ 1.000,00";
    String curso = "Curso de Java";
    String nome;
    double n1, n2, total;
    
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

    // ===========================================================
    System.out.println("Digite um número:");
    Scanner numA = new Scanner(System.in);
    n1 = numA.nextDouble();
    System.out.println("Digite outro número:");
    Scanner numB = new Scanner(System.in);
    n2 = numB.nextDouble();

    total = n1 + n2;

    System.out.println("A soma dos números é: " + total);
    
  }

  // Sytem.out...
  // println = mostrar na tela, pula linha
  // print = print, nao pula linha
  // printf = print formatado, não pula linha

  // System.in... TEM QUE IMPORTAR
  // entrada de dados

  
}
