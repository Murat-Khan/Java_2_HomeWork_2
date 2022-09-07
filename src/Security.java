//охранник
public class Security extends Employee{
private int growth;
private int weight;

    public Security(String job, String organization, int growth, int weight) {
        super(job, organization);
        this.growth = growth;
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println(showData() +
                "\nВес: " + growth +
                "\nРост: " + weight);

    }
}
