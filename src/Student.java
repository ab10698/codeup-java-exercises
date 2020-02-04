import java.util.Date;

public class Student {
    static int numberOfStudents = 0;
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args){
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;

        Student zach = new Student("Zach");
//        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;

        System.out.println(daniel.report());
        System.out.println(zach.report());


//        if (daniel.drinksCoffee)
//        System.out.println(daniel.name + " drinks coffee");
    }
    public Student(String name){
        this.name = name;
    }

    public String report(){
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate+ ". ";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ". ";
        else
            output += "I dont drink coffee in " + this.location + ". ";
        return output;
    }
}
