public class Trout extends Fish {
    boolean isSalt = false;

    public Trout(double length, boolean isSalt){
        super(length);
        this.isSalt = isSalt;
        System.out.println("Trout");
    }

    public boolean isSalt() {
        return isSalt;
    }

    public void setSalt(boolean salt) {
        isSalt = salt;
    }

    @Override
    public String toString() {
        return "Trout{" +
                "isSalt=" + isSalt +
                ", length=" + length +
                '}';
    }
}