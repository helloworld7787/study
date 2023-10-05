package myPackge001.zhashijichu;

public class jicheng {
    public static void main(String[] args) {
        Dog m001=new Dog();
        System.out.println(m001.isMale=true);
        m001.shout();
        m001.shoutDog();
    }
}

class Animal003{
    String name;
    int age;
    void shout(){
        System.out.println("shout from Animal003");
    }

}

class Dog extends Animal003{
    boolean isMale;
    void shoutDog(){
        System.out.println("shout from dog");
    }
}
class Cat extends Animal003{
    String type;
    void shoutCat(){
        System.out.println("shout from cat");
    }
}

