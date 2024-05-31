package model.loja;

import model.Data;
import model.Endereco;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, long salarioBaseFuncionario, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaDeProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaDeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                "} " + super.toString();
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
}
