public class Carro {
    // Propriedades (atributos)
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;

    // Construtor
    public Carro(String marca, String modelo, int ano, String cor, double velocidadeInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = velocidadeInicial; // Velocidade inicial definida
    }

    // Métodos (comportamentos)

    // Método para frear
    public void frear(double decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("O carro freou e agora está a " + velocidadeAtual + "km/h.");
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}