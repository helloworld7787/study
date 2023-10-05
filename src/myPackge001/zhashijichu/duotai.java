package myPackge001.zhashijichu;

public class duotai {
    public static void main(String[] args) {
        MyHero1[] Hero =new MyHero1[3];
        Hero[0]=new Libai();
        Hero[1]=new diaochan();
        Hero[2]=new MyHero1();
        for(int i = 0;i<3;i++){
            Hero[i].attack1();
        }

    }
}


class MyHero1{
    void attack1(){
        System.out.println("jineng");
    }
}

class Libai extends MyHero1{
    void attack1(){
        System.out.println("libaijineng");
    }
}
class diaochan extends MyHero1{
    void attack1(){
        System.out.println("diaochanjineng");
    }
}