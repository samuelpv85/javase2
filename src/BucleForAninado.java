import java.sql.SQLOutput;

public class BucleForAninado {
    public static void main(String[] args) {
        String[] androidVersions = new String[14];
        String days[] = new String[7];

        String[][] cities = new String[4][2]; //4 * 2 = 8

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int j = 0; j < 4; j++) {
            System.out.println(androidVersions[j]);
        }
//        for (int i = 0; i < androidVersions.length ; i++) {
//            System.out.println(androidVersions[i]);
//        }
        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }
        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2 ; j++) {
                System.out.println(cities[i][j]);
            }
        }
        System.out.println("  ");
        // i = renglon  --  j = columnas
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] pais : cities) {
            for (String name:pais) {
                System.out.println(name);
            }
        }

        System.out.println("   ");

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);
    }
}
