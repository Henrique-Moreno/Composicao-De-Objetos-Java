// Classe que representa um carro que possui um motor
class Carro {
  private String modelo;
  private String marca;
  private int ano;
  private Motor motor;

  // Construtor da classe Carro
  public Carro(String modelo, String marca, int ano, Motor motor) {
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.motor = motor;
  }

  public String getModelo() {
    return modelo;
  }

  public String getMarca() {
    return marca;
  }

  public int getAno() {
    return ano;
  }

  public Motor getMotor() {
    return motor;
  }

  // Método para exibir informações do carro
  @Override
  public String toString() {
    return "Carro{" +
            "modelo='" + modelo + '\'' +
            ", marca='" + marca + '\'' +
            ", ano=" + ano +
            ", motor=" + motor +
            '}';
  }
}
