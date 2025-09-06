package Unit_02_Object_Oriented_Programming.Chapter_09.Example;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1010, "Mukul Kumar");
        System.out.println(student.getDateCreated());

        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000);
        System.out.println(student.getDateCreated());
    }
}

class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student (int ssn, String newName){
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}