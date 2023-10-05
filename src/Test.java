

import java.util.Objects;

abstract class O_Object {
    public static boolean isEqual(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return (s1.equals(s2));
    }
}

class Animal {
    int num;
    String name;

    Animal(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    void sleeping() {
        System.out.println(this.name + " is sleeping");
    }

    void eating() {
        System.out.println(this.name + " is eating");
    }
}

public class Test {
    public static void main(String[] args) {
//        String A1 = "abc", A2 = "abc";
//        System.out.println(A1.hashCode());
//        System.out.println(A2.hashCode());
//        System.out.println(A1 ==A2);
//        String B1 = new String("abc"), B2 = new String("abc");
//        System.out.println(B1);
//        System.out.println(B2);
//        System.out.println(B1.hashCode());
//        System.out.println(B2.hashCode());
        Animal Dog1 = new Animal(1, "dog");
        Animal Dog2 = new Animal(2, "dog");
//        Dog Dog3 = new Dog(3, "dog");
//        System.out.println("B1和B2比较结果:"+(B1 == B2)); // false
        System.out.println("Dog1和Dog2比较结果:"+(O_Object.isEqual(Dog1,Dog2)));
//        Dog3.eating();//dog is eating meat
    }

    private static class Dog extends Animal{


        Dog(int num, String name) {
            super(num, name);
        }
    }
}