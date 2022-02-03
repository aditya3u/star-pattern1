public class examples {
    public static void main(String [] args)
    {
        int i,j;
        char c= 'A';
        for(i=1;i<=4;i++)
        {
             c='A';
            for(j=1;j<=7;j++)
            {
                if(j>=5-i &&j<= 3+i)
                {
                    System.out.print(c);
                    if(j<=4)
                    {
                    c++;
                    }
                    else
                    c--;
                    
                   
                    
                }
                else

                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
