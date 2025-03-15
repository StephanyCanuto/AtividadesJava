//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //media de 3 números

        int n1 = 10;
        int n2 = 8;
        int n3 = 12;

        double mediaReal = (n1+n2+n3)/3.0;
        int mediaInt = (n1+n2+n3)/3;
        float mediaFloat = (n1+n2+n3)/3.0f;
        long mediaLong = (n1+n2+n3)/3L;
        System.out.println("Os números são: "+ n1 + ", "+ n2+ ", "+ n3);
        System.out.println("A média do número Real é: "+ mediaReal);
        System.out.println("A média do número inteiro é: "+ mediaInt);
        System.out.println("A média do número tipo float é: "+ mediaFloat);
        System.out.println("A média do número tipo long é: "+ mediaLong);


        System.out.println("____________________________________________________________ \n");
        //declaração de var tipo Long
        long distancia = 149600000L;
        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");


        System.out.println("____________________________________________________________ \n");
        //valor unicode ->> CHAR
        char letra = 'A';
        char letra1 = 'B';
        char letra2 = 'C';
        char letra3 = 'D';
        char letra4 = 'E';

        System.out.println("O valor Unicode de '" + letra + "' é: " + (int) letra);
        System.out.println("O valor Unicode de '" + letra1 + "' é: " + (int) letra1);
        System.out.println("O valor Unicode de '" + letra2 + "' é: " + (int) letra2);
        System.out.println("O valor Unicode de '" + letra3 + "' é: " + (int) letra3);
        System.out.println("O valor Unicode de '" + letra4 + "' é: " + (int) letra4);

        System.out.println("____________________________________________________________ \n");
        //tipos booleans -- comparação de verdadeiro ou falso
        int numero = 5;
        boolean maiorQueDez = numero > 10;
        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);


        System.out.println("____________________________________________________________ \n");
        //Arrays
        int[] Listanumeros = {10, 20, 30, 40, 50};
        System.out.println("Primeiro número: " + Listanumeros[0]);
        System.out.println("Último número: " + Listanumeros[Listanumeros.length - 1]);


        System.out.println("____________________________________________________________ \n");
        //Calculando áreaa do retângulo
        double largura = 5.0;
        double altura = 3.0;
        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area);

        System.out.println("____________________________________________________________ \n");
        //String e dados de diversos tipos
        String nome = "Stephany";
        int idade = 20;
        double peso = 58.5;
        System.out.println("Olá, meu nome é " + nome + ", tenho "+ idade + "anos e meu peso é "+ peso + "kg.");


        System.out.println("____________________________________________________________ \n");
        //Verificando se o número é par ou impar
        int num = 8;
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }

        


    }


}