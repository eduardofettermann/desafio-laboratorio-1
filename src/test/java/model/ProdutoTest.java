package model;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
    @Test
    public void deveRetornarVerdadeiroQuandoProdutoEstiverVencido(){
        Produto produto = new Produto("Água", 10, new Data(1, 1, 2020));
        Data dataAtual = new Data(13, 5, 2024);
        boolean valorEsperado = true;

        boolean valorRetornado = produto.estaVencido(dataAtual);

        Assert.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoProdutoNaoEstiverVencido(){
        Produto produto = new Produto("Banana", 10, new Data(1, 12, 2024));
        Data dataAtual = new Data(13, 5, 2024);
        boolean valorEsperado = false;

        boolean valorRetornado = produto.estaVencido(dataAtual);

        Assert.assertEquals(valorEsperado, valorRetornado);
    }
}
