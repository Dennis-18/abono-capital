/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo.intereses;

/**
 *
 * @author denni
 */
public class cliente {
    
    public cliente() {
        
    }
    
    private String nombre;
    private String apellido;
    private double capitalInicial;
    private double capitalActual;
    private double saldoPagado;
    private int cuotas;
    private int cuotasPagadas = 0;
    private double interes;
    private double montoCuota;


    public double getCapitalActual() {
        return capitalActual;
    }

    public void setCapitalActual(double capitalActual) {
        this.capitalActual = capitalActual;
    }

    public double getSaldoPagado() {
        return saldoPagado;
    }

    public void setSaldoPagado(double saldoPagado) {
        this.saldoPagado = saldoPagado;
    }
    

    public int getCuotasPagadas() {
        return cuotasPagadas;
    }

    public void setCuotasPagadas(int cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getInteres() {
        return interes;
    }

    //interes se recibe como int pero se calcula como porcentaje
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    //retornar el numero de cuotas faltantes por pagar
    public int getCuotasFaltantes() {
        return this.cuotas - this.cuotasPagadas;
    }
    
    //retornar el monto de dinero que hace falta por pagar
    public double getSaldoPendiente() {
        return this.capitalInicial - saldoPagado;
    }
    
    public double getMontoCuota() {
        //return this.capitalInicial / this.cuotas;
        return this.montoCuota;
    }
    
    public void setMontoCuota(double nuevaCuota){
        this.montoCuota = nuevaCuota;
    }
    
    public void pagarCuotaNormal(){
        this.cuotasPagadas += 1;
        this.saldoPagado += this.getMontoCuota();
    }
    
    public void abonar(double monto) {
        double cuotaNueva = ((this.getSaldoPendiente() - monto) * this.interes) / (1 - Math.pow(1 + this.interes, -this.getCuotasFaltantes()));
        this.setSaldoPagado(this.getSaldoPagado() + monto);
        this.setMontoCuota(cuotaNueva);
        System.out.println("Nueva cuota mensual: " + cuotaNueva);
    }
}
