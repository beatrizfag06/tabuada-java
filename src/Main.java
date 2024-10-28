import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        String continuar;
        do {
            System.out.println("----Tabuada----");
            System.out.println("Digite um número: ");
            n1 = sc.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(n1 + " X " + i + " = " + n1*i);
            }

            System.out.println("Deseja gerar outra tabuada? S/N");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));


    }
}