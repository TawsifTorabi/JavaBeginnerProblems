public class BanglaChars {
    public static void main(String[] args) {

        char[] bnchar = {0x0986, 0x09AE, 0x09BE, 0x09B0, 0x0020, 0x09B8, 0x09CB, 0x09A8 ,0x09BE ,0x09B0 ,0x0020 ,0x09AC ,0x09BE ,0x0982 ,0x09B2, 0x09BE};
        //Array of Unicode Characters, to avoid creating individual variables

        for (int i = 0; i<bnchar.length; i++) {     //This For Loop will loop bnchar values counts
            char newChar = bnchar[i];               //I could avoid this line
            System.out.print(newChar);              //Prints Result

        }
    }
}

//  I used references from Internet
//  https://www.w3schools.com/java/java_arrays.asp
