/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lervalorxey;
import java.util.Scanner;
/**
 *
 * @author 326128144
 */
public class LerValorXeY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Tamanho: ");
        n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n * 2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("y[" + i + "]: ");
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            z[k] = x[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            boolean repetido = false;

            for (int j = 0; j < k; j++) {
                if (y[i] == z[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                z[k] = y[i];
                k++;
            }
        }
        System.out.println("Uniao:");
        for (int i = 0; i < k; i++) {
            System.out.print(z[i] + " ");
        }
    }
}