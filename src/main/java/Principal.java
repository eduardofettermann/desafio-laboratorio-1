import model.Data;
import model.Endereco;
import model.loja.Loja;
import model.Produto;

import java.util.Scanner;

public class Principal {
    private static final Scanner SCANNER = new Scanner(System.in);
    private Loja loja = null;
    private Produto produto = null;

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.exibeMenuPrincipal();
    }


    public void exibeMenuPrincipal() {
        int opcao;
        do {
            exibeOpcoesMenu();
            opcao = retornaInteiroDigitado("Digite a opção desejada:");

            if (opcao == 1) {
                this.loja = exibeMenuLojaERetornaLoja();
                if (lojaEProdutoCriados()) {
                    exibeInformacoesRequiridas();
                    opcao = 3;
                }
            } else if (opcao == 2) {
                this.produto = exibeMenuProdutoERetornaProduto();
                exibeInformacoesRequiridas();
                opcao = 3;
            } else if (opcao != 3) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        System.out.println("Encerrando programa...");
    }

    public Produto exibeMenuProdutoERetornaProduto() {
        if (this.produto != null) {
            System.out.println("Produto já criado. Deseja alterar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int opcao = retornaInteiroDigitado("Digite a opção desejada:");
            if (opcao == 2) {
                return this.produto;
            }
        }
        return retornaProdutoComDadosDigitados();
    }

    public Loja exibeMenuLojaERetornaLoja() {
        if (this.loja != null) {
            System.out.println("Loja já criada. Deseja alterar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int opcao = retornaInteiroDigitado("Digite a opção desejada:");
            if (opcao == 2) {
                return this.loja;
            }
        }
        return retornaLojaComDadosDigitados();
    }


    public void exibeOpcoesMenu() {
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Criar uma Loja");
        System.out.println("2 - Criar um Produto");
        System.out.println("3 - Sair");
    }

    public void exibeSeOProdutoEstaDentroDaValidade() {
        System.out.println("Verificando se o produto está dentro da validade...");
        Data dataAtual = new Data(20, 10, 2023);
        if (this.produto.estaVencido(dataAtual)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        imprimirLinhaEmBrancoNoConsole();
    }

    public void exibeInformacoesDaLoja() {
        System.out.println("Informações da loja:");
        imprimirLinhaEmBrancoNoConsole();
        System.out.println(this.loja);
        imprimirLinhaEmBrancoNoConsole();
    }

    public void exibeInformacoesRequiridas() {
        System.out.println("Loja e Produto criados!");
        exibeInformacoesDaLoja();
        exibeSeOProdutoEstaDentroDaValidade();
    }

    public Loja retornaLojaComDadosDigitados() {
        String nome = retornaStringDigitada("Digite o nome da loja:");
        int quantidadeFuncionarios = retornaInteiroDigitado("Digite a quantidade de funcionários:");
        double salarioBaseFuncionario = retornaDoubleDigitado("Digite o salário base dos funcionários:");
        imprimirLinhaEmBrancoNoConsole();
        System.out.println("Agora você irá digitar o endereço da loja!");
        imprimirLinhaEmBrancoNoConsole();
        Endereco endereco = retornaEnderecoComDadosDigitados();
        imprimirLinhaEmBrancoNoConsole();
        System.out.println("Agora você irá digitar a data de fundação da loja!");
        imprimirLinhaEmBrancoNoConsole();
        Data dataFundacao = retornaDataComDadosDigitados();
        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    }

    public Produto retornaProdutoComDadosDigitados() {
        String nome = retornaStringDigitada("Digite o nome do produto:");
        double preco = retornaDoubleDigitado("Digite o preço do produto:");
        imprimirLinhaEmBrancoNoConsole();
        System.out.println("Agora você irá digitar a data de validade do produto!");
        imprimirLinhaEmBrancoNoConsole();
        Data dataDeValidade = retornaDataComDadosDigitados();
        return new Produto(nome, preco, dataDeValidade);
    }

    public Endereco retornaEnderecoComDadosDigitados() {
        String nomeDaRua = retornaStringDigitada("Digite o nome da rua:");
        String cidade = retornaStringDigitada("Digite o nome da cidade:");
        String estado = retornaStringDigitada("Digite o nome do estado:");
        String pais = retornaStringDigitada("Digite o nome do país:");
        String cep = retornaStringDigitada("Digite o CEP:");
        String numero = retornaStringDigitada("Digite o número:");
        String complemento = retornaStringDigitada("Digite o complemento:");
        return new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
    }

    public Data retornaDataComDadosDigitados() {
        int dia = retornaInteiroDigitado("Digite o dia:");
        int mes = retornaInteiroDigitado("Digite o mês:");
        int ano = retornaInteiroDigitado("Digite o ano:");
        return new Data(dia, mes, ano);
    }

    public String retornaStringDigitada(String mensagem) {
        System.out.println(mensagem);
        return SCANNER.nextLine();
    }

    public int retornaInteiroDigitado(String mensagem) {
        System.out.println(mensagem);
        while (!SCANNER.hasNextInt()) {
            System.out.println("Apenas inteiros são permitidos. " + mensagem);
            SCANNER.next();
        }
        int numero = SCANNER.nextInt();
        SCANNER.nextLine();
        return numero;
    }

    public double retornaDoubleDigitado(String mensagem) {
        System.out.println(mensagem);
        while (!SCANNER.hasNextDouble()) {
            System.out.println("Apenas números são permitidos. " + mensagem);
            SCANNER.next();
        }
        double numero = SCANNER.nextDouble();
        SCANNER.nextLine();
        return numero;
    }

    public boolean lojaEProdutoCriados() {
        return this.loja != null && this.produto != null;
    }

    public void imprimirLinhaEmBrancoNoConsole() {
        System.out.println();
    }
}
