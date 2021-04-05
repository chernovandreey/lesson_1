import java.util.Scanner;

public class IwantPizza {

    public static void main(String[] args) throws InterruptedException {


        Scanner r = new Scanner(System.in);


        System.out.print("Хочешь ли ты пиццы?");
        String n = r.nextLine();

        if (n != null && "да".equals(n) )
              { Thread.sleep(5000);
            System.out.print("кушац подано"); }
        if (n != null && "нет".equals(n) )
        {
            System.out.println("Пока!");
        }






    }}