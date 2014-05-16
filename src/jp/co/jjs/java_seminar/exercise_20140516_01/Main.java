package jp.co.jjs.java_seminar.exercise_20140516_01;


public class Main {
    public static void main(String[] args) {


        ToDoList taskList = new ToDoList();


        BuyTask task1 = new BuyTask("牛乳を買う",1,190);
        BuyTask task2 = new BuyTask("卵を買う",2,140);
        Task task3 = new Task("ArrayListを使えるようにする",3);


        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);


        task1.finish();
        task2.finish();


        taskList.showAll();
    }
}

