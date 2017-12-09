/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11711357_claudiacortes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Claudia Cortes
 */
public class hiloConsumo extends Thread {
    boolean Vive;
    boolean avanza;
    JProgressBar barra;
    int Consumo1;
    int Condumo2;
    int Consumo3;
   JProgressBar RE_1;
      JProgressBar RE_2;
         JProgressBar  RE_3;

            
    public hiloConsumo(boolean Vive, boolean avanza, JProgressBar barra, int Consumo1, int Condumo2, int Consumo3,JProgressBar RE_1,JProgressBar RE_2,JProgressBar RE_3) {
        this.Vive = Vive;
        this.avanza = avanza;
        this.barra = barra;
        this.Consumo1 = Consumo1;
        this.Condumo2 = Condumo2;
        this.Consumo3 = Consumo3;
        this.RE_1=RE_1;
        this.RE_2=RE_2;
        this.RE_3=RE_3;
    }
    
    public hiloConsumo() {
    }

    @Override
    public void run() {

        while (Vive) {
            if (avanza) {
                int Total = Consumo1 + Condumo2 + Consumo3;
                barra.setValue(barra.getValue() + Total);
                RE_1.setValue(RE_1.getValue() - Consumo1);
                RE_2.setValue(RE_2.getValue() - Condumo2);
                RE_3.setValue(RE_3.getValue() - Consumo3);
                System.out.println("DECREMENTADO NIVELES DE LAS REPRESAS.....");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }
            }

        }

    }

    public boolean isVive() {
        return Vive;
    }

    public void setVive(boolean Vive) {
        this.Vive = Vive;
    }

    public boolean isAvanza() {
        return avanza;
    }

    public void setAvanza(boolean avanza) {
        this.avanza = avanza;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
}
