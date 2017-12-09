/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11711357_claudiacortes;

import javax.swing.JProgressBar;

/**
 *
 * @author Claudia Cortes
 */
public class HiloEnergia extends Thread {
    boolean Vive;
    boolean avanza;
    JProgressBar barra;
    int Consumo1;
    int Condumo2;
    int Consumo3;
    public HiloEnergia() {
    }

    public HiloEnergia(boolean Vive, boolean avanza, JProgressBar barra, int Consumo1, int Condumo2, int Consumo3) {
        this.Vive = Vive;
        this.avanza = avanza;
        this.barra = barra;
        this.Consumo1 = Consumo1;
        this.Condumo2 = Condumo2;
        this.Consumo3 = Consumo3;
    }
    
     @Override
    public void run() {
       while (Vive) {
            if (avanza) {
                int Total = Consumo1 + Condumo2 + Consumo3;
                barra.setValue(barra.getValue() + Total);
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
