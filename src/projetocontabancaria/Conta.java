/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocontabancaria;

/**
 *
 * @author lucas
 */
public class Conta {
    private double saldo;
    
    public void atualiza(double taxa){
        this.saldo += this.saldo*taxa;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
