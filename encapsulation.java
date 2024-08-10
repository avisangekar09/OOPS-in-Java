class person{
    private String name;
    private int age;

    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }

    public void setage(int a){
        age = a;
    }

    public int getage(){
        return age;
    }
}
public class encapsulation{
    public static void main(String[] args){
person p =new person();

p.setname("Avinash");
p.setage(20);

System.out.println(p.getname());
System.out.println(p.getage());
    }
}