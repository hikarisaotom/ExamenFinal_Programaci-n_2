/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11711357_claudiacortes;

import javax.swing.JProgressBar;


public class HiloRepresa extends Thread{

    boolean Vive;
    boolean avanza;
    JProgressBar barra;
    JProgressBar BarraPadre;
    double Porcentaje;

    public HiloRepresa(boolean Vive, boolean avanza, JProgressBar barra, JProgressBar BarraPadre, double Porcentaje) {
        this.Vive = Vive;
        this.avanza = avanza;
        this.barra = barra;
        this.BarraPadre = BarraPadre;
        this.Porcentaje = Porcentaje;
    }
    
    public HiloRepresa() {
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
               int Num_Barra=BarraPadre.getValue();
              double  Total=Num_Barra*Porcentaje;
               barra.setValue((int)Total);
                System.out.println(barra.getValue());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("ERROR");
                }
            }
        }
    }

}
