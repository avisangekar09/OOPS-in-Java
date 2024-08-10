class vehicle{
    String make;
    String model;
    int year;

    public vehicle(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void info(){
        System.out.println(make + model + year);
    }
}

class car extends vehicle{
    int noofwheels;

    public car(String make,String model,int year,int noofwheels){
        super(make,model,year);
        //super();
        this.noofwheels = noofwheels;
    }

    public void carinfo(){
        System.out.println(make + model + year + noofwheels);
    }

}
public class inheritance {
    public static void main(String[] args){
car c = new car("toyato","cart",2001,4);

c.carinfo();
    }
}
