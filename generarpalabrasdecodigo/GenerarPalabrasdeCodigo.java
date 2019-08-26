/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarpalabrasdecodigo;

/**
 *
 * @author root
 */
public class GenerarPalabrasdeCodigo {

//    int C [];
//    int H [][];
//    int X [];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenerarPalabrasdeCodigo Codigo = new GenerarPalabrasdeCodigo();
        int H[][] = {{1, 0, 1, 0}, {1, 1, 0, 1}};
        int x = 15;
        for (int k = 0; k < 16; k++) {

            int C[] = {0, 0};
            x = k;
            String hola = Codigo.CambiarEnteroaBinario(x);
            System.out.println("" + hola);
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < hola.length(); j++) {
                    //System.out.println(""+ Character.getNumericValue(hola.charAt(j))); //el indice 0 es el bit mas significativo
                    C[i] = C[i] + (H[i][j] * Character.getNumericValue(hola.charAt(j)));
                }
            }
            System.out.println("" + C[0]);
            System.out.println("" + C[1]);
            if (C[0] % 2 == 0 && C[1] % 2 == 0) {
                System.out.println("El vector que sirve es " + Integer.toBinaryString(x));
            }
        }
    }

    String CambiarEnteroaBinario(int x) {
        String hola = Integer.toBinaryString(x);
        String adios = "0000";
        StringBuilder myName = new StringBuilder("0000");
        for (int i = 0; i < hola.length(); i++) {
            myName.setCharAt(i, hola.charAt(i));
        }
        return myName.toString();
    }
}
