package jp.co.jjs.java_seminar.exercise_20140515_05;

import java.util.ArrayList;


public class ToDoList {


    private ArrayList<Task> taskList = new ArrayList<>();


    public void add(Task task) {
        taskList.add(task);
    }


    public void showAll() {
        for (Task task: taskList) {
            System.out.printf("%d. %s%s\n",
                    task.getTaskNo(),
                    task.getLabel(),
                    task.getIsFinished() ? "(DONE)": "");
        }
    }
}
