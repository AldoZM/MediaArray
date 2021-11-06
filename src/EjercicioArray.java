import java.util.Scanner;

import javax.print.event.PrintEvent;

public class EjercicioArray {
    public static void main(String[] args) throws Exception {
        System.out.println("Introdusca los valores del arreglo");
        float[] a = new float[5];
        float medNumPos, medNumNeg, conCero = 0, conPos = 0, conNeg = 0 , sumPos = 0, sumNeg = 0;
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i <5; i++){
            System.out.println("Introduce el numero "+(i+1)+" del arreglo:");
            a[i] = entrada.nextFloat();
            if(a[i] == 0){
                conCero++;
            }
            else if(a[i] > 0){
                sumPos = sumPos + a[i];
                conPos++;
            }
            else if(a[i] < 0){
                sumNeg = sumNeg + a[i];
                conNeg++;
            }
        }
        
        medNumPos = sumPos/conPos;
        medNumNeg = sumNeg/conNeg;

        System.out.println("La media de los Positivos: "+ medNumPos);
        System.out.println("La media de los Negativos: "+ medNumNeg);
        System.out.println("La cantidad de 0: "+ conCero);
    }
}
