import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Cliente> clientes = new ArrayList<>();
    List<Cliente> clientes2 = new ArrayList<>();

    for(int i=0; i<20; i++) {
      try {
        Cliente c = new Cliente("Joaquim" +i, i);
        clientes.add(c);
        System.out.println("Cliente " + c.getNome() + " com idade " + i + " cadastrado");
      }catch(IllegalAgeException ex) {
        System.out.println(ex);
      }
    }

    System.out.println("======= Lista de Clientes ========");
    for(Cliente c: clientes){
      System.out.println(c);
      try {
        c.setIdade(c.getIdade()-1);
        clientes2.add(c);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    System.out.println("======= Lista de Clientes ========");
    for(Cliente c: clientes2){
      System.out.println(c);
    }
    
  }
}
