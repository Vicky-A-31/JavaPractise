
class Wrap{
    /**
     * @param args
     */
    public static void main(String[] args) {
    // AutoBoxing - primitive data type to Wrap class
        char c = '#';
        Character C = c;
        System.out.println(C);

    // Unboxing - Wrap class to primitive data type
    Integer I = 24;
    int i = I;
    System.out.println(i);
    
    /* wrap class are deprecated in java so it produce warning
    example :
        Integer objInt = new Integer(102);
    */

    // Wrap class Examples
    float a = 18.6f;
    Float floatobj  = Float.valueOf(a);
    System.out.println(floatobj); 
    int ab = 1234;
    Integer obj = Integer.valueOf(ab);
    System.out.println(obj);
    }
}