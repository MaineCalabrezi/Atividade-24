import java.util.Scanner;
public class Atividade24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 1;
        Integer j,i;
        System.out.println("Digite vezes de repeticao");
        j = ler.nextInt();
        for(i=0; i<j;i++){
            
            System.out.println(" ");
            System.out.println("Digite um número");
            if (ler.hasNextInt()) {
                n = ler.nextInt();
                if (n > 0) {
                    System.out.println("POSITIVO");
                } else if (n < 0) {
                    System.out.println("NEGATIVO");
                } else {
                    System.out.println( "IGUAL A 0");
                }
            } else {
                System.out.println("Caracter inválido");
                ler.next();
                i--;
            }
        }
        }
        
    }
