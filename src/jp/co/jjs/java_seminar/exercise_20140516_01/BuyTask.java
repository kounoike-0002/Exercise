package jp.co.jjs.java_seminar.exercise_20140516_01;

public class BuyTask extends Task{
    private int price;
    public BuyTask(String label, int taskNo, int price)  {
        super(label, taskNo);
        this.price = price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void show() {
        System.out.printf("%d. %s(%d円)%s\n",
                this.getTaskNo(),
                this.getLabel(),
                this.price,
                this.getIsFinished() ? "(DONE)": "");
         }

}
