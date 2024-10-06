// Classe que representa o motor de um carro
class Motor {
  private int potencia;
  private String combustivel;

  // Construtor da classe Motor
  public Motor(int potencia, String combustivel) {
    this.potencia = potencia;
    this.combustivel = combustivel;
  }

  public int getPotencia() {
    return potencia;
  }

  public String getCombustivel() {
    return combustivel;
  }

  // Método para exibir informações do motor
  @Override
  public String toString() {
    return "Motor{" +
            "potencia=" + potencia +
            ", combustivel='" + combustivel + '\'' +
            '}';
  }
}