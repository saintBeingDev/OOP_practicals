package Assignment05;

public class Bicycle implements Vehicle{
    private int gear;
    private int speed;
    final int maxSpeed = 40;

    @Override
    public void gearChange(int a) {
       if(a>0)
           gear= a;
       else
           System.out.println("Gears can't be negative");
    }

    @Override
    public void speedUp(int a) {
        if(speed+a <= maxSpeed)
            speed+=a;
        else
            System.out.println("Max speed of bicycle reached!"+maxSpeed);
    }

    @Override
    public void applyBreak(int a) {
        if(speed-a < 0){
            System.out.println("Speed can never be negative.");
        }
        else{
            speed -=a;
        }
    }
    @Override
    public void display(){
        System.out.println("Speed of Bicycle: "+speed);
        System.out.println("State of gear of Bicycle: "+gear);

    }
}
