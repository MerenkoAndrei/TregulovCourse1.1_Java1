package Lesson4;

public class Homework4 {
    int ticketNumber;
    String name;
    String surname;
    int yearOfStudy;
    double assessmentInMathematics;
    double assessmentOfTheEconomy;
    double foreignLanguageAssessment;
}

class Student1 {
    public static void main(String[] args) {
        Homework4 h1 = new Homework4();
        h1.name = "Misha";
        h1.surname = "Orlov";
        h1.ticketNumber = 1;
        h1.yearOfStudy = 1999;
        h1.assessmentInMathematics = 5;
        h1.assessmentOfTheEconomy = 4;
        h1.foreignLanguageAssessment = 3;

        Homework4 h2 = new Homework4();
        h2.name = "Ира";
        h2.surname = "Иванова";
        h2.ticketNumber = 15;
        h2.yearOfStudy = 2000;
        h2.assessmentInMathematics = 4;
        h2.assessmentOfTheEconomy = 3;
        h2.foreignLanguageAssessment = 2;

        Homework4 h3 = new Homework4();
        h3.name = "Юра";
        h3.surname = "Петров";
        h3.ticketNumber = 31;
        h3.yearOfStudy = 2001;
        h3.assessmentInMathematics = 3;
        h3.assessmentOfTheEconomy = 4;
        h3.foreignLanguageAssessment = 2;
        System.out.println("Имя студента: " + h1.name + "\n" + "Фамилия студента: " + h1.surname + "\n" +
                "Номер студ.билета: " + h1.ticketNumber + "\n" + "Год обучения: " + h1.yearOfStudy + "\n" +
                "Средняя оценка:" + (h1.assessmentInMathematics + h1.assessmentOfTheEconomy +
                h1.foreignLanguageAssessment) / 3);
        System.out.println("\nИмя студента: " + h2.name + "\n" + "Фамилия студента: " + h2.surname + "\n" +
                "Номер студ.билета: " + h2.ticketNumber + "\n" + "Год обучения: " + h2.yearOfStudy + "\n" +
                "Средняя оценка:" + (h2.assessmentInMathematics + h2.assessmentOfTheEconomy +
                h2.foreignLanguageAssessment) / 3);
        System.out.println("\nИмя студента: " + h3.name + "\n" + "Фамилия студента: " + h3.surname + "\n" +
                "Номер студ.билета: " + h3.ticketNumber + "\n" + "Год обучения: " + h3.yearOfStudy + "\n" +
                "Средняя оценка:" + (h3.assessmentInMathematics + h3.assessmentOfTheEconomy +
                h3.foreignLanguageAssessment) / 3);
    }
}
