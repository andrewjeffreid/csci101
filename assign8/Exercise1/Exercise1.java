package Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            System.out.println(hex2Dec("A5")); 
            System.out.println(hex2Dec("FAA")); 
            System.out.println(hex2Dec("T10"));
            System.out.println(hex2Dec("ABC")); 
            System.out.println(hex2Dec("10A"));
        }
        catch (HexFormatException ex) {
            System.out.println(ex);
        }
    }

    public static int hex2Dec(String hexString) throws HexFormatException {
        int hexDecimal = 0;
        int digit = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            if (!('0' <= c && c <= '9' || c >= 'A' && c <= 'F')) {
                throw new HexFormatException(hexString);
            }
            
            if ('0' <= c && c <= '9') {
                digit = c - 48;
            } else if (c >= 'A' && c <= 'F'){
                digit = c - 55;
            }

            //System.out.println(((int)Math.pow(16, i)) + " x " + digit);
            hexDecimal += ((int)Math.pow(16, (hexString.length() - i - 1)) * digit);
        }
        return hexDecimal;
    }
}