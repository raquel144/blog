// 1. Utilizando os conhecimentos de O.O. construa um programa que represente uma `Data` utilizando as informações abaixo.

public class Data {
    // Toda Data deve representar dia, mês e ano.
    int dia, mes, ano;

    // Construtor da classe
    public Data(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    // Toda Data deve poder saber se ela é anterior
    public boolean anterior(Data outra) {
        if (ano < outra.ano) return true;
        if (ano == outra.ano && mes < outra.mes) return true;
        if (ano == outra.ano && mes == outra.mes && dia < outra.dia) return true;
        return false;
    }

    // posterior
    public boolean posterior(Data outra) {
        if (ano > outra.ano) return true;
        if (ano == outra.ano && mes > outra.mes) return true;
        if (ano == outra.ano && mes == outra.mes && dia > outra.dia) return true;
        return false;
    }// ou igual a outra `Data`
     public boolean igual(Data outra) {
        return dia == outra.dia && mes == outra.mes && ano == outra.ano;
    }

    // Toda `Data` deve poder incrementar o dia depois de criada
    public void incrementarDia() {
        dia = dia + 1;
        // Simplesmente avança o dia (sem lógica de virar o mês/ano, só pra entender o conceito)
    }

    // Toda `Data` deve poder exibir suas informações no formato texto
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}



















//console
//Data 1: 1/1/2024 | Data 2: 2/1/2024
//data1.anterior(data2): true
//data1.posterior(data2): false
//data1.igual(data2): false
//Data 1 :2/1/2024| Data 2 2/1/2024
//data1.anterior(data2): false
//data1.posterior(data2): false
//data1.igual(data2): true
//Data 1 :3/1/2024| Data 2 2/1/2024
//data1.anterior(data2): false
-//data1.posterior(data2): true
//data1.igual(data2): false`

