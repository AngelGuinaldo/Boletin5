package boletin5;

import java.util.Scanner;

public class Conta {

    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    //constructor vacio
    public Conta() {

    }

    //Constructor con parametros
    public Conta(String nomeCliente, String numeroConta, Double saldo) {
        this.saldo = saldo;

        //setters
    }

    public void setCliente(String cliente) {
        this.nomeCliente = cliente;
    }

    public void setConta(String conta) {
        this.numeroConta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //getters
    public String getCliente(String cliente) {
        return cliente;
    }

    public String getConta(String conta) {
        return conta;
    }

    public double getSaldo(double saldo) {
        return saldo;
    }

    //Metodos
    public double ingreso(double x) {
        if (x < 0);
        Scanner ler = new Scanner(Sytem.in);
        double ingreso;
        ingreso = x;
        ingreso = ler.nextDouble();
        return saldo + x;
    }

    public double reintegro(double x) {
        while (x <= saldo) {
            double saldoResultante;
            saldoResultante = saldo - x;
            return saldoResultante;
        }
        return 0;

    }

    public void verDatos() {
        System.out.println("Nome cliente: " + nomeCliente + "; Numero de conta:" + numeroConta + "; Saldo actual: " + saldo);

    }
}
