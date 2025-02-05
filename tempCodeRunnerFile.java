
class Num {
    private static int count = 0; 
    private int Num; 

    Num() {
        count++;
        this.Num = count;
    }

    void showNum() {
        System.out.println("I am object " + Num);
    }
}

public class Day3{
    public static void main(String[] args) {
        Num obj1 = new Num();
        Num obj2 = new Num();
        Num obj3 = new Num();

        obj1.showNum();
        obj2.showNum();
        obj3.showNum();
    }
}