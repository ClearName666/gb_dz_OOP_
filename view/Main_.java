package view;

import contriller.TrainingGroupService;
import model.StudyGroup;

public class Main_ {
    public static void main(String[] args) {
        TrainingGroupService trainingGroupService = new TrainingGroupService();
        StudyGroup group = trainingGroupService.CreateStudyGroup(10, "piter");
        System.out.println(group.getStudents());
        System.out.println(group.getTeather());
    }
}
