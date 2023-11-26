import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<LibraryCard> LC_arr = new ArrayList<LibraryCard>();
        LibraryCard LC1 = new LibraryCard(1, "Vavilova Elena", "32");
        LibraryCard LC2 = new LibraryCard(2, "Stepan", "132");
        LC_arr.add(0, LC1);
        LC_arr.add(1, LC2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию и имя студента: ");
        String Student_Name = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < LC_arr.size(); i++) {
            LibraryCard LC_current = LC_arr.get(i);
            if (LC_current.Student.contains(Student_Name)) {
                System.out.println("Ваши учетные данные:");
                System.out.println(LC_current);
                break;
            } else {
                sum = sum + 1;
            }
        }

        if (sum == LC_arr.size()) {
            System.out.println("Для получения читательского билета введите следующие данные: ");
            System.out.print("группа студента:");
            String Student_Gr = scanner.nextLine();
            System.out.print("Номер билета:");
            int Student_N = scanner.nextInt();
            LibraryCard VV = new LibraryCard(Student_N, Student_Name, Student_Gr);
            LC_arr.add(VV);
            System.out.println("Создан читательский билет:");
            System.out.println(VV);

        }

        Book Book1 = new Book(LC1, "Л.Толстой", "Война и мир", "13 ноября 2023 года", "16 ноября 2023 года", "10");
        Book Book2 = new Book(LC2, "М.Горький", "Мать", "11 ноября 2023 года", "12 ноября 2023 года", "3");
        Book2.getTimeJournal(Book2, "21 ноября 2023 года", "1");
        Book2.backTimeJournal(Book2, "28 ноября 2023 года");

        ArrayList<Book> Book_arr = new ArrayList<Book>();
        Book_arr.add(0, Book1);
        Book_arr.add(1, Book2);

        System.out.println("Должники:");
            for (Book Book_current : Book_arr) {
            if ((Book_current.getTime(Book_current.Date2) - Book_current.getTime(Book_current.Date1)) > Long.parseLong(Book_current.DeltaDate)) {
                System.out.println(Book_current);
            }
            }

           }
}