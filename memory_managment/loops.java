public class loops 
{
    public static void main(String[] args) 
    {
    

        for(int i =1 ; i<4 ; i++)
        {
            for(int j =1 ; j<4 ; j++)
            {
                if (i==j)
                {
                    continue;  // can use "break" also
                }

                System.out.println(i+ " "+j);

            }
            System.out.println("out of inner for loop");

        }
        
    }
}

// in some programming situations we want to take the control to the beginning of the loop by passing statements 
// inside the loop. which have not yet been executed.
// the keyword "continue" allows us to do this when continue is encountered inside a loop control jumps to the 
// beginning of the loop for performing next iteration
//  a contiue is usually assiciated with an if 
 
