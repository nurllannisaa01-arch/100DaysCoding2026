public class day21 {
    
    public static void main(String[] args) {
        String a="10";
        String b="10.5";
        String c="true";
        String d="A";
        
        byte byteData=Byte.parseByte(a);
        short shortData=Short.parseShort(a);
        int intData=Integer.parseInt(a);
        long longData=Long.parseLong(a);
        float floatData=Float.parseFloat(b);
        double doubleData=Double.parseDouble(b);
         boolean booleanData=Boolean.parseBoolean(c);
        char charData=d.charAt(0);
        
        System.out.println(byteData);
        System.out.println(shortData);
        System.out.println(intData);
        System.out.println(longData);
        System.out.println(floatData);
        System.out.println(doubleData);
        System.out.println(booleanData);
        System.out.println(charData);
    }
    
}
