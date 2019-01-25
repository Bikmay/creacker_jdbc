package data;

public class Employee {

    public int id;
    public String name;
    public String job;

    public String company;
    public String location;
    public int range;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name).append(" ");
        sb.append(job).append(" ");

        sb.append(company).append(" ");
        sb.append(location).append(" ");
        sb.append(range);

        return sb.toString();
    }
}
