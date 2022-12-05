package Assignment05;

public class Car implements Vehicle{
    int startedSpeed=10;
    int speed;
    int gear;
    final int maxSpeed=70;
    @Override
    public void gearChange(int a) {
        gear = a;
        if(gear>0 && gear<6){
            System.out.println("Gear changed to "+a);
        }else{
            System.out.println("Cars only have gear 1-5");
        }
    }

    @Override
    public void speedUp(int a) {
        speed = startedSpeed;
        if(speed > maxSpeed){
            System.out.println("Max speed of car reached");
        }else {
            speed += a;
            System.out.println("Car speed now: " + speed);
        }
    }

    @Override
    public void applyBreak(int a) {
        if(speed-a < 0){
            System.out.println("Speed can never be negative.");
        }
        else{
            speed -= a;
            System.out.println(a+" amount break applied!\nSpeed decreased to: "+speed);
        }
    }

    @Override
    public void display() {
        System.out.println("Car started!\nInitial speed: "+startedSpeed);
    }

}
