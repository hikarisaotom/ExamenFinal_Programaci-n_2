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
    ArrayList R_1 = new ArrayList();//Los Laureles.
    ArrayList R_2 = new ArrayList();//La concepcion.
    ArrayList R_3 = new ArrayList();//Fco. Morazan.
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
               System.out.println(Linea);
               String[] S = Linea.split(";");
               System.out.println(S[0]);
               System.out.println(S[1]);
               String Caracter="(";
               String[] S_1 = S[0].split("\\|");
               String [] S_2=S_1[0].split("\\(");
               String R_1=S_2[1];
               String R_2=S_1[1];
               String R_3=S_1[2].substring(0,S_1[2].length()-1);
               System.out.println("PRIMERA REPRESA "+R_1);
               System.out.println("SEGUNDA REPRESA "+R_2);
               System.out.println("TERCERA  REPRESA "+R_3);

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