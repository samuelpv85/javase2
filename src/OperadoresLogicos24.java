public class OperadoresLogicos24 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
//        Operadores de Asignacion
        System.out.println("a es igual a b  " + (a==b));
        System.out.println("a es Diferente a b  " + (a!=b));

//        System.out.println("a es igual a b  " + (a ! b));
//        Operadores relacionales
        System.out.println("a es mayor a b  " + (a > b));
        System.out.println("a es menor a b  " + (a < b));
        System.out.println("a es mayor o igual a b  " + (a >= b));
        System.out.println("a es menor a o igual a b  " + (a <= b));

        if (a == b) {
            System.out.println("a es igual a b  ");
        } else if ((a != b) && (a > b)) {
            System.out.println("a es Diferente a b y mayor a b  ");
        } else if (a > b) {
            System.out.println("a es mayor a b  ");
        } else if (a < b) {
            System.out.println("a es menor a b  ");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b  ");
        } else if (a <= b) {
            System.out.println("a es menor a o igual a b  ");
        }
    }
}
