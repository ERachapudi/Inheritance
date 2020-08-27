public class Sports extends Activity implements Activity2{
    String sportName = "";

    public Sports(String sportName) {
        this.sportName = sportName;
    }

    public int getPlayers(){
        return 11;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sportName='" + sportName + '\'' +
                '}';
    }
}