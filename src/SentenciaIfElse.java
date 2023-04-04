public class SentenciaIfElse {
    public static void main(String[] args) {
        boolean isBluetoothEnable = true;
        int filesSended = 3;

        if (isBluetoothEnable) {
            filesSended++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Por vafor Enceder BLUETOOTH");
        }

        System.out.println(isBluetoothEnable);
        System.out.println(filesSended);
    }
}
