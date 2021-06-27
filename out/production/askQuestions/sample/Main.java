// main package
package sample;

// imports
import sample.helloPackage.mainPackageClass;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mainPackageClass MPC = new mainPackageClass();

        System.out.println("Who am I? \n"+MPC.whoAmI);
        System.out.println("Can you give me Coco? \n"+MPC.requestCoco);

        System.out.print("Please write your desired username: ");	//note: used 'print' to show the input in the same line
        String username = scanner.next();		// input place

        System.out.println("Account with username "+username+" created!");		// sort of a "check"
        System.out.println("Hello "+username+"!");

    }
}
