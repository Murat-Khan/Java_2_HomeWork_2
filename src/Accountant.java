
//Бухгалтер
public class Accountant extends Employee {
private String faculty;

    public Accountant(String job, String organization,  String faculty) {
        super(job, organization);

        this.faculty = faculty;
    }



    public String getFaculty() {
        return faculty;
    }

    @Override
    public void print() {
        System.out.println(showData() + " Факультет: " + faculty);

    }
}
