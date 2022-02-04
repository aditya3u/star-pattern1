public class star {
    public static void main(String [] args)
    {
        int i,j,k;
        char a;
        for(i=1;i<=4;i++)
        {
            k=1;
            a='A';
            
            for(j=1;j<=7;j++)
            {
                if(j>=5-i &&j<=3+i)
                {
                    if(j<=4)
                    {
                    System.out.print(k);
                    k++;
                    }
                    else {
                    
                    System.out.print(a);
                    a++;
                    }
                
                }
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
