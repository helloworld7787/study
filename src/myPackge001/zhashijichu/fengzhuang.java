package myPackge001.zhashijichu;

public class fengzhuang {
    public static void main(String[] args) {
        MyDog myDog001=new MyDog();
       myDog001.getAge();
    }
}


class MyDog{
    private int age;
    private String name;
    private boolean isMale;
    private void shout(){
        System.out.println("wang wang");
    }
    void shout2(){
        System.out.println("wang wang wang");
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }
    public void shout3(){
        shout();
    }
}