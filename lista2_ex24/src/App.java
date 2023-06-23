import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("      ***As operações disponiveis são 'adicao', 'subtracao', 'divisao' e 'multiplicacao'***");

        System.out.print("Informe um número: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe outro número: ");
        double n2 = ler.nextDouble();
        ler.nextLine();
        System.out.println("");

        System.out.print("Informe a operação desejada: ");
        String operacao = ler.nextLine();
        System.out.println("");

        ler.close();

        double resultado;


        if("adicao".equalsIgnoreCase(operacao)){
            resultado = n1 + n2;
            if(resultado % 2 == 0){
                System.out.printf("Resultado: %2.2f, o número é par,",resultado);
            }
            else{
                System.out.printf("Resultado: %2.2f, o número é impar,",resultado);
            }

            if(resultado >= 0){
                System.out.print(" positivo e ");
            }
            else{
                System.out.print(" negativo e ");
            }

            if(resultado % 1 == 0){
                System.out.print("inteiro.");
            }
            else{
                System.out.print("decimal.");
            }
        }

        else if("subtracao".equalsIgnoreCase(operacao)){
            resultado = n1 - n2;
            if(resultado % 2 == 0){
                System.out.printf("Resultado: %2.2f, o número é par,",resultado);
            }
            else{
                System.out.printf("Resultado: %2.2f, o número é impar,",resultado);
            }

            if(resultado >= 0){
                System.out.print(" positivo e ");
            }
            else{
                System.out.print(" negativo e ");
            }

            if(resultado % 1 == 0){
                System.out.print("inteiro.");
            }
            else{
                System.out.print("decimal.");
            }
        }

        else if("divisao".equalsIgnoreCase(operacao)){
            resultado = n1 / n2;
            if(resultado % 2 == 0){
                System.out.printf("Resultado: %2.2f, o número é par,",resultado);
            }
            else{
                System.out.printf("Resultado: %2.2f, o número é impar,",resultado);
            }

            if(resultado >= 0){
                System.out.print(" positivo e ");
            }
            else{
                System.out.print(" negativo e ");
            }

            if(resultado % 1 == 0){
                System.out.print("inteiro.");
            }
            else{
                System.out.print("decimal.");
            }
        }

        else if("multiplicacao".equalsIgnoreCase(operacao)){
            resultado = n1 * n2;
            if(resultado % 2 == 0){
                System.out.printf("Resultado: %2.2f, o número é par,",resultado);
            }
            else{
                System.out.printf("Resultado: %2.2f, o número é impar,",resultado);
            }

            if(resultado >= 0){
                System.out.print(" positivo e ");
            }
            else{
                System.out.print(" negativo e ");
            }

            if(resultado % 1 == 0){
                System.out.print("inteiro.");
            }
            else{
                System.out.print("decimal.");
            }
        }

        else{
            System.out.println("Operação inválida");
        }
    }
}