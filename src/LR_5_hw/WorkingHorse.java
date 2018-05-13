package LR_5_hw;

public class WorkingHorse extends Animal implements Working{
    public  WorkingHorse(String name){
        this.name = name;
    }

    public void hours() {
        System.out.println("Working horse hours - also working weekends!!");
    }
}
