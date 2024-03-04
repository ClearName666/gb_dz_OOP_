package model;
import java.util.ArrayList;

public class StudyGroup {

    Teatherr teather;
    ArrayList<Studentt> students = new ArrayList<>();

    public StudyGroup(Teatherr teather, ArrayList<Studentt> students) {
        this.teather = teather;
        this.students = students;
    }
    public StudyGroup(Teatherr teather) {
        this.teather = teather;
    }
    public Teatherr getTeather() {
        return teather;
    }
    public ArrayList<Studentt> getStudents() {
        return students;
    }
    public void setTeather(Teatherr teather) {
        this.teather = teather;
    }
    public void addStudent(Studentt student) {
        students.add(student);
    }
}
