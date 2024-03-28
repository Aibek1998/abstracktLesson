public class Cow extends Animals{
    public Cow(String name, int age, String gender, String nickName) {
        super(name, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow : "+"\n"+super.toString();
    }
}
