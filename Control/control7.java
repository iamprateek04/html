//  Write a program to check whether a character is alphabet or not

class control7 
{
    public static void main(String[] args) 
    {
       char a = '2'; 

       if ((a>='A' && a<='Z')|| (a>='a' && a<='z')) 
       {
        System.out.println(a+ " is an alphabet ");
       }
        else 
        {
            System.out.println(a+ " is not an alphabet");
        }
    }   
}