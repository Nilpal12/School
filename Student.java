import static java.lang.System.out;

public class Student {
    String name;
    String address;
    Integer number;
    String gender;


    public static void main(String args[]) {
        Student s=new Student();
        s.name="xyz";
        s.address="abc";
        s.gender="f";
        s.number=5;


System.out.println(s.address);
    }


    }
 class Test{
    String weight;
    String hight;

    public static void main (String args[]){
        Test t=new Test();
        Test b=new Test();
        Test c=new Test();

        t.hight="pqr";
        b.hight="pqr";

        System.out.println(t.hight+t.weight);
        System.out.println(t.hight+t.hight);



    }


}