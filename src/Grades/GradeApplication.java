package Grades;


import java.util.HashMap;

import java.util.Scanner;

public class GradeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        String userInput;
        boolean confirm = true;

        //  1
        Student alex = new Student("Alex");
        alex.addGrade(83);
        alex.addGrade(92);
        alex.addGrade(80);
        alex.addGrade(70);

        //  2
        Student homer = new Student("Homer");
        homer.addGrade(12);
        homer.addGrade(43);
        homer.addGrade(20);
        homer.addGrade(15);

        //  3
        Student saitama = new Student("Saitama");
        saitama.addGrade(90);
        saitama.addGrade(91);
        saitama.addGrade(52);
        saitama.addGrade(73);

        //  4
        Student dio = new Student("Dio");
        dio.addGrade(100);
        dio.addGrade(100);
        dio.addGrade(98);
        dio.addGrade(100);

        students.put("Alexander", alex);
        students.put("HomerSimpson", homer);
        students.put("OnePunch", saitama);
        students.put("DioBrando", dio);

        alex.recordAttendance("1-21-2020", "A");
        alex.recordAttendance("1-24-2020", "P");
        alex.recordAttendance("1-26-2020", "P");

        homer.recordAttendance("1-21-2020", "A");
        homer.recordAttendance("1-24-2020", "A");
        homer.recordAttendance("1-26-2020", "A");

        saitama.recordAttendance("1-21-2020", "A");
        saitama.recordAttendance("1-24-2020", "P");
        saitama.recordAttendance("1-26-2020", "A");

        dio.recordAttendance("1-21-2020", "P");
        dio.recordAttendance("1-24-2020", "P");
        dio.recordAttendance("1-26-2020", "P");

        while (confirm) {
            printPrompt(students);
            // Request username entry
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("all")) {
                printAllGrades(students);
            } else if (userInput.equalsIgnoreCase("overall")) {
                printOverall(students);
//            } else if (userInput.equalsIgnoreCase("csv")) {
//                printCSVReport(students);
            } else {
                printStudentData(students, userInput);
            }
            System.out.print("\nwant to see another student? Enter 'y': ");
            userInput = scanner.next();
            if (!userInput.equalsIgnoreCase("y")) {
                System.out.println("~Exiting~");
                confirm = false;
            }
        }
    }



//   ------------------------------------------------------------------------------------

    public static void printPrompt(HashMap<String, Student> students) {
        System.out.println("Welcome!");
        System.out.println("\nHere is the list of the student's GitHub names:\n");
        int i = 1;
        System.out.print("/");
        for (String username : students.keySet()) {
            System.out.printf(" %d. %s |", i, username);
            i++;
        }
        System.out.println("\n\nWhat student would you like to see more information on? Enter username, 'all' for all grades or 'overall' for overall grade: ");
    }

//    ---------------------------------------------------------------------------

    public static void printAllGrades(HashMap<String, Student> students) {
        System.out.printf("%s %s\n", "Student Name", "Grades");
        for (Student student : students.values()) {
            System.out.printf("%25s %s\n", student.getName(), student.getGrades());
        }
    }

//    ---------------------------------------------------------------------------

    public static void printOverall(HashMap<String, Student> students) {
        double overallGrade = 0;
        for (Student student : students.values()) {
            overallGrade += student.getGradeAverage();
        }
        System.out.printf("The overall class grade is: %.2f", overallGrade / students.size());
    }

//    ---------------------------------------------------------------------------

    public static void printStudentData(HashMap<String, Student> students, String gitHubUsername) {
        Student foundStudent;
        if (!students.containsKey(gitHubUsername)) {
            System.out.printf("Sorry, unable to find username of %s", gitHubUsername);
        } else {
            foundStudent = students.get(gitHubUsername);
            System.out.printf("Name: %s - GitHub username - %s\n"
                    + "Current Grade Average - %.2f\n", foundStudent.getName(), gitHubUsername, foundStudent.getGradeAverage());
            System.out.printf("List of grades: %s\n", foundStudent.getGrades());
            System.out.printf("List of Dates Absent: %s\n", foundStudent.getDaysAbsent());
            System.out.printf("Percentage of days attended: %.2f\n", foundStudent.calculateAttendance());
        }
    }


}