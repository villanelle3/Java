import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);

    System.out.println(numeros);

    Iterator<Integer> it = numeros.iterator();

    int numero = it.next();
    System.out.println(numero);

    
    while(it.hasNext()){
      it.forEachRemaining(value -> System.out.print(value + " "));;
    }

    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");

    LinkedList<String> animais = new LinkedList<>();
    animais.add("Cachorro");
    animais.add("Gato");
    animais.add("Papagaio");

    System.out.println(animais);
    animais.add(1, "Cavalo");

    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");

    // Hashset<Integer> numeros2 = new Hashset<>();
    // numeros2.add(13);
    // numeros2.add(14);
    // numeros2.add(15);
    // Iterator<Integer> it2 = numeros2.iterator();
    // while(it2.hasNext()){
    //   System.out.println(it2.next());
    // }
    
  }
}
