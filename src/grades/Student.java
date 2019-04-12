package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
//    Integer allGrades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        int numberOfGrades = this.grades.size();
        for (Integer grade : this.grades) {
            sum += grade;
        }
        double finalGrade = sum / numberOfGrades;
        double roundedGrade = (double) Math.round(finalGrade * 100) / 100;
        return roundedGrade;
    }

    public void getAllGrades() {

        for (Integer grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Student student1 = new Student("Larry");
//        System.out.println(student1.getName());
        student1.addGrade(92);
        student1.addGrade(100);
//        student1.addGrade(93);
        student1.addGrade(71);
        System.out.println(student1.grades);
        System.out.println(student1.getGradeAverage());
    }

}