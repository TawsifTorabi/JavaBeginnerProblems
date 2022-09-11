import java.io.Serializable;

public class Book implements Comparable {
    String BookName;
    String Book_ID;
    String Author;
    long Publishing_Year;
    public Book(String BookName, String Book_ID, String Author, long Publishing_Year){
        this.Author = Author;
        this.Book_ID = Book_ID;
        this.BookName = BookName;
        this.Publishing_Year = Publishing_Year;
    }

    public String getBookName() {
        return BookName;
    }
    public String getBook_ID() {
        return Book_ID;
    }
    public String getAuthor() {
        return Author;
    }
    public long getPublishing_Year() {
        return Publishing_Year;
    }

    @Override
    public int compareTo(Object comparestu) {
        int compareage= (int) ((Book)comparestu).getPublishing_Year();
        /* For Ascending order*/
        return (int) (this.Publishing_Year-compareage);
        /* For Descending order do like this */
        //return compareage-this.studentage;
    }



}


