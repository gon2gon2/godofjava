public class Profile {
    String name;
    int age;

    public static void main(String[] args) {
        Profile me = new Profile();
        me.printName();
        me.printAge();
        me.setName("송성곤");
        me.setAge(26);
        me.printName();
        me.printAge();
    }

    public void setName(String str) {
        name = str;
    }

    public void setAge(int val) {
        age = val;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printAge() {
        System.out.println(age);
    }
}
