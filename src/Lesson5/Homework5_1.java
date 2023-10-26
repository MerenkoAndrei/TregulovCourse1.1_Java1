package Lesson5;

public class Homework5_1 {
    int ticketNumber;
    String name;
    String surname;
    int yearOfStudy;
    double assessmentInMathematics;
    double assessmentOfTheEconomy;
    double foreignLanguageAssessment;

    void srednArif(int ticket, String s, String s1, int year, double matem, double econom, double language) {
        ticketNumber = ticket;
        name = s;
        surname = s1;
        yearOfStudy = year;
        assessmentInMathematics = matem;
        assessmentOfTheEconomy = econom;
        foreignLanguageAssessment = language;
        System.out.println("\nИмя студента: " + s + "\n" + "Фамилия студента: " + s1 + "\n" +
                "Номер студ.билета: " + ticket + "\n" + "Год обучения: " + year + "\n" +
                "Средняя оценка:" + (matem + econom + language) / 3);
    }
}

class Student {
    public static void main(String[] args) {
        Homework5_1 h1 = new Homework5_1();
        h1.srednArif(1, "Ира", "Матвеева", 1998, 3, 3, 2);
        Homework5_1 h2 = new Homework5_1();
        h2.srednArif(22, "Игорь", "Серпухов", 2015, 4, 3, 5);
        Homework5_1 h3 = new Homework5_1();
        h3.srednArif(35, "Иван", "Егоров", 2019, 5, 3, 5);
    }
}