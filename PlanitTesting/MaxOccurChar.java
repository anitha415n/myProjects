import java.util.*;
public class MaxOccurChar
{
  static final int MAX_CHAR = 256;
  public static void main(String[] args)
 {
        Scanner in = new Scanner(System. in);
        String k = in.nextLine();
        char tempArray[] = k.toCharArray(); 
        Arrays.sort(tempArray); 
        String s = new String(tempArray);
        int n = s.length();
        int max_count = 0;
        int count_ch = 1;
        char ans = '-';

        int count[] = new int[MAX_CHAR];
     // Initialize count array index
        int len = k.length();
        for (int i = 0; i < len; i++)
            count[k.charAt(i)]++;

        for (int i = 1; i <= n; i++)
        {
            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
            {
                if (max_count <count_ch)
                {
                    max_count = count_ch;
                    ans = s.charAt(i-1);
                }
                count_ch = 1;
            }
            else
            {
                count_ch++;
            }
        }
    if(count[k.charAt(0)]==max_count)
      System.out.println("Maximum occurring character is "+k.charAt(0));
 else
     System.out.println("Maximum occurring character is "+ans);
   }
 }