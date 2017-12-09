/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11711357_claudiacortes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Claudia Cortes
 */
public class hiloConsumoAno extends Thread {
      boolean Vive;
    boolean avanza;
    JProgressBar barra;
    JLabel dias;
    int Prom_Lluvia_Diaria;
    int Indicador_crecimiento;

    public hiloConsumoAno() {
    }

    public hiloConsumoAno(boolean Vive, boolean avanza, JProgressBar barra,JLabel dias, int Prom_Lluvia_Diaria, int Indicador_crecimiento) {
        this.Vive = Vive;
        this.avanza = avanza;
        this.barra = barra;
        this.dias=dias;
        this.Prom_Lluvia_Diaria=Prom_Lluvia_Diaria;
        this.Indicador_crecimiento=Indicador_crecimiento;
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
    
      @Override
    public void run() {
        while(Vive){
            if (avanza) {
                int Num=Integer.parseInt(dias.getText());
                int Total=Num*Prom_Lluvia_Diaria;
                barra.setValue(Total);
                dias.setText((Num+Indicador_crecimiento)+"");
                if (Num==365) {
                    avanza=false;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("ERROR");
                }
            }
        }
      
    }
    
}
