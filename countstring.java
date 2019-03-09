import java.util.*;

class Ideone

    {
        public static void main(String arg[]){
        int sum=0,l;
        Scanner s=new Scanner(System.in);
      
        String val=s.nextLine();
         l=val.length();
            for(int i=0;i<l;i++){
                if(val.charAt(i)==' ')
                    {
                        continue;
                    }
                    sum++;
                    }
                    System.out.println(sum);
                }
    }
