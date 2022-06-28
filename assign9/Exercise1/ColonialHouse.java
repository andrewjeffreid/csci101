package Exercise1;
import java.util.Date;

public class ColonialHouse extends House implements Liveable{
    
    // hardcoded datafields for area and year built
    private String area = "1000sq ft";
    private Date yearBuilt = new Date();

    // implementation of getArea() method
    public String getArea() {
        return area;
    }

    // implementation of getYearBuilt() method
    public Date getYearBuilt() {
        return yearBuilt;
    }

    @Override
    public int maxCapacity() {
        return 4;
    }
}
