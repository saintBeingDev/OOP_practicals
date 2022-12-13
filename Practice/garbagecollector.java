package Practice;

public class garbagecollector {
    protected void finalize(){System.out.println("object is garbage collected");}
    public static void main(String[] args) {
        garbagecollector g1 = new garbagecollector();
        garbagecollector g2 = new garbagecollector();
        g1= null;
        g2= null;
        garbagecollector g3 = new garbagecollector();
        garbagecollector g4 = new garbagecollector();
        g3 = g4;
        System.gc();
    }
}
