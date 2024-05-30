package model.loja;

import model.Data;
import model.Endereco;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, long salarioBaseFuncionario, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                "} " + super.toString();
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
}
