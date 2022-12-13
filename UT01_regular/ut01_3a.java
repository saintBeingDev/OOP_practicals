package UT01_regular;

class students{
    String name;
    students(){
        this.name = "Unknown";
        System.out.println(name);
    }
    students(String name){
        this.name = name;
        System.out.println(name);
    }
}

public class ut01_3a {
    public static void main(String[] args) {
        students s1 = new students("om nikam");
        students s2 = new students("manish dhande");
        students s4 = new students();
        students s3 = new students("krushna Baviskar");
    }
}
