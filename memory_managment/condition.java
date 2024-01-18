public class condition {
    // if(condition)
    // conditional operator returns true or false and are binary operators
//     > : greater than
//     < :less than
//     >= : greater than or equal to
//     <= : less than or equal 
//     != : not equal
//     == : equal equal

// TCS NQT and ELITMUS APTITUDE PREP.

public static void main(String[] args)
 {
    int x = 78;
    int y = 78;
    if (x<90) 
    {
     System.out.println("inside first if");
     if (x>90)
      {
     System.out.println("inside second if");   
     }   
     System.out.println("outside second if");

    }
//     System.out.println("outside if inside if");

// if (x!=y)
// {
//   System.out.println("inside"); 
// }
else if(x==y)
{
    System.out.println("output");
}

}
}
