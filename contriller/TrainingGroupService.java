package contriller;



import java.util.ArrayList;

import model.Studentt;
import model.StudyGroup;
import model.Teatherr;

public class TrainingGroupService {
    public StudyGroup CreateStudyGroup(Teatherr teatherr, ArrayList<Studentt> students) {
        return new StudyGroup(teatherr, students);
    }

    public StudyGroup CreateStudyGroup(Integer item, String nameTch) {
        Teatherr teatherr = new Teatherr(nameTch);
        StudyGroup group = new StudyGroup(teatherr);
        for (int i = 0; i < item; i++) {
            group.addStudent(new Studentt("stud"));
        }
        return group;
    }  

    public ArrayList<Integer> getAllStudentsId(StudyGroup studyGroup) {
        ArrayList<Integer> ret = new ArrayList<>();
        ArrayList<Studentt> students = studyGroup.getStudents();
        int cnt = students.size();
        for (int i = 0; i < cnt; i++) {
            ret.add(students.get(i).getID());
        }
        return ret;
    }

    public Integer getTeacherId(StudyGroup studyGroup) {
        return studyGroup.getTeather().getID();
    }
 }
