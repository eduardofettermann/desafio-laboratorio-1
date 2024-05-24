package model;

import org.junit.Assert;
import org.junit.Test;

public class DataTest {
    @Test
    public void deveRetornarVerdadeiroQuandoOAnoForBissexto() {
        Data data = new Data(1, 1, 2000);

        boolean valorRetornado = data.verificaAnoBissexto();

        Assert.assertTrue(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoOAnoNaoForBissexto() {
        Data data = new Data(1, 1, 2001);

        boolean valorRetornado = data.verificaAnoBissexto();

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaForInvalido() {
        Data data = new Data(32, 1, 2000);

        boolean valorRetornado = data.dataValida(32, 1, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoOMesForInvalido() {
        Data data = new Data(1, 13, 2000);

        boolean valorRetornado = data.dataValida(1, 13, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoOAnoForInvalido() {
        Data data = new Data(1, 1, 0);

        boolean valorRetornado = data.dataValida(1, 1, 0);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaFor31EMesForAbril() {
        Data data = new Data(31, 4, 2000);

        boolean valorRetornado = data.dataValida(31, 4, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaFor31EMesForJunho() {
        Data data = new Data(31, 6, 2000);

        boolean valorRetornado = data.dataValida(31, 6, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaFor31EMesForSetembro() {
        Data data = new Data(31, 9, 2000);

        boolean valorRetornado = data.dataValida(31, 9, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaFor31EMesForNovembro() {
        Data data = new Data(31, 11, 2000);

        boolean valorRetornado = data.dataValida(31, 11, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaFor30EMesForFevereiro() {
        Data data = new Data(30, 2, 2000);

        boolean valorRetornado = data.dataValida(30, 2, 2000);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarFalsoQuandoODiaFor29EMesForFevereiroEAnoNaoForBissexto() {
        Data data = new Data(29, 2, 2001);

        boolean valorRetornado = data.dataValida(29, 2, 2001);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarVerdadeiroQuandoODiaFor29EMesForFevereiroEAnoForBissexto() {
        Data data = new Data(29, 2, 2000);

        boolean valorRetornado = data.dataValida(29, 2, 2000);

        Assert.assertTrue(valorRetornado);
    }

    @Test
    public void deveRetornarVerdadeiroQuandoODiaForValido() {
        Data data = new Data(1, 1, 2000);

        boolean valorRetornado = data.dataValida(1, 1, 2000);

        Assert.assertTrue(valorRetornado);
    }

    @Test
    public void deveRetornarIniciarADataPadraoQuandoODiaForInvalido() {
        Data data = new Data(32, 1, 2000);
        int diaEsperado = 1;
        int mesEsperado = 1;
        int anoEsperado = 2000;

        int diaRetornado = data.getDia();
        int mesRetornado = data.getMes();
        int anoRetornado = data.getAno();

        Assert.assertEquals(diaEsperado, diaRetornado);
        Assert.assertEquals(mesEsperado, mesRetornado);
        Assert.assertEquals(anoEsperado, anoRetornado);
    }

    @Test
    public void deveRetornarDataFormatadaCorretamente(){
        Data data = new Data(1, 1, 2000);
        String dataEsperada = "1/1/2000";

        String dataRetornada = data.toString();

        Assert.assertEquals(dataEsperada, dataRetornada);
    }

    @Test
    public void deveRetornarFalsoQuandoDataForAnterior(){
        Data data = new Data(1, 1, 2000);
        Data dataComparada = new Data(2, 1, 2000);

        boolean valorRetornado = data.isDepoisDe(dataComparada);

        Assert.assertFalse(valorRetornado);
    }

    @Test
    public void deveRetornarVerdadeiroQuandoDataForPosterior(){
        Data data = new Data(2, 1, 2000);
        Data dataComparada = new Data(1, 1, 2000);

        boolean valorRetornado = data.isDepoisDe(dataComparada);

        Assert.assertTrue(valorRetornado);
    }
}
