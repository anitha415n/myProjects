
//Fibonaci numbers


class checkFibonaci
{
  public static void main(String[] args)
 {

         int num = 15, n1= 0, n2= 1;
         System.out.println("Fibonacci Series till " + num + " terms:");

      for (int i = 1; i <= num; ++i)
    {
            System.out.print(n1 + ", ");
             int sum = n1 + n2;
             n1 = n2;
             n2 = sum;
        if(num==n2)
        { 
       System.out.println("number found "+n2);
        break;
        }
      if( n2>num && n1<num )
        {
     System.out.println("number is between "+n1+"and "+n2);
     break;
        }
     }
 }
}