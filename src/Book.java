import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book extends LibraryCard implements Convert_Time {
    LibraryCard LibraryCard;
    String BookAuthor;
    String BookTitle;
    String Date1;
    String Date2;
    String DeltaDate;
    public String STime;
    public String dTime;


    public Book (LibraryCard libraryCard, String bookAuthor, String bookTitle, String date1, String date2, String deltaDate) {

        LibraryCard = libraryCard;
        BookAuthor = bookAuthor;
        BookTitle = bookTitle;
        Date1 = date1;
        Date2 = date2;
        DeltaDate = deltaDate;
    }

    public Book() {
    }

    public long getTime(String STime) throws ParseException {
       this.STime = STime;
        SimpleDateFormat format = new SimpleDateFormat("d MMMM yyyy года");
        Date date = format.parse(STime);
        long mill_sec;
        mill_sec = date.getTime();

        return mill_sec/86400000;
    }

    public void getTimeJournal(Book Book, String STime, String dTime) throws ParseException {
        this.STime = String.valueOf(getTime(STime));
        Book.Date1 = STime;
        // вывод в сутках
        //Book.DeltaDate = dTime;
        Book.DeltaDate = dTime;

    }

    public void backTimeJournal(Book Book, String STime) throws ParseException {
        this.STime = String.valueOf(getTime(STime));
        Book.Date2 = STime;
        // вывод в сутках
        //Book.DeltaDate = dTime;
        //Book.DeltaDate = dTime;

    }

    @Override
    public String toString() {

        return "Студент:"+ LibraryCard.Student+ ", Книга: " +  BookAuthor + ", " + BookTitle + ", " + "Дата выдачи: " + Date1 + ", Выдана на " + DeltaDate + " сут.," + "Дата сдачи: " + Date2;
    }
}


