package pkg11711357_claudiacortes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class adm_Archivo {
    File Archivo;
    int IndicadorDia=0;
    int Indicador_crecimiento=0;
    int Prom_Lluvia_Diaria=0;
    double Indicador_Porcentaje_Represas=0.0;
    ArrayList Re_1 = new ArrayList();//Los Laureles.
    ArrayList Re_2 = new ArrayList();//La concepcion.
    ArrayList Re_3 = new ArrayList();//Fco. Morazan.
    /*INDICADORES DE CONSUMO*/
    ArrayList In_1 = new ArrayList();//Los Laureles.
    ArrayList In_2 = new ArrayList();//La concepcion.
    ArrayList In_3 = new ArrayList();//Fco. Morazan.
    public adm_Archivo( String Path) {
    Archivo=new File(Path);
    }

    public adm_Archivo() {
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    public int getIndicadorDia() {
        return IndicadorDia;
    }

    public void setIndicadorDia(int IndicadorDia) {
        this.IndicadorDia = IndicadorDia;
    }

    public int getIndicador_crecimiento() {
        return Indicador_crecimiento;
    }

    public void setIndicador_crecimiento(int Indicador_crecimiento) {
        this.Indicador_crecimiento = Indicador_crecimiento;
    }

    public int getProm_Lluvia_Diaria() {
        return Prom_Lluvia_Diaria;
    }

    public void setProm_Lluvia_Diaria(int Prom_Lluvia_Diaria) {
        this.Prom_Lluvia_Diaria = Prom_Lluvia_Diaria;
    }

    public double getIndicador_Porcentaje_Represas() {
        return Indicador_Porcentaje_Represas;
    }

    public void setIndicador_Porcentaje_Represas(double Indicador_Porcentaje_Represas) {
        this.Indicador_Porcentaje_Represas = Indicador_Porcentaje_Represas;
    }

    public ArrayList getRe_1() {
        return Re_1;
    }

    public void setRe_1(ArrayList Re_1) {
        this.Re_1 = Re_1;
    }

    public ArrayList getRe_2() {
        return Re_2;
    }

    public void setRe_2(ArrayList Re_2) {
        this.Re_2 = Re_2;
    }

    public ArrayList getRe_3() {
        return Re_3;
    }

    public void setRe_3(ArrayList Re_3) {
        this.Re_3 = Re_3;
    }

    public ArrayList getIn_1() {
        return In_1;
    }

    public void setIn_1(ArrayList In_1) {
        this.In_1 = In_1;
    }

    public ArrayList getIn_2() {
        return In_2;
    }

    public void setIn_2(ArrayList In_2) {
        this.In_2 = In_2;
    }

    public ArrayList getIn_3() {
        return In_3;
    }

    public void setIn_3(ArrayList In_3) {
        this.In_3 = In_3;
    }
    
    public void CargarArchivo(){
    FileReader fr;
    BufferedReader br;
    try{
       fr= new FileReader(Archivo);
       br= new BufferedReader(fr);
       String Linea;
       int Cont=1;
       while( (Linea=br.readLine())!=null){
           //System.out.println(Cont+Linea);
           Cont++;
           if (Cont==8) {
               System.out.println("LINEA 7");
               String [] S= Linea.split(";");
               String Dia= S[0].split(":")[1];
               String Incremento = S[1].split(":")[1];
                 System.out.println("INDICADOR DIA: "+Dia);
               System.out.println("INDICADOR CRECIMIENTO"+Incremento);
               IndicadorDia = Integer.parseInt(Dia);
               Indicador_crecimiento = Integer.parseInt(Incremento);
               //System.out.println(IndicadorDia+ " "+ Indicador_crecimiento);
           }else if (Cont==12){
                System.out.println("LINEA 12");
               // System.out.println(Linea);
               String [] S= Linea.split(";");
               String Dia= S[0].split(":")[1];
               String Incremento = S[1].split(":")[1];
                 System.out.println("Prom_Lluvia_Diaria: "+Dia);
               System.out.println(" Indicador_Porcentaje_Represas"+Incremento);
               Prom_Lluvia_Diaria = Integer.parseInt(Dia);
               Indicador_Porcentaje_Represas = Double.parseDouble(Incremento);
             //  System.out.println(Prom_Lluvia_Diaria +" "+Indicador_Porcentaje_Represas);
           } else if (Cont == 17) {
               System.out.println("LINEA 17");
//               System.out.println(Linea);
               String[] S = Linea.split(";");
//               System.out.println(S[0]);
//               System.out.println(S[1]);
               String Caracter = "(";
               String[] S_1 = S[0].split("\\|");
               String[] S_2 = S_1[0].split("\\(");
               String R_1 = S_2[1];
               String R_2 = S_1[1];
               String R_3 = S_1[2].substring(0, S_1[2].length() - 1);
//               System.out.println("PRIMERA REPRESA " + R_1);
//               System.out.println("SEGUNDA REPRESA " + R_2);
//               System.out.println("TERCERA  REPRESA " + R_3);
               String[] Final_1 = R_1.split(":");
               String[] Final_2 = R_2.split(":");
               String[] Final_3 = R_3.split(":");
               Re_1.add(Final_1[0]);
               Re_1.add(Double.parseDouble(Final_1[1]));
               Re_2.add(Final_2[0]);
               Re_2.add(Double.parseDouble(Final_2[1]));
               Re_3.add(Final_3[0]);
               Re_3.add(Double.parseDouble(Final_3[1]));
               System.out.println("LOS ARREGLOS LLENOS: ");
               System.out.println(Re_1);
               System.out.println(Re_2);
               System.out.println(Re_3);

                /*LA SEGUNDA LINEA*/
                String[] S2_1 = S[1].split("\\|");
                String[] S2_2 = S2_1[0].split("\\(");
                String R2_1 = S2_2[1];
                String R2_2 = S2_1[1];
                String R2_3 = S2_1[2].substring(0, S_1[2].length() - 1);
//               System.out.println("INDICADOR DE CONSUMO");
//               System.out.println(R2_1);
//               System.out.println(R2_2);
//               System.out.println(R2_3);
                In_1.add(R2_1.split(":")[0]);
               In_1.add(Integer.parseInt(R2_1.split(":")[1]));
               In_2.add(R2_2.split(":")[0]);
               In_2.add(Integer.parseInt(R2_2.split(":")[1]));
               In_3.add(R2_3.split(":")[0]);
               In_3.add(Integer.parseInt(R2_3.split(":")[1]));
               System.out.println("LOS INDICADORES DE CONSUMO");
               System.out.println(In_1);
               System.out.println(In_2);
               System.out.println(In_3);
            }
        }
    }catch(Exception e){
        
    }
    }
    
    public void EscribirArchivo(){
        FileWriter fw;
        BufferedWriter bw;
        
    }
    
}

//               for (int i = 0; i <S.length; i++) {
//                  
//                    String [] S_1=S[i].split(":");
//                    for (int j = 0; j <S_1.length; j++) {
//                        System.out.println(S_1[j]);
//                   }
//                  
//               }