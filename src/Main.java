import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Метод- Невозвращающий метод
        //Как создать Метод
        //getmultiplication();
       // hello();
       // bye();
       // sPara("Aimaral",14,'a'); //po poryadku
        int[] array=new int[]{1,2,3,4,5,6,6};
        getArray(array);

        /*Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if (a==1){
            hello();
        } else if (a==2) {
            bye();
        }else{
            System.out.println("andai metod jok");
        }*/
    }

    /*public static void getmultiplication() {
        for (int i = 2; i < 10; i++) {
            for (int a = 1; a < 10; a++) {
                System.out.println(i + "*" + a + "=" + i * a);
            }
        }
    }*/

   /* public static void hello(){
        System.out.println("Hello");
    }
    public static void bye(){
        System.out.println("Bye");
    }*/
    /*public static void sPara(String name, int age,char symbol){
        System.out.println("Hallo Ich Heisse "  +name+" Ich bin"+age+"jare alt . Ich leibe symbol"+symbol);
    }*/

    public static void getArray(int[] array){
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

}