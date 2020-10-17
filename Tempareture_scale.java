import java.util.*;
 class Tempareture_scale
{
            public static void main(String args[])
            {
                 float cel, far, kal;
                 int x ;
                char var ;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the scale name that which you want convert your tempareture"
                        + "on others scale follow the next line \n"
                        + "Enter C for celsius F for Farenhite nad C for Kelvin :"
                        + "(N:B: Character must be in lower case)\n");

                var = input.next().charAt( x = 0);
                if (var == 'c')
                {
                    System.out.println("Enter your temp in celsius :");
                    cel = input.nextFloat();
                    far = ((cel*9)/5)+32 ;
                    kal = (cel + 273);
                    System.out.println("This temp is at Farenhite: " +far);
                    System.out.println("This temp is at Klavin: " +kal);
                }
                else if (var == 'f')
                {
                    System.out.println("Enter your temp Farenhite :");
                    far = input.nextFloat();
                    cel = ((far-32)*5)/9;
                    kal = (((far-32)*5)/9)+273;
                    System.out.println("This temp is at Celcius: " +cel);
                    System.out.println("This temp is at Kalvin: " +kal);
                }
                else if (var == 'k')
                {
                    System.out.println("Enter your temp in Kelvin :");
                    kal = input.nextFloat();
                    cel = kal - 273 ;
                    far = (((kal-273)*9)/5)+32;
                    System.out.println("This temp is at Celcius: " +cel);
                    System.out.println("This temp is at Farenhite: " +far);     
                }    
                else
                    System.out.println("Invalid Syntext !!");
            }
}
