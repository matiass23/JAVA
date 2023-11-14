package tiposDatos;

public class CharBooleanPrimitive {
    public static void main(String[] args) {
        //Char es un caracter (a, b, c, d) - tiene 
        //Los caracteres se definen con comillas: 'a'

        char oneChar = 'a';
        char oneCharWithUnicode = '\u0044';
        System.out.println(oneChar + " " + oneCharWithUnicode);

        //Tipos Booleanos
        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println(myTrue + " " + myFalse);

        //DECLARACION DE CONSTANTES
        //SCREAMING_SNAKE_CASE
        final long ESTA_ES_UNA_CONSTANTE = 321312451221L;  //asi SI
        ESTA_ES_UNA_CONSTANTE = 321312451220L;              //asi NO
    }
}
