package verde.arquivosJAVA;

import java.util.*;

public class palindromo {

    public static boolean palindromoo(String p){

        for(int i=0;i<p.length()/2;i++){
            if(p.charAt(0)!=p.charAt(p.length()-i-1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String p;

        do{

            
            p=sc.nextLine();

            if(p.equals("FIM")){
                break;
            }

            if(palindromoo(p)){
                System.err.println("SIM");
            }else{
                System.err.println("NAO");
            }

       

        }while(true);

        sc.close();
    }
    
}
