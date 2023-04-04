public class Casting18 {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
//19
        double c = a / b;
        System.out.println(c); // 2.0 (??)

        double d = (double) a / b;
        System.out.println(d); // 2.5

        //Sin casteo
        char n = '1';
        int nI = n;
        System.out.println("El resultado es: " + nI);

        //Con casteo
        short nS = (short) n;
        System.out.println("El resultado es: " + nS);

        //Con Parseo (Para cambiar valores de String a numéricos o booleanos)
        String age = "25";
        int ageInt = Integer.parseInt(age);
        System.out.println("El resultado es: " + ageInt);
    }
}
