package baitap;

public class Frog implements Swimmable,Soundable{
    @Override
    public void makeSound(){
        System.out.println("ech keu op op");
    }
    @Override
    public void swim(){
        System.out.println("ech boi duoi nuoc nhanh ac");
    }
   }