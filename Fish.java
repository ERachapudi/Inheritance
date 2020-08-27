import java.util.Random;

public class Fish implements Swims, Breathes{
    double length = 0;

    public Fish(double length) {
        this.length = length;
        System.out.println("Fish");
    }
    public void behavior(){
        Random rand = new Random();
        int behavior = rand.nextInt(4);
        switch(behavior){
            case 0:
                swim();
                break;
            case 1:
                breath();
                break;
            /*
            case 2:
                System.out.println("Hello. My name is bob");
                break;
            case 3:
                System.out.println("Hello. My name is bob");
                break;
             */
            case 2:
            case 3:
                System.out.println("Hello. My name is bob");
                break;
            default:
                System.out.println("blub, blub");
        }
        /*
        if (behavior == 0){
            swim();
        } else if ...
         */
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void breath(){
        System.out.println("Is Breathing");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "length=" + length +
                '}';
    }
}