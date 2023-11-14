package operandoOperadores;

public class introOperadores {
    public static void main(String[] args) {
        int resultado = (5 + 3) * 6;
        System.out.println("El Resultado es = " + resultado);

        int resultado2 = 20/4 * 2 + 1;
        System.out.println("El Resultado es = " + resultado2);

        //entre parentesis puede ir cualquier expresion, siempre que devuelva un booleano
        //operador ternario de JAVA 
        int resultado3 = (resultado > resultado2)? 1 : 0;
        System.out.println("El Resultado del operador ternario es = " + resultado3);

        //aca no es lo mismo que realizar 'System.out.println(++value1);' a realizar 'System.out.println(--value1);'
        int value1 = 5;
        System.out.println(++value1);
        System.out.println(--value1);
    }
}
