import Inheritance.Anima;

public class Cat extends Anima implements  Animal {
    @Override
    public void drink(){
        System.out.println("the dog is drinking");
    }

    @Override
    public void eat() {
        System.out.println("wafi's Dog is eating a lot");


    }

    @Override
    public void animalsound() {
        System.out.println("wafi's Dog is making noise");

    }













//    @Override
//    public void eat(){
//        System.out.println("the dog is eating");
//
//    }
//    public void animalsound(){
//        System.out.println("the dog is backing");
//    }
}
