abstract class animal{
    abstract void makesound();

    public void sound(){
        System.out.println("making sound");
    }
}

class dog extends animal{
    @Override
    void makesound(){
        System.out.println("bark ..");
    }
}

public class abstraction {
    public static void main(String[] args){
        dog d = new dog();

         d.makesound();
        d.sound();
    }
}
