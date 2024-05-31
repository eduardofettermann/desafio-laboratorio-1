package model.loja;

import model.Data;
import model.Endereco;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, long salarioBaseFuncionario, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados,int quantidadeMaximaDeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaDeProdutos);
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "produtosImportados=" + produtosImportados +
                "} " + super.toString();
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
}
