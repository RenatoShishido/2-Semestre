package Recursividade.Hanoi;
import java.util.Scanner;
 
public class TorredeHanoi {
 
    
    private static void mover(char ori, char dst) {
        System.out.println(ori + " -> " + dst);
    }
 
    
    static void hanoi(int n, char ori, char aux , char dst) {
 
        if (n > 0) {
            hanoi(n - 1, ori, dst, aux);
            mover(ori, dst);
            hanoi(n - 1, aux, ori, dst);
        }
 
    }
 
    
    public static void main(String[] args) {
 
        int n; 
 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        n = entrada.nextInt();
 
        TorredeHanoi.hanoi(n, 'A', 'B', 'C');
    }
}