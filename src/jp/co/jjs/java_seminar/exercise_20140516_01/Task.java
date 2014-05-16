package jp.co.jjs.java_seminar.exercise_20140516_01;

public class Task {

    private int taskNo;
    private String label;
    private boolean isFinished;

    //コンストラクター
    public Task(String label,int taskNo) {
        this.label  = label;
        this.taskNo = taskNo;
    }

   public void finish() {
        this.isFinished = true;
    }

    //setter,getter
    public void setTaskNo(int taskNo) {
        this.taskNo = taskNo;
    }

    public int getTaskNo() {
        return this.taskNo;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public boolean getIsFinished() {
        return this.isFinished;
    }


    public void show(){
        System.out.printf("%d. %s%s\n",
                this.taskNo,
                this.label,
                this.isFinished ? "(DONE)": "");
    }
}
