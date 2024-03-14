/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocontabancaria;

/**
 *
 * @author lucas
 */
public class ContaPoupanca extends Conta {
    private double saldo;
    
    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo*taxa;
    }
    
    @Override
    public void deposita(double valor) {
        this.saldo += valor-1;
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
}
