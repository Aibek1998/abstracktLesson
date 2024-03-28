public abstract class  Animals {
    private String name;
    private  int age;
    private String gender ;
    private  String nickName;

    public Animals(String name, int age, String gender, String nickName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void  color (){
        System.out.println();
    }

    @Override
    public String toString() {
        return "name : " + name + "\n" +
                "age : " + age +
                "gender : " + gender + "\n" +
                "nickName : " + nickName + "\n";
    }
}
