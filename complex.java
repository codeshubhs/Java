import java.lang.*;
class Calc{
float real , img;
Calc(){};

    Calc(float real , float img){
this.real=real;
this.img=img;
    }
    void display(){
        System.out.println(real +"+i"+img);
    }
    Calc add(Calc c2){
        Calc res=new Calc();
        res.real=real+c2.real;
        res.img=img+c2.img;
        return res;
    }
    Calc sub(Calc c2){
        Calc res=new Calc();
        res.real=real-c2.real;
        res.img=img-c2.img;
        return res;
    }
    Calc multi(Calc c2){
        Calc res=new Calc();
        res.real=real*c2.real;
        res.img=img*c2.img;
        return res;
    }
    
    Calc div(Calc c2){
        Calc res=new Calc();
        res.real=real/c2.real;
        res.img=img/c2.img;
        return res;
    }
    

}

class Complex {


public static void main(String[] args) {
    
    Calc c1=new Calc(11.5f , 2.5f);
    Calc c2=new Calc(12.5f , 3.5f);
    System.out.println("c1 is :");
    c1.display();
    System.out.println("c2 is :");
    c2.display();
    Calc c3=new Calc();
    System.out.println("Add of c1 and c2 is :");
    c3=c1.add(c2);
    System.out.println(" result is :");
    c3.display();
    System.out.println("Subtraction of c1 and c2 is  :");
    c3=c1.sub(c2);
    System.out.println(" result is :");
    c3.display();
    System.out.println(" multiply two complex number :");

    c3=c1.multi(c2);
    System.out.println("result :");
    c3.display();
System.out.println(" division of two complex number :");
    c3=c1.div(c2);
System.out.println(" result :");
    c3.display();
}
}