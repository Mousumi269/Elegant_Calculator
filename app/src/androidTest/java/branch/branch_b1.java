package branch;

public class branch_b1 {
    int id ;
    String course_name;
 
    int values;
    double mark;

    public branch_b1(int id, String course_name, int values, double mark) {
        this.id = id;
        this.course_name = course_name;
        this.values = values;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setValues(int values) {
        this.values = values;
    }


    public int getValues() {
        return values;

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
