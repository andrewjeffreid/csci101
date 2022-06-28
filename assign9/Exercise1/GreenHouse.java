package Exercise1;
import java.util.Date;

public class GreenHouse extends House {

    // hardcoded datafields for area and year built
    private String area = "500sq ft";
    private Date yearBuilt = new Date();

    // implementation of getArea() method
    public String getArea() {
        return area;
    }

    // implementation of getYearBuilt() method
    public Date getYearBuilt() {
        return yearBuilt;
    }
}
