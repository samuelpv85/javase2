public class PacticaJavaClass20 {
        public static void main(String[] args) {
            //Usando los dos tipos de casting que aprendiste (implícito y explícito)
            //Resuelve los siguientes casteos indicando qué tipo es y si se está calculando estimación o exactitud.

            //char c = ‘z’; conviertelo a int
            //int i = 250; conviertelo a long y luego de long a short
            //double d = 301.067; conviertelo a long
            //int i = 100; súmale 5000.66 y conviertelo a float
            //int i = 737; multiplícalo por 100 y conviertelo a byte
            //double d = 298.638; divídelo entre 25 y conviertelo a long

//            char c = 'z';
            int i = 250;
            double d = 301.067;
            int o = 100;
            int p = 737;
            double f = 298.638;

//            System.out.println((int) c);
            System.out.println((long) (short) i);
            System.out.println((short) i);
            System.out.println((long) d);
            System.out.println((float) o + 5000.66);
            System.out.println((byte) i * 100);
            System.out.println((long) f / 25);
            System.out.println((byte) p * 100);
        }
}
