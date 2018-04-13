package come342;

import helper.Utils;
import controller.*;

public class App {

    public static void main(String[] args) {
        Database.init();
        mainMenu();
    }
    
    public static void mainMenu() {
        Utils.println("Make a selection: ");
        Utils.println("1- Add a new campaign");        
        Utils.println("2- Show Client List");
        Utils.println("3- Show Campaign List");
        Utils.printSymbol("-", 20);
        
        Utils.print("\nYour choice: ");
                
        switch(Utils.scanInt()) {
            case 1:
                Utils.printSymbol("*", 30);
                Utils.println("\nAdd a new campaign");
                AddNewCampaign.getInstance();
                mainMenu();
                break;
            case 2:
                Utils.printSymbol("*", 30);
                showClientList();
                mainMenu();
                break;
            case 3:
                Utils.printSymbol("*", 30);
                showCampaignList();
                mainMenu();
                break;               
            default:
                Utils.println("Error. Please choose between 1,2 and 3");
                mainMenu();
                break;
        }
    }
        
    private static void showClientList(){
        Utils.print("\nClient List\n");
        Utils.printSymbol("-", 25);
        Utils.printHeadings("COMPANY NAME", "COMPANY ADDRESS", "COMPANY EMAIL", "CONTACT NAME", "CONTACT EMAIL");
        //PINAR
    }
        
    private static void showCampaignList(){
        Utils.print("\nCampain List\n");
        Utils.printSymbol("-", 25);
        Utils.printHeadings("CAMPAIGN TITLE", "START DATE", "FINISH DATE", "ESTIMATED COST", "ASSIGNED STAFFS");
        //PINAR
    }
}
