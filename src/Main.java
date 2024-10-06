import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Informe a potência do motor (em cavalos Ex: 120): ");
    int potencia = scanner.nextInt();

    System.out.println("Informe o tipo de combustível: ");
    String combustivel = scanner.next();

    // Criando um objeto Motor
    Motor motor = new Motor(potencia, combustivel);


    System.out.println("Informe o modelo do carro: ");
    String modelo = scanner.next();

    System.out.println("Informe a marca do carro: ");
    String marca = scanner.next();

    System.out.println("Informe o ano de fabricação do carro: ");
    int ano = scanner.nextInt();

    // Criando um objeto Carro
    Carro carro = new Carro(modelo, marca, ano, motor);

    // Exibindo as informações do carro e seu motor
    System.out.println("Carro criado com sucesso!");
    System.out.println(carro);

    scanner.close();
  }
}