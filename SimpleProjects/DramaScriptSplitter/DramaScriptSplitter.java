/*
This is a Simple Script to Read a Drama Script from script.txt file and filter the Dialogues of two people into two different txt files.

The sample script is,
April: So now I'm crazy because I don't love you, right? Is that the point?
Frank: No! Wrong! You're not crazy, and you do love me. That's the point, April.
April: But I don't. I hate you. You were just some boy who made me laugh at a party once, and now I loathe the sight of you. In fact, if you come any closer, if you touch me or anything, I think I'll scream.
Frank: Oh, come on, stop this April.
April: What are you going to do now? Are you going to hit me? To show me how much you love me?
Frank: Don't worry, I can't be bothered

*/

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
