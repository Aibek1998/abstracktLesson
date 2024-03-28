public class Sheep extends Animals{
    public Sheep(String name, int age, String gender, String nickName) {
        super(name, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
