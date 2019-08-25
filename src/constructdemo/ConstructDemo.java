package constructdemo;

public class ConstructDemo {
    private int number;
    private String name;

    public ConstructDemo(int n, String s) {
        number = n;
        name = s;
    }

    public int getNumber() {   //getters
        return number;
    }

    public void setNumber(int number) {  //setters
        this.number = number;
    }

    public String getName() {
        return name;
    }
}
