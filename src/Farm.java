import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String adress;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;

    public Farm() {
    }

    public Farm(String ownerName, String adress, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.ownerName = ownerName;
        this.adress = adress;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "ownerName : " + ownerName + "\n" +
                "adress : " + adress + "\n" +
                "cows : " + Arrays.toString(cows) + "\n"+
                "sheeps : " + Arrays.toString(sheeps) +"\n"+
                "horses : " + Arrays.toString(horses) ;
    }
}
