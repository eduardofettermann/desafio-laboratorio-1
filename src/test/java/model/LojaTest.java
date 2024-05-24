package model;

import org.junit.Assert;
import org.junit.Test;

public class LojaTest {

    @Test
    public void deveRetornarTamanhoLojaPequena() {
        Loja loja = new Loja("E3", -1);
        char valorEsperado = 'P';

        char valorRetornado = loja.tamanhoDaLoja();

        Assert.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarTamanhoLojaMedia() {
        Loja loja = new Loja("E3", 10);
        char valorEsperado = 'M';

        char valorRetornado = loja.tamanhoDaLoja();

        Assert.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarTamanhoLojaGrande() {
        Loja loja = new Loja("E3", 31);
        char valorEsperado = 'G';

        char valorRetornado = loja.tamanhoDaLoja();

        Assert.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarGastosComSalario() {
        Loja loja = new Loja("E3", 5, 2000);
        long valorEsperado = 10000;

        double valorRetornado = loja.gastosComSalario();

        Assert.assertEquals(valorEsperado, valorRetornado, 0);
    }

    @Test
    public void deveRetornarMenosUmComSalarioBaseFuncionarioNegativo() {
        Loja loja = new Loja("E3", 5, -1);
        long valorEsperado = -1;

        double valorRetornado = loja.gastosComSalario();

        Assert.assertEquals(valorEsperado, valorRetornado, 0);
    }

    @Test
    public void deveRetornarMenosUmQuandoQuantidadeFuncionariosNegativo() {
        Loja loja = new Loja("E3", -1, 2000);
        long valorEsperado = -1;

        double valorRetornado = loja.gastosComSalario();

        Assert.assertEquals(valorEsperado, valorRetornado, 0);
    }
}
