package conversiones;

public class conversiones {
    public static void main(String[] args) {
        //conversion de tipo PROMOCION
        int value1 = 6;

        //conversion de tipo CONTRACCION
        int value2 = (int)5.50f;  //Cast o sea que nos devuelve '5' porque nos retorna el valor entero (int)
        System.out.println(value2);

        //conversion de tipo IMPLICITA
        double value3 = 10 + 25.5d;
        System.out.println(10 + 25.5d);
    }
}
