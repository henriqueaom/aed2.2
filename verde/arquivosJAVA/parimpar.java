package verde.arquivosJAVA;

import java.util.*;


public class parimpar {
    

    public static void parouimpar(int n){
        if(n%2==0){
            System.err.println("par");
        }else{
            System.err.println("impar");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        do{

        int n = sc.nextInt();

        if(n==0){
            break;
        }

        parouimpar(n);

      

    }while(true);



        sc.close();
    }
    
}
