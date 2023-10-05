package myPackge001.zhashijichu;

public class gouzaohanshu {
    public static void main(String[] args) {
        Animal002 myDog001=new Animal002("wang cai",19);
        myDog001.shout();
    }
}
class Animal002{
    String name;
    int age;
    Animal002(String myName,int age){
        name=myName;
        this.age=age;
    }
    void shout(){
        System.out.println(name+"-"+age);
    }

}
