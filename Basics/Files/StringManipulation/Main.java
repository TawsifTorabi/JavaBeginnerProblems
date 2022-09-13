import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader Reader = new BufferedReader(new FileReader("E:/University/7th Semester/OOP LAB/Online4/untitled/src/info.txt"));
        BufferedWriter Writer = new BufferedWriter(new FileWriter("E:/University/7th Semester/OOP LAB/Online4/untitled/src/Test.txt"));

        String CurrentLine;
        String[] lineParts;

        while ((CurrentLine = Reader.readLine())!=null){
            lineParts = CurrentLine.split(" ");
            int Scholarship = Integer.parseInt(lineParts[3].split("%")[0]);
            if(Scholarship <= 50){
                Writer.write(CurrentLine);
                Writer.newLine();
            }
        }
        Writer.flush();
    }
}
