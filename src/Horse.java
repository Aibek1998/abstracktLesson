public class Horse extends Animals{
    public Horse(String name, int age, String gender, String nickName) {
        super(name, age, gender, nickName);
    }

    @Override
    public void color() {
        super.color();
        System.out.println("yellow");
    }

    @Override
    public String toString() {
        return "\n"+super.toString();
    }
}
