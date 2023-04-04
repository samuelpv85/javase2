public class SentenciaSwitch25 {
    public static void main(String[] args) {
        String colorModeSelect = "Liht";

        switch (colorModeSelect){
            case "Light":
                System.out.println("MODO Light");
                break;
            case "Night":
                System.out.println("MODO Night");
                break;
            case "Blue Dark":
                System.out.println("MODO Blue Dark");
                break;
            case "Dark":
                System.out.println("MODO Dark");
                break;
            default:
                System.out.println("Seleciona Opcion Coreccta");
        }
    }
}
