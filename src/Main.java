public class Main {
    public static void main(String[] args){
        //Criando um objeto do tipo carro com informações do Porsche 964 RS America
        Carro porsche964 = new Carro("Porsche", "964 RS America", 1993, "Azul Cobalto", 100.0);

        //Exibindo informações do carro
        porsche964.exibirInformacoes();

        //Freando o carro
        porsche964.frear(30); //Diminui a velocidade em 30km/h
    }
}


