import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class LibraryCard {
    int CardNumber;
    String Student;
    String StudentGroup;

    public LibraryCard(int cardNumber, String student, String studentGroup) {
        CardNumber = cardNumber;
        Student = student;
        StudentGroup = studentGroup;
    }

    public LibraryCard() {

    }


    public String toString() {

        return "Номер читательского билета: " + CardNumber + ", ФИО студента: " + Student + ", Группа студента:" + StudentGroup;

    }
}
