import java.util.*;
import java.text.DecimalFormat;

public class currency_converter
{
    public static void main(String[] args)
    {
        double amount;
        double rupee, dollar, pound, euro, yen, ringgit;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Ruppe");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");
        System.out.println("Enter 5: Yen");
        System.out.println("Enter 5: Ringgit");

        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (choice)
        {
            case 1:  // Ruppe Conversion
                dollar = amount / 70;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

                pound = amount / 88;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

                euro = amount / 80;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");

                yen = amount / 0.63;
                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");

                ringgit = amount / 16;
                System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
                break;

            case 2:  // Dollar Conversion
                rupee = amount * 70;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");

                pound = amount *0.78;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount *0.87;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                yen = amount *111.087;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

                ringgit = amount *4.17;
                System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
                break;

            case 3:  // Pound Conversion
                rupee = amount * 88;
                System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");

                dollar = amount *1.26;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                euro = amount *1.10;
                System.out.println(amount + " pound = " + f.format(euro) + " Euro");

                yen = amount *140.93;
                System.out.println(amount + " pound = " + f.format(yen) + " Yen");

                ringgit = amount *5.29;
                System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
                break;

            case 4:  // Euro Conversion
                rupee = amount * 80;
                System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");

                dollar = amount *1.14;
                System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

                pound = amount *0.90;
                System.out.println(amount + " euro = " + f.format(pound) + " Pound");

                yen = amount *127.32;
                System.out.println(amount + " euro = " + f.format(yen) + " Yen");

                ringgit = amount *4.78;
                System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
                break;

            case 5:  // Yen Conversion
                rupee = amount *0.63;
                System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");

                dollar = amount *0.008;
                System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");

                pound = amount *0.007;
                System.out.println(amount + " yen = " + f.format(pound) + " Pound");

                euro = amount *0.007;
                System.out.println(amount + " yen = " + f.format(euro) + " Euro");

                ringgit = amount *0.037;
                System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
                break;

            case 6:  // Ringgit Conversion
                rupee = amount *16.8;
                System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");

                dollar = amount *0.239;
                System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");

                pound = amount *0.188;
                System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");

                euro = amount *0.209;
                System.out.println(amount + " ringgit = " + f.format(euro) + " euro");

                yen = amount *26.63;
                System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
                break;

            //Default case
            default:
                System.out.println("Invalid Input");
        }
    }
}