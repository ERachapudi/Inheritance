public class FreshwaterTrout extends Trout{
    double migrationTime = 0;

    public FreshwaterTrout(double length, boolean isSalt, double migrationTime){
        super(length, isSalt);
        this.migrationTime = migrationTime;
        System.out.println("FreshwaterTrout");
    }

    public double getMigrationTime() {
        return migrationTime;
    }

    public void setMigrationTime(double migrationTime) {
        this.migrationTime = migrationTime;
    }

    @Override
    public String toString() {
        return "FreshwaterTrout{" +
                "migrationTime=" + migrationTime +
                ", isSalt=" + isSalt +
                ", length=" + length +
                '}';
    }
}
