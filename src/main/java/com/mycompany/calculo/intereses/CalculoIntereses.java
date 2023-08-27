/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculo.intereses;
import com.mycompany.calculo.intereses.cliente;
import GUI.InterfazUsuario;
/**
 *
 * @author dennis
 */
public class CalculoIntereses {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        cliente customer = new cliente();
        customer.setNombre("Joel");
        customer.setApellido("Sis");
        customer.setCapitalInicial(10000);
        customer.setCuotas(10);
        customer.setInteres(0.05 / 10);
        //cuota = saldoInicial / total de cuotas
        customer.setMontoCuota(10000 / 10);
        
        System.out.println("====================CALCULO DE CUOTAS LUEGO DE UN ABONO CAPITAL====================");
        System.out.println("Cuotas faltantes: " + customer.getCuotasFaltantes());
        System.out.println("Cuota mensual inicial: "+ customer.getMontoCuota());
        System.out.println("Saldo pendiente de pagar: " + customer.getSaldoPendiente());
        customer.pagarCuotaNormal();
        System.out.println("Se paga una cuota normal...");
        System.out.println("Cuotas faltantes: " + customer.getCuotasFaltantes());
        System.out.println("Nuevo saldo pendiente: " + customer.getSaldoPendiente());
        System.out.println("Se realiza un abono capital de 500");
        customer.abonar(500);
        
        InterfazUsuario ui = new InterfazUsuario();
        ui.setVisible(true);
        
    }
    
}
