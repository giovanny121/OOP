import Inheritance.Anima;


public class Dog extends Anima implements Animal {
    @Override
    public void drink(){
        System.out.println("wafi' cat is drinking");
    }

    @Override
    public void eat() {
        System.out.println(
                "the cat is eating to much"
        );


    }

    @Override
    public void animalsound() {
        System.out.println("the cat is making noise");

    }
    //    @Override
//    public void eat(){
//        System.out.println("the cat is eating");
//    }
//    public void animalsound(){
//        System.out.println("the cat is mowing");
//    }

}
