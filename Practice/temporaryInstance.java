package Practice;

//Temporary instance are the instance which only used to invoke a method or chain of methods
//They are immediately discarded
//If we don't assign object using new keyword then it is called temporary instance

public class temporaryInstance {
    int x;
    int y;
    public temporaryInstance(int a, int b){
        x=a;
        y = b;
    }
    public void calculateSum(){
        int s = x+y;
        System.out.println("Sum: "+s);
    }

    public static void main(String[] args) {
        new temporaryInstance(10, 19).calculateSum();
    }
}
