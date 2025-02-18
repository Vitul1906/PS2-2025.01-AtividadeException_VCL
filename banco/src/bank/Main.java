import java.util.ArrayList;
import java.util.List;

/*
 * Classe principal que demonstra a criação e manipulação de uma lista de clientes.
 * 
 * O programa cria uma lista de clientes com nomes e idades variáveis, tratando exceções caso a idade seja inválida.
 * Em seguida, imprime a lista de clientes, reduz a idade de cada um em um ano e exibe a lista modificada.
 * 
 * Dependências:
 * - Cliente: Classe que representa um cliente com nome e idade.
 * - IllegalAgeException: Exceção personalizada para idades inválidas, criação de classe pedida no exercício.
 */

public class Main {
  public static void main(String[] args) {
    List<Cliente> clientes = new ArrayList<>();
    List<Cliente> clientes2 = new ArrayList<>();

// Criando 20 clientes com nomes diferentes e idades variáveis

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
