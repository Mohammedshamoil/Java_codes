package oops;



class person{
    int age;
    String name;
    int rol;
    public person(int age,String name){

        this.age=age;
        this.name=name;

    }

    void walk(){
        System.out.println("person parent class");
        System.out.println(this.age+"and "+this.name);
    }

}
class dev extends person{
    public dev(int age,String name,int rol){
        super(age, name);
        this.rol=rol;
    }
    void walk(){
        System.out.println(" person child  class");
        System.out.println(this.age+"and "+this.name+" "+this.rol);
       
    }
    void dis(){
       super.walk();
    }

   
}

public class inhertance1 {
    public static void main(String[] args) {
    //    person p1= new person(11, "shammu");
    //    p1.walk();
    dev d1=new dev(22, "shammu", 1);
    d1.walk();
        d1.dis();
    }
}
