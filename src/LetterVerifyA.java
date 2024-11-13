import java.util.Scanner;

public class LetterVerifyA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String texto = scanner.nextLine();


        // Converter toda a string para minúsculas
        texto = texto.toLowerCase();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
    }
}