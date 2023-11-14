package tiposDatos;

public class ByteShortLongAndWidth {
    
    public static void main(String[] args) {
        
        //Byte value - 8 bits - clase Wrapper
        System.out.println("Rango del valor del Byte: "+ Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        byte minValue = -128;
        byte maxValue = 127;

        //Short value - 8 bits - clase Wrapper
        System.out.println("Rango del valor del Short: "+ Short.MIN_VALUE + " " + Short.MAX_VALUE);

        short minValueShort = -32768;
        short maxValueShort = 32767;

        //Integer value - 8 bits - clase Wrapper
        System.out.println("Rango del valor del Integer: "+ Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        int minValueInteger = -2147483648;
        int maxValueInteger = 2147483647;

        //Tipo Long

        long valorLong = 321312451223L;
    }
}
