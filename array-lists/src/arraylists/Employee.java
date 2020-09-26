package arraylists;

import java.util.Objects;

public class Employee 
{
    private String fName;
    private String lName;
    private int id;
 

    public Employee(String fName, String lName, int id) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "{" +
            " fName='" + getFName() + "'" +
            ", lName='" + getLName() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(fName, employee.fName) && Objects.equals(lName, employee.lName) && id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, id);
    }

    
}