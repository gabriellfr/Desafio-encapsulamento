package banco;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Gabriel", 1000.0);

        System.out.println("Titular: " + conta.getTitular());
        conta.exibirSaldo();

        conta.depositar(500.0);
        conta.exibirSaldo();

        conta.sacar(200.0);
        conta.exibirSaldo();

        conta.sacar(1500.0);  // Teste de saque com saldo insuficiente
        conta.exibirSaldo();

        conta.setTitular("Karla");
        System.out.println("Novo titular: " + conta.getTitular());
    }
}
