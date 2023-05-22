import java.util.Scanner;

public class signIn {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);

        String userName, pass, check, newpass;

        System.out.print("Enter your username :");
        userName = log.nextLine();

        System.out.print("Enter your password: ");
        pass = log.nextLine();

        if (userName.equals("patika") && pass.equals("java123")) {
            System.out.print("Login successful");

        }
        else if (userName.equals("patika") && !(pass.equals("java123"))) {
            System.out.print("Wrong password. Would you like to reset your password? (Yes or No):");
            check = log.nextLine();

            if (check.equals("Yes") || check.equals("yes")) {
                System.out.print("Enter a different password than the current password. ");
                newpass = log.nextLine();

                if (newpass.equals("java123")){
                    System.out.print("Error !, please enter another password.");
                }
                else
                    System.out.print("Password creation successful !");
            }
            else{
                    System.out.print("You did not reset the password .");
            }
        }
        else{
            System.out.print("The entered information is incorrect.");
        }
    }
}
