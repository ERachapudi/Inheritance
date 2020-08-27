import java.util.Random;

enum Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public static Weekdays getRandDay(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

enum Suits implements Card{
    //CLUBS("NO RANK"), HEARTS("NO RANK"), SPADES("NO RANK"), DIAMONDS("NO RANK"), NULL("NO RANK");
    CLUBS(), HEARTS(), SPADES(), DIAMONDS(), NULL();

    public String rank = "NO RANK";
        Suits() {
    }

    public static int getRandRank(){
        Random random = new Random();
        return random.nextInt(12)+1;
    }

    public static Suits getRandSuit(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    @Override
    public void displaySuit() {
        System.out.println(this + " " + rank);
    }
}

@FunctionalInterface
interface Math {
    int operate(int x, int y);
}

public class Main {

    public static void main(String[] args){
        Main main = new Main();
        //main.run();
        /*
        main.enums(Weekdays.getRandDay());
        main.suitsEnum(Suits.getRandSuit());
         */
        main.runOperation();
    }

    public void runOperation(){
        Math add = (int r1, int r2) -> r1+r2;
        int addAns = add.operate(15, 15);
        System.out.println(addAns);
        Math subtract = (int r1, int r2) -> r1-r2;
        int subAns = subtract.operate(47, 32);
        System.out.println(subAns);
    }

    public boolean run(){
        FreshwaterTrout ft = new FreshwaterTrout(30, false, 60);
        System.out.println(ft);
        ft.swim();
        ft.breath();
        System.out.println();
        Sports sport = new Sports("football");
        System.out.println(sport);
        System.out.println(sport.getPlayers());
        return true;
    }

    public void enums(Weekdays day){
        switch (day){
            case MONDAY:
                System.out.println("MONDAY");
                break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            default:
                System.out.println("It is not a Weekday");
        }
    }

    public void suitsEnum(Suits suit){
        suit.rank = Integer.toString(Suits.getRandRank());
        switch (suit){
            case CLUBS:
                System.out.println("CLUBS");
                break;
            case HEARTS:
                System.out.println("HEARTS");
                break;
            case SPADES:
                System.out.println("SPADES");
                break;
            case DIAMONDS:
                System.out.println("DIAMONDS");
                break;
            default:
                System.out.println("No SUIT Picked");
        }
        suit.displaySuit();
    }
} 