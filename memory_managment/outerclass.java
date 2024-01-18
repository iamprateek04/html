public class outerclass 
{
        int x = 10;
      
        class InnerClass 
        {
          int y = 5;
        }
}
      
      class main 
      {
        public static void main(String[] args) 
        {
          outerclass myOuter = new outerclass();
          outerclass.InnerClass myInner = myOuter.new InnerClass();
          System.out.println(myInner.y + myOuter.x);
        }
      
      }

