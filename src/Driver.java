//водитель
public class Driver extends Employee {
private String category;
private int drivingExperience;

    public Driver(String job, String organization, String category, int drivingExperience) {
        super(job, organization);
        this.category = category;
        this.drivingExperience = drivingExperience;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public void print() {
        System.out.println(showData() +
                "\nКотегория прав: " + category +
                "\nОпыт вождения: " + drivingExperience + "лет");

    }
}
