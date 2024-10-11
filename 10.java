public class Main {
    public static void main(String[] args) {
        // 1. Média de duas notas decimais
        double nota1 = 7.5;
        double nota2 = 8.0;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        // 2. Casting de double para int
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println("Valor após casting (double para int): " + valorInt);

        // 3. Variável char e String
        char letra = 'A';
        String palavra = "BC";
        String mensagem = letra + palavra;
        System.out.println("Mensagem concatenada: " + mensagem);

        // 4. Cálculo do valor total
        double precoProduto = 19.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total: " + valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double valorEmReais = valorEmDolares * 4.94;
        System.out.printf("Valor em reais: %.2f%n", valorEmReais);

        // 6. Cálculo de preço com desconto
        double precoOriginal = 100.0;
        double percentualDesconto = 10.0; // 10%
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.printf("Preço com desconto: %.2f%n", precoComDesconto);
    }
}