import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int a,b,c ;
        System.out.println("numero generado");
        a=aleatorio.nextInt(51);
        System.out.println("numero generado");
        b=aleatorio.nextInt((30-5)+1)+5;
        c= a + b ;
        System.out.println("a + b ="+c);

    }
}