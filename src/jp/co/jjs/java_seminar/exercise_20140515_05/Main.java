package jp.co.jjs.java_seminar.exercise_20140515_05;


public class Main {
    public static void main(String[] args) {


        ToDoList taskList = new ToDoList();


        Task task1 = new Task("牛乳を買う",1);
        Task task2 = new Task("卵を買う",2);
        Task task3 = new Task("ArrayListを使えるようにする",3);


        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);


        task1.finish();
        task2.finish();


        taskList.showAll();
    }
}

