package Grades;



import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns student's name
    public String getName() {
        return this.name;
    }

    // returns student grades
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // adds grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : this.grades) {
            total += grade;
        }
        return total / this.grades.size();
    }

    // record to the hashmap for attendance
    public void recordAttendance(String date, String value) {
        if (value.equals("A") || value.equals("P")) {
            System.out.printf("Date saved: %s with %s\n", date, value);
            this.attendance.put(date, value);
        } else {
            System.out.println("Uh...stuff isn't working boss. You need to enter A for Absent - or - P for Present");
        }
    }

    public double calculateAttendance() {
        int absents = 0;
        for (String value : this.attendance.values()) {
            if (value.equals("A")) {
                absents++;
            }
        }
        return ((double) (this.attendance.size() - absents) / this.attendance.size()) * 100;
    }

    public ArrayList<String> getDaysAbsent() {
        String[] dates = new String[this.attendance.size()];
        ArrayList<String> absents = new ArrayList<>();
        int index = 0;
        for (String date : this.attendance.keySet()) {
            dates[index] = date;
            index++;
        }
        index = 0;
        for (String value : this.attendance.values()) {
            if (value.equals("A")) {
                absents.add(dates[index]);
            }
            index++;
        }
        return absents;
    }



}
