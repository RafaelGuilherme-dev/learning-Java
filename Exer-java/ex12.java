public class Main
{
  public static void main (String[]args)
  {

    int c = 2;
    int m = 0;
    
    for (m = 3; c <= 5000; c = c * 2, m = m + 3)
      {
	    System.out.println (m + " Meses");
      }
    System.out.println ((m / 12) + " Anos");
  }
}
