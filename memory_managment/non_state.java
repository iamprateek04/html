import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class non_state 
{
    int age;        //instance variable
    string name;
    string clg;

    non_state(int x,string N, string C)     
    {
         age = x;
         name = N;
         clg = C;
    } 

    public static void main(String[] args) 
    {
        int x=90;
        non_state prateek = new non_state(x= 21, "prateek","lnct");
        non_state karan = new non_state(22,"karan","sirt");
        System.out.println(prateek.age);
        System.out.println(prateek.name);
        System.out.println(prateek.clg);
        System.out.println(karan.age);
        System.out.println(karan.name);
        System.out.println(karan.clg);

       
    }
}
