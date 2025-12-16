import java.util.*;

public class Quadratic {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter Coefficient for a:");
        a=sc.nextDouble();
        System.out.println("Enter Coefficient for b:");
        b=sc.nextDouble();
        System.out.println("Enter Coefficient for c:");
        c=sc.nextDouble();
        int s=0;
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("Equation has Infinite Solutions");
                }
                else{
                    System.out.println("Equation has No Solutions");
                }
                s=1;
            }
            else{
                double r=-c/b;
                System.out.println("The Only one root is:"+r);
            }
            s=1;
        }
        else{
            double d=(b*b-(4*a*c));
            if (d>0){
                double x1=(Math.sqrt(d)-b)/(2*a);
                double x2=-(Math.sqrt(d)+b)/(2*a);
                System.out.println("The 2 Roots are: "+x1+" And "+x2);
            }
            else if(d==0){
                double x=-b/(2*a);
                System.out.println("The Root is: "+x);
            }
            else{
                double r=-b/(2*a);
                double i= Math.sqrt(d);
                System.out.println("The 2 roots are imaginary with, real part: "+r+" imaginary part: "+i+"i");
            }
        }
    }
}
