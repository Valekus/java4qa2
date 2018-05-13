package LR_5_hw;

public class farmWorkers {
    public static void main(String[] args) {
        Working mac = new Farmer("Valek");
        System.out.println(mac.toString());
        mac.hours();

        Working max = new WorkingDog("Max");
        System.out.println(max.toString());
        max.hours();

        Working silver =  new WorkingHorse("Silver");
        System.out.println(silver.toString());
        silver.hours();
    }

}
