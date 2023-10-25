import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListadePresenca {


public static void main(String[] args) {


       Map<String, List<String>> presenca = new HashMap<>();

        String data1 = "22-10-2023";

         List<String> 

          chamadaDia1 = new ArrayList<>();

         chamadaDia1.add("Marcelo");
         chamadaDia1.add("Fernando");
         chamadaDia1.add("Amanda");
         chamadaDia1.add("Luiza");

          presenca.put(data1, chamadaDia1);


          
           String data2 = "23-10-2023";

           List<String> 

           chamadaDia2 = new ArrayList<>();

           chamadaDia2.add("Marcelo");
           chamadaDia2.add("Amanda");
           chamadaDia2.add("Luiza");

            presenca.put(data2, chamadaDia2);

            String dataParaConsultar = "22-10-2023";
            String dataParaConsultar2 = "23-10-2023";
        
            List<String> presencaDoDia = presenca.get(dataParaConsultar);
             
            List<String> presencaDoDia2 = presenca.get(dataParaConsultar2);


                if (presencaDoDia != null); {


          System.out.println("Presença em " + dataParaConsultar + " : " + presencaDoDia);


         System.out.println("Presença em " +  dataParaConsultar2 + " : " + presencaDoDia2);

                }


}
}