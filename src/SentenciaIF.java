public class SentenciaIF {
    public static void main(String[] args) {
        boolean isBluetoothEnable = true;
        int filesSended = 3;

        if (isBluetoothEnable) {
            filesSended++;
            System.out.println("Archivo Enviado");
        }

        System.out.println(isBluetoothEnable);
        System.out.println(filesSended);
    }
}
