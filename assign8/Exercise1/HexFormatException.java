package Exercise1;

public class HexFormatException extends Exception {
    
    private String hexString;

    // construct excpetion
    public HexFormatException(String newHexString) {

        super("Invalid Hex String: " + newHexString);
        hexString = newHexString;

    }
    // return the radius
    public String getHexString() {
        return hexString;
    }
}
