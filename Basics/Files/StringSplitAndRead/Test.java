import java.io.*;

public class Test {
    public static void main(String[] args){
        try {
            String Thisline;
            String[] LinePart;
            BufferedReader BR = new BufferedReader(new FileReader("info.txt"));
            BufferedWriter BW = new BufferedWriter(new FileWriter("Test.txt"));
            while ((Thisline = BR.readLine()) != null) {
                LinePart = Thisline.split(" ");
                String percentsStr = LinePart[3].split("%")[0];
                int Percent = Integer.parseInt(percentsStr);
                if (Percent <= 50) {
                    BW.write(Thisline);
                    BW.newLine();
                }
            }
            BW.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
