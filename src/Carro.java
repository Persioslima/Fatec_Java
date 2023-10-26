import java.util.Scanner;

public class Carro {
    private double consumoPorKm;
    private double velocidadeAtual;
    private double valorGasolinaPorLitro;

    public Carro(double consumoPorKm, double valorGasolinaPorLitro) {
        this.consumoPorKm = consumoPorKm;
        this.velocidadeAtual = 0;
        this.valorGasolinaPorLitro = valorGasolinaPorLitro;
    }

    public double calcularValorTotal() {
        double distanciaPercorrida = this.velocidadeAtual / this.consumoPorKm;
        double valorTotal = distanciaPercorrida * this.valorGasolinaPorLitro;
        return valorTotal;
    }

    public void acelerar(double velocidade) {
        if (velocidade >= 0 && velocidade <= 180) {
            this.velocidadeAtual = velocidade;
        }
    }

    public void frear() {
        this.velocidadeAtual = 0;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }

    public double getValorGasolinaPorLitro() {
        return valorGasolinaPorLitro;
    }

    public void setValorGasolinaPorLitro(double valorGasolinaPorLitro) {
        this.valorGasolinaPorLitro = valorGasolinaPorLitro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o consumo de combustível (km/l): ");
        double consumo = scanner.nextDouble();
        
        System.out.print("Informe o preço da gasolina por litro (R$): ");
        double precoGasolina = scanner.nextDouble();
        
        Carro meuCarro = new Carro(consumo, precoGasolina);

        System.out.print("Informe a velocidade atual do carro (em km/h): ");
        double velocidade = scanner.nextDouble();
        meuCarro.acelerar(velocidade);

        double valorGasto = meuCarro.calcularValorTotal();
        System.out.println("Valor gasto em gasolina: R$" + valorGasto);

        meuCarro.frear();
        valorGasto = meuCarro.calcularValorTotal();
        System.out.println("Valor gasto em gasolina ao frear: R$" + valorGasto);

        scanner.close(); // Fechar o scanner quando não for mais necessário
    }
}

