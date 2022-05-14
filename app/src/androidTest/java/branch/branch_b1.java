package branch;

public class branch_b1 {
    int id ;
    String course_name;
    String name;

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public branch_b1(int id, String course_name, String name) {
        this.id = id;
        this.course_name = course_name;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}
