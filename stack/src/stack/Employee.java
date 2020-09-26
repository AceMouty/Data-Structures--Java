package stack;

public class Employee 
{
    private String fName;
    private String lName;
    
    public Employee(){}
    public Employee(String fName, String lName)
    {
        this.fName = fName;
        this.lName = lName;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }


    @Override
    public String toString() {
        return "{" +
            " fName='" + getFName() + "'" +
            ", lName='" + getLName() + "'" +
            "}";
    }


}
