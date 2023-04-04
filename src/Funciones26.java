public class Funciones26 {
    public static void main(String[] args) {
        /**
         * JAVADOC
         * */

        double y = 3;
//        double quantity;
//        String  currency;

        //Area de un circulo   //pi * r2
        double areaC = circuleArea(y); // Llamamos a la funcion,le pasamos en parametro y le asignamos un valor
        System.out.println("Ärea de un Circulo = " + areaC );
//        forma directa de ejecutar la funcion en el println
        System.out.println("Area es " + circuleArea(y));
        //Area de una esfera   //4*PI*r2
        double areaE = esferaArea(y);
        System.out.println("Ärea de un Esfera = " + areaE);

        //Volumen de una esfera  //(4/3)*pi * r3
        double volumenE = esferaVolumen(y);
        System.out.println("Voliumen de un Esfera = " + volumenE );


        System.out.println("GS a dolar " + convertToDolar(200, "GS"));

    }
    public static double circuleArea(double y){
        return Math.PI * Math.pow(y,2);
    }
    public static double esferaArea(double y){
        return 4 * Math.PI * Math.pow(y,2);
    }
    public static double esferaVolumen(double y){
        return (4/3) * Math.PI * Math.pow(y,3);
    }
    /**
     * Descripcion: Funcion para convertir GS a Dolar
     * @param quantity Cantidad de dinero
     * @param currency Tipoa de moneda"GS, ARG"
     * @return quantity devuelve el valor en dolares
     * */
    public static double convertToDolar(double quantity, String currency){
        switch (currency){
            case "ARG":
                quantity = quantity * 0.052;
                break;
            case "GS":
                quantity = quantity * 7350;
                break;
        }
        return quantity;
    }
}
