package project;

public class cse {
    int roll;
    String name ;

    cse ( String s , int r)
    {
        this .roll=r;
        this .name=s;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
}
