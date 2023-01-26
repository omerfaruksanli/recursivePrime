import java.util.Scanner;
public class Main {
    static boolean isPrime(int number , int i ){
        if(number<=2){
            return (number==2) ? true : false ;
        }
        if (number==i){
            return true;
        }
        if (number % i == 0 ){
            return false;
        }
        return isPrime(number,i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number , i = 2;

        do {
            System.out.print("NUMBER : ");
            number = input.nextInt();
            if (isPrime(number,i)){
                System.out.println("Prime Number !");
            }else {
                System.out.println("İs not prime :( ");
            }
        }while (number>=0);






    }
}