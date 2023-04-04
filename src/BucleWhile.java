public class BucleWhile {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

    }

    public static void printSOS(){
        System.out.println("...___...");
    }
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
//        lo anterior es lo mismo que lo siguiente
//        if (isTurnOnLight){
//            isTurnOnLight = false;
//        }else {
//            isTurnOnLight = true;
//        }
        return isTurnOnLight;
    }
}
