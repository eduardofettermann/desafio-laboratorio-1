package model.loja;

import model.Data;
import model.Endereco;

public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, Data dataAlvara) {
        super(nome, quantidadeFuncionarios);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, long salarioBaseFuncionario, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara,int quantidadeMaximaDeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaDeProdutos);
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao{" +
                "dataAlvara=" + dataAlvara +
                "} " + super.toString();
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
}
