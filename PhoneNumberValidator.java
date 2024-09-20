import java.util.Scanner;

public class PhoneNumberValidator{
    public static void main(String[] args) {
        String[] mobile = { "03", "70", "71", "76","78", "80", "81" };
        String[] land = { "01", "02", "04", "05" };
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter phone number:");
        String mynum1 = myObj.nextLine();
        String x = "false";
        String mynum = null;

        if(mynum1.length()==8){
            mynum = mynum1.substring(0,2);
            System.out.println("Substring: "+ mynum);
        }else if(mynum1.length() < 8){
            System.out.println("too long");
        }else{
            System.out.println("too short");
        }

        

        if (mynum.length() == 2) {
            for (int i = 0; i < mobile.length; i++) {
                if (mynum.equals(mobile[i])) {
                    x = "mobile";
                }
            }
            for (int i = 0; i < land.length; i++) {
                if (mynum.equals(land[i])) {
                    x = "land";
                }
            }

            if (x.equals("mobile")) {
                System.out.println("Mobile");
            } else if (x.equals("land")) {
                System.out.println("Landline");
            } else {
                System.out.println("Error: Unknown number type.");
            }
        } else {
            System.out.println("Error: The input must be exactly 2 digits.");
        }

        myObj.close();  // Close the scanner to avoid resource leak
    }
}

