package LR_5_hw;

public class Horse extends  Animal {
    public Horse(){}
    public Horse(String nickname){ name = nickname;}

    public String toString(){
        return "In Horse: " + name;
    }

}
