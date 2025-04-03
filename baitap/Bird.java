package baitap;

public class Bird implements Flyable,Soundable {
    @Override
    public void fly() {
        System.out.println("chim phat bay.");
    }
    @Override
    public void makeSound(){
        System.out.println("chim keu chich chich.");
    }
}