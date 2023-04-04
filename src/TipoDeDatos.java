public class TipoDeDatos {
    public static void main(String[] args) {
        int n = 1234567890;
// colocar L al final para que reconozca que es de tipo long
        long nL = 1234567890154L;
//java 11
        double nD = 123.456;
// colocar F al final para que reconozca que es de tipo float
        float nF = 123.456F;
        System.out.println(n);
        System.out.println(nL);
        System.out.println(nD);
        System.out.println(nF);

//        Para java 11
//        var salary = 1000; //int
//        //pension 3%
//        var pension = salary*0.03; //double
//        var totalSalary = salary - pension; //double
//
//        System.out.println(salary);
//        System.out.println(pension);
//        System.out.println(totalSalary);
//
//        var employeeName = "Anahí Salgado"; //string
//        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
