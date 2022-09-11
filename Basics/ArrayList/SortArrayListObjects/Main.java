import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws Exception {

        BufferedReader BR = new BufferedReader(new FileReader("C:/Users/WALTON/Desktop/Shahed2/src/book.txt"));
        String line;
        String[] lineParts;
        ArrayList BookList = new ArrayList();
        int i = 0;
        while ((line = BR.readLine())!=null){
            lineParts = line.split(",");
            String Bookname = lineParts[0];
            String Bookid = lineParts[1];
            String Author = lineParts[2];
            long PublishYear = Integer.parseInt(lineParts[3]);
            BookList.add(new Book(Bookname, Bookid, Author, PublishYear));
        }

        System.out.println("Search for Book Name:");
        Scanner sc = new Scanner(System.in);
        String Query = sc.nextLine();

        boolean isAvailable = false;
        for (int j=0; j<BookList.size(); j++){
            String Name = ((Book)BookList.get(j)).getBookName();
            if(Name.contains(Query)){
                isAvailable = true;
                System.out.println(Query + " is Available");
                break;
            }else{
                isAvailable = false;
            }
        }
        if(isAvailable == false){
            System.out.println(Query + " is Not Available");

        }


        JFrame newFrame1 = new JFrame();
        newFrame1.setSize(450,250);
        newFrame1.setLocation(100,100);
        newFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Get Containers for contents
        Container mainContainer = newFrame1.getContentPane();
        //Set Main Container Layout
        mainContainer.setLayout(new GridLayout(7,1));


        JTextArea newText1 = new JTextArea();
        mainContainer.add(newText1);

        Collections.sort(BookList);
        for (int j=0; j<BookList.size(); j++){
            long as = ((Book)BookList.get(j)).getPublishing_Year();
            newText1.append(String.valueOf(as));
            newText1.append(", ");
        }

        newFrame1.setVisible(true);
        newFrame1.setResizable(false);
    }
}



