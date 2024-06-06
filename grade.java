import java.util.*;
class grade
{  
   public static void main()        
   {
       Scanner sc = new Scanner(System.in);
       int p;double totmarks=0.0,m=0;
       System.out.print("Enter No. of subjects : ");
       p=sc.nextInt(); 
       String[] s=new String[p];
       String g[]=new String[p];
       for(int i=0;i<p;i++)
       {
          System.out.println("Enter Subject Name : ");
          s[i]=sc.next()+sc.nextLine();
          System.out.println("Enter Marks(Out of 100) : ");
          m=sc.nextDouble();
          g[i]=m<40 ? "Fail": m>=40 && m<=59 ? "D": m>=60 && m<=69 ? "C": m>=70 && m<=79 ? "B": m>=80 && m<=89 ? "A":"A+";
          totmarks=totmarks+m;
       }
       double avg=totmarks/p;
       System.out.println("\nSubject\t\tGrade");
       for(int i=0;i<p;i++)
       {
           System.out.println(s[i]+"\t\t"+g[i]);
       }
       System.out.println("\nTotal Marks Obtained : "+totmarks+"/"+p*100);
       System.out.println("Average percentage : "+avg);
       //System.out.println(p<40 ? "Fail": p>=40 && p<=59 ? "D": p>=60 && p<=69 ? "C": p>=70 && p<=79 ? "B": p>=80 && p<=89 ? "A":"A+"); //printing grade
   }
} 