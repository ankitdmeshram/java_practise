//Q. 1 ===========================
//****
//****
//****
//****
//****

//import java.util.*;
//public class assignment {
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//
//        int row = s.nextInt();
//        int col = s.nextInt();
//
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = 0; j < col; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//    }
//}


//================================================

//2. Hollow Rectangle Pattern

//****
//*  *
//*  *
//*  *
//****
//
//import java.util.Scanner;
//
//public class assignment {
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//
//        int row = s.nextInt();
//        int col = s.nextInt();
//
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = 0; j < col; j++)
//            {
//               if(i == 0 || i == (row-1))
//               {
//                   System.out.print("*");
//               } else {
//                   if(j == 0 || j == (col-1)){
//                       System.out.print("*");
//                   } else {
//                       System.out.print(" ");
//                   }
//               }
//            }
//            System.out.println(" ");
//        }
//
//    }
//}

//==============================================================

//Q.3 Inverted half pyramid
//*****
//****
//***
//**
//*

//import java.util.Scanner;
//
//public class assignment {
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int row = s.nextInt();
//        int col = row;
//
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = col; j > 0; j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//            col--;
//        }
//    }
//}

//==============================================================

//Q.4 Half Pyramid after 180 deg rotation

//    *
//   **
//  ***
// ****
//*****
//
//import java.util.Scanner;
//
//public class assignment {
//    public static void main(String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int row = s.nextInt();
//        int col = row;
//
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = 0; j < row; j++)
//            {
//                if(j >= (col-1))
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//            col--;
//        }
//    }
//}

//=======================================================

//Q.5 Half Pyramid using numbers

//1
//22
//333
//4444
//55555

//import java.util.Scanner;
//
//public class assignment {
//    public static void main (String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int row = s.nextInt();
//
//        for(int i = 0; i < row; i++)
//        {
//            for (int j = 0; j <= i; j++)
//            {
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }
//    }
//}

//====================================================================

//Q.6 Floyd's Triangle

//1
//23
//456
//78910
//1112131415

//import java.util.Scanner;
//
//public class assignment {
//    public static void main (String args[])
//    {
//        Scanner s = new Scanner(System.in);
//        int row = s.nextInt();
//        int n = 1;
//        for(int i = 0; i < row; i++)
//        {
//            for (int j = 0; j <= i; j++)
//            {
//                System.out.print(n);
//                n++;
//            }
//            System.out.println();
//        }
//    }
//}


