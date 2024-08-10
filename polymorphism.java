class shape{
    int lenght;
    int width;
    double radius ;

    public int area(int length,int width){
        return length * width;
    }

    public double area(double radius){
        return radius * radius;
    }
}
public class polymorphism {
    public static void main(String[] args){
shape s = new shape();

System.out.println(s.area(3,4));
System.out.println(s.area(5.14));

    }
}
