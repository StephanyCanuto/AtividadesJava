import java.sql.SQLOutput;

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

        System.out.println("____________________________________________________________ \n");
        //Somando dois números
        int numero01 = 5;
        int numero02 = 7;
        int soma = numero01 + numero02;

        System.out.println("A soma é: " + soma);

        System.out.println("____________________________________________________________ \n");
        //Declarando várias variáveis

        int idadeP = 25;
        double alturaP = 1.75;
        char inicial = 'S';
        boolean estudante = true;

        System.out.println("Sua idade é " + idadeP);
        System.out.println("Sua altura é " + alturaP);
        System.out.println("A inicial do seu nome é '" + inicial + "'");
        System.out.println("Você é estudante? " + estudante);


        System.out.println("____________________________________________________________ \n");
        //Atividade 1: Pré-incremento e Pós-incremento

        int a = 5;
        int b = a++;
        int c = ++a;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);


        System.out.println("____________________________________________________________ \n");
        //Atividade 3: Operadores Abreviados
        int valor = 20;
        valor = valor + 5;
        valor = valor * 2;
        valor = valor - 3;
        valor = valor / 2;
        valor = valor % 4;
        System.out.println("Resultado final: " + valor);


        System.out.println("____________________________________________________________ \n");
        //Ordem de operações matemáticas

        int senai1 = 10;
        int senai2 = 20;

        //exemplo da forma errada
        System.out.println("O valor da soma é: "+ senai1 + senai2);

        //exemplo da forma correta
        System.out.println("O valor da soma é: "+ (senai1 + senai2));


        System.out.println("____________________________________________________________ \n");
        //Usando Sequência de escape
        System.out.println("meu nome é \"Stephany\"\nEu tenho 20 anos");



        System.out.println("____________________________________________________________ \n");
        //Convertendo tipos
        int myInt;
        double myPercent = 51.9;
        myInt = (int)myPercent; // O número é "cortado"
        System.out.println(myInt);
        // myInt é 51



        System.out.println("____________________________________________________________ \n");
        //idade
        int ageYears = 20;
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;
        System.out.println("Você já tem " + ageDays
                + " dias de idade.");

        System.out.println("Você já tem " + ageSeconds
                + " segundos de idade.");

    }


}