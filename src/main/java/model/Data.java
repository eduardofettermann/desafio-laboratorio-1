package model;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    public boolean dataValida(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        } else if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            return false;
        } else if (dia == 30 && mes == 2) {
            return false;
        } else if (dia == 29 && mes == 2) {
            return verificaAnoBissexto();
        }
        return true;
    }

    public boolean isDepoisDe(Data dataComparada) {
        if (ano > dataComparada.getAno()) {
            return true;
        } else if (ano == dataComparada.getAno() && mes > dataComparada.getMes()) {
            return true;
        } else return (ano == dataComparada.getAno() && mes == dataComparada.getMes() && dia > dataComparada.getDia());
    }

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Dia inválido, data alterada para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
