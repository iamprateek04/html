public class whilel 
{
    public static void main(String[] args) 
    {

        // int n=1;
        // while (n<=6) 
        // {
        //     int c =1;
        //     while (c<=6) 
        //     {
        //       System.out.print("* ");
        //       c++;  
        //     }
        //    System.out.println();
        //    n++; 
        // }
        
    // }

    // {
    //     int n=6;
    //     for(int r=1; r<=n; r++) 
    //     {
    //         for(int c=1; c<=n-1; c++)
    //         {
    //             if (r==1||c==1||r==n||c==n-1) 
    //             {
    //                 System.out.print("* ");
    //             }
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }


    // {
    //     int n=5;
    //     for(int r=1; r<=n; r++) 
    //     {
    //         for(int c=1; c<=n; c++)
    //         {
    //             if (r==1||c==1||r==n||c==n||c==r||c+r==n+1) 
    //             {
    //                 System.out.print("* ");
    //             }
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }

    //   {
    //     int n=5;
    //     for(int r=1; r<=n; r++) 
    //     {
    //         for(int c=1; c<=n; c++)
    //         {
    //             if (c==r||c+r==n+1) 
    //             {
    //                 System.out.print("* ");
    //             }
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }


    //  {
    //     int n=5;
    //     for(int r=1; r<=n; r++) 
    //     {
    //         for(int c=1; c<=n; c++)
    //         {
    //             if (r==1||r==n||c==r||c+r==n+1) 
    //             {
    //                 System.out.print("* ");
    //             }
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }


    //  {
    //     int n=5;
    //     for(int r=1; r<=n; r++) 
    //     {
    //         for(int c=1; c<=n; c++)
    //         {
    //             if (r==1||n==r||r==n-1) 
    //             {
    //                 System.out.print("* ");
    //             }
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }

//     {
//     int n=5;
//     for(int r =1; r<=n; r++ )
//     {
//         for(int c=r ; c<=n ; c++)
//         {
//             System.out.print(" ");
//         }
//         for(int c=1; c<=r; c++)
//         {
//             System.out.print("* ");
//         }

//         System.out.println();
//     }
// }

//    {
//     int k=5;
//     for(int i=0; i<k; i++)
//     {
//         for(int j=0 ; j<i ; j++)
//         {
//             System.out.print(" ");
//         }
//         for(int j=i ; j<k ; j++)
//         {
//             System.out.print("* ");
//         }

//         System.out.println();
//     }
//    }



    // Diamond
    int a=5;
    for(int r=1 ; r<=a ; r++)
    {
        for(int c=r ; c<=a ; c++)
        {
            System.out.print(" ");
        }
        for(int c=1 ; c<r ; c++)
        {
            System.out.print("* ");
        }

        System.out.println();
    }

    // for(int r=0 ; r<a ; r++)
    // {
    //     for(int c=0 ; c<r ; c++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int c=r ; c<a ; c++)
    //     {
    //         System.out.print("* ");
    //     }
        
    //     System.out.println();
    // }



    // plus
    // int l=7;
    // for(int i=0 ; i<l ;i++)
    // {
    //     for(int j=0 ; j<l ;j++)
    //     {
    //         if (i==l/2 || j==l/2) 
    //         {
    //             System.out.print("*");
    //         }
    //         else
    //         {
    //             System.out.print(" ");
    //         }
    //     }

    //     System.out.println();
    // }

// {
    // int n= 5;
    // for(int i=0 ; i<n ; i++)
    // {
    //     for(int j=i ; j<n ; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     for(int k=0 ; k<2*i ; k++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=i ; j<n ; j++)
    //     {
    //         System.out.print("*");
    //     }

    //     System.out.println();
    // }

// {
//     int d =5;
//     for(int i=0; i<=d; i++)
//     {
//         for(int j=0 ; j<i ; j++)
//         {
//             System.out.print("&");
//         }
//         for(int j=i ; j<d ; j++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// {
// int n=7;
//     for(int r=1 ; r<=n ; r++)
//     {
//         for(int c=1 ; c<n ; c++)
//         {
//             if (r==1) 
//             {
//                System.out.print("* "); 
//             }
//             else{
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//     }
// }


// swastik
// {
    //     int n=5;
    //     for(int r=1; r<=n; r++) 
    //     {
    //         for(int c=1; c<=n; c++)
    //         {
    //             if (c==3 && r>=1 ||r==3 && c>=1)
    //             {
    //                 System.out.print("* ");
    //             }

    //             else if (c==1 && r<=(n/2)) 
    //             {
    //                 System.out.print("* ");
    //             }

    //             else if (r==1 && c>(n/2)+1) 
    //             {
    //                 System.out.print("* ");
    //             }

    //             else if (r==n && c<=n/2) 
    //             {
    //                 System.out.print("* ");
    //             }

    //             else if (c==n && r>=(n/2)+1) 
    //             {
    //                 System.out.print("* ");
    //             }
                
    //             else
    //             System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }
    // {
    //     int n=5;
        
    //     for(int i=1; i<=n ; i++)
    //     {
    //         for(int c=1; c<=i; c++)
    //         {
    //             System.out.print(i+" ");
    //         }

    //         System.out.println();
    //     }
    // }

// {
//         int a=5;
//     for(int r=1,p=1 ; r<=a ; r++,p++)
//     {
//         for(int c=r ; c<a ; c++)
//         {
//             System.out.print(" ");
//         }
//         for(int c=1 ; c<=r ; c++)
//         {
//             System.out.print(p+" ");
//         }
//         for(int c=1 ; c<=r ; c++)
//         {
//             System.out.print(p+" ");
//         }

//         System.out.println();
//     }
// }

// {
//     int x=5;
//     {
//         for(int r =1, p=1; r<=x; r++,p++)
//         {
//             for(int c =1 ; c<=r; c++)
//             {
//                 if (r==1||r==3||r==5) 
                    
//                 System.out.print(p+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// {
//         int a=5;
//  for(int r=1, p=5 ; r<=a ; r++,p--)
//     {
//         for(int c=1 ; c<=r ; c++)
//         {
//             System.out.print(" ");
//         }
//         for(int c=r ; c<=a ; c++)
//         {
//             System.out.print(p+" ");
//         }
//         // for(int c=r ; c<a ; c++)
//         // {
//         //     System.out.print("* ");
//         // }
        
//         System.out.println();
//     }

// }


// {
// int n=5;
// {
// for (int i = 1; i <= n; i++) 
// {
   
//     for (int j = 1; j  <= i; j++) 
//     {
//         System.out.print("*");
//     }
  
//     for (int j = 1; j  <= 2 * (n - i); j++) 
//     {
//         System.out.print(" ");
//     }
// }
//     for (int i = n; i >= 1; i--) 
//     {
        
//         for (int j = 1; j  <= i; j++) 
//         {
//             System.out.print("*");
//         }
//         for (int j = 1; j  <= 2 * (n - i); j++) 
//         {
//             System.out.print(" ");
//         }
//     }
        

//         System.out.println();
// }
}}




// for loop used when we knows the condition how much ttimes it will run , in while loop we use when we dont know the condition how much time its been used
