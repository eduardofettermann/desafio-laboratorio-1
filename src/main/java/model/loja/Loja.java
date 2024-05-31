package model.loja;

import model.Data;
import model.Endereco;
import model.Produto;

import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario = -1;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] produtos;

    public boolean removeProduto(String nomeDoProduto){
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i] != null && this.produtos[i].getNome().equals(nomeDoProduto)) {
                this.produtos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean insereProduto(Produto produto){
        for (int i = 0; i < this.produtos.length; i++) {
            if (this.produtos[i] == null) {
                this.produtos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public void imprimeProdutos(){
        int i = 0;
        boolean chegouNoUltimoItem = false;
        while(i < this.produtos.length && !chegouNoUltimoItem){
           if(this.produtos[i] == null){
               chegouNoUltimoItem = true;
           }
           System.out.println(this.produtos[i]);
           i++;
       }
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario != -1 && quantidadeFuncionarios > 0) {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
        return -1;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios >= 31) {
            return 'G';
        } else if (quantidadeFuncionarios >= 10) {
            return 'M';
        }
        return 'P';
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Loja(String nome, int quantidadeFuncionarios, long salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaDeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.produtos = new Produto[quantidadeMaximaDeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaDeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.produtos = new Produto[quantidadeMaximaDeProdutos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(long salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataDeFundacao;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                ", produtos=" + Arrays.toString(produtos) +
                '}';
    }
}