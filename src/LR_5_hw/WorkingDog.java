package LR_5_hw;

public class WorkingDog extends  Dog implements Working {
    public WorkingDog (String name){
        this.name = name;
    }

    public void hours() {
        System.out.println("Working dog hours -- working weekends!!!");
    }
}
