package model;

import model.loja.Informatica;
import model.loja.Loja;

import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaMaisCara = null;
        for (Loja loja : lojas) {
            if(loja instanceof Informatica){
                Informatica informatica = (Informatica) loja;
                if(lojaMaisCara == null || informatica.getSeguroEletronicos() > lojaMaisCara.getSeguroEletronicos()){
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int quantidade = 0;
        for (Loja loja : lojas) {
           if(loja.toString() != null && loja.toString().contains(tipo)){
               quantidade++;
           }
        }
        return quantidade;
    }

    public boolean removeLoja(String nomeDaLoja){
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeDaLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaDeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaDeLojas];
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
}