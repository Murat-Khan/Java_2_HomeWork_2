
// Работник
public abstract class Employee implements Printable{
    private String job;
    private String organization;

    public Employee(String job, String organization) {
        this.job = job;
        this.organization = organization;
    }

    public String getJob() {
        return job;
    }

    public String getOrganization() {
        return organization;
    }
    public  String showData(){
      return   "Должность: " + job +
                "\nОргонизация: " +organization;
    }
}


