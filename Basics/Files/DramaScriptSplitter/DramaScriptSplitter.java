import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileChooserApp {
    public static void main(String[] args) throws Exception {

        BufferedReader BR = new BufferedReader(new FileReader("C:/script.txt"));
        BufferedWriter BW = new BufferedWriter(new FileWriter("C:/frank.txt"));
        BufferedWriter BW1 = new BufferedWriter(new FileWriter("C:/april.txt"));

        int frankcout = 0;
        int aprilcount = 0;
        String line;

        String[] lineParts;


        while ((line = BR.readLine())!=null){
            lineParts = line.split(" ");


            if(lineParts[0].equals("April:")){
                String x="";
                aprilcount++;
                for (int i = 1;i<lineParts.length;i++)
                {
                    x = x + lineParts[i]+" ";
                }
                BW1.write(aprilcount+"."+x);
                BW1.newLine();
                x = "";
            }


            if(lineParts[0].equals("Frank:"))
            {
                String y="";
                frankcout++;
                for (int i = 1;i<lineParts.length;i++)
                {
                    y = y + lineParts[i]+" ";
                }
                BW.write(frankcout+"."+y);
                BW.newLine();
                y = "";
            }


        }
        BW.flush();
        BW1.flush();
    }
}
