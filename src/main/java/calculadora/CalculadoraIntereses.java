/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author denni
 */
public class CalculadoraIntereses {
    
    public double abonoCapital(int cuotas, int capitalInicial, double tasaInteres) {
        
                //tasaInteres /= 100.0;

        // Calcula la nueva cuota usando la fórmula
        double cuotaNueva = (capitalInicial * tasaInteres) / (1 - Math.pow(1 + tasaInteres, -cuotas));

        return cuotaNueva;
        //return 0;
    }
}
