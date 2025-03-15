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
        float mediaFloat = (float) ((n1+n2+n3)/3.0f);
        long mediaLong = (long) ((n1+n2+n3)/3L);
        System.out.println("Os números são: "+ n1 + ", "+ n2+ ", "+ n3);
        System.out.println("A média do número Real é: "+ mediaReal);
        System.out.println("A média do número inteiro é: "+ mediaInt);
        System.out.println("A média do número tipo float é: "+ mediaFloat);
        System.out.println("A média do número tipo long é: "+ mediaLong);


        System.out.println("____________________________________________________________ \n");
        //declaração de var tipo Long
        long distancia = 149600000L;
        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");
    }
}