import java.util.Scanner;

public class Bubble{

    public static void main(String[] args){

        int Numbers[]=new int[10];
        int N=10;
        int outer,inner,temp;
        Scanner input = new Scanner(System.in);
      
        System.out.println("Enter ten numbers for sorting:");   
        for(outer=0;outer<10;outer++)               //To get values from user
        Numbers[outer]=input.nextInt();
      
        
        for(outer=1;outer<N;outer++)                //To sort the array
        {
            for(inner=0;inner<N-outer;inner++)
            {
                if(Numbers[inner]>Numbers[inner+1])
                {
                    temp=Numbers[inner];
                    Numbers[inner]=Numbers[inner+1];
                    Numbers[inner+1]=temp;
                }
            }
        }
              
        System.out.println("Your numbers was ordered!") ;
        
        for(outer=0;outer<10;outer++)                   //To show the ordered numbers 
        System.out.print(Numbers[outer]+"   ");
        

    }
}