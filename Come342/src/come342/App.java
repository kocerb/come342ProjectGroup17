package come342;
import helper.Utils;
import controller.*;

public class App {
    public static void main(String[] args) {
        Database.init();
        mainMenu();
    }
    public static void mainMenu() {
        Utils.println("\nMake a selection: ");
        Utils.println("1- Add a new client");        
        Utils.println("2- Add a new campaign");
        Utils.println("3- Assign staff to work on a campaign");
        Utils.println("4- Add a new grade");
        Utils.println("5- Change rate of a grade");
        Utils.println("6- Change grade of a staff");
        Utils.println("7- Show clients");
        Utils.println("8- Show campaigns");
        Utils.printSymbol("-", 20);
        
        Utils.print("\nYour choice: ");
                
        switch(Utils.scanInt()) {
            case 2:
                Utils.printSymbol("*", 30);
                Utils.println("\nAdd a new campaign");
                AddNewCampaign.getInstance().run();
                mainMenu();
                break;
            case 3:
                Utils.printSymbol("*", 30);
                Utils.println("\nAssign staff to work on a campaign");
                AssignStaffToCampaign.getInstance().run();
                mainMenu();
                break;                
            case 7:
                Utils.printSymbol("*", 30);
                showClientList();
                mainMenu();
                break;
            case 8:
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
        String headers[] = {"COMPANY NAME", "COMPANY ADDRESS", "CONTACT NAME", "CAMPAIGNS"};
        Utils.printHeadings(headers.length, headers);
	Database.clientList.forEach((client) -> {
            StringBuilder campaigns = new StringBuilder();
            client.getClientCampaign().forEach((campaign) -> {campaigns.append(campaign.getTitle()).append(", ");});
            if(campaigns.length() != 0)
            campaigns.delete(((campaigns.length())-2), ((campaigns.length())-1));
            
            String items[] = {client.getCompanyName(), client.getCompanyAddress(), client.getContactName(), campaigns.toString()};
            Utils.printItems(items.length, items);
            }); 
        Utils.println("");
        }
    private static void showCampaignList(){
        Utils.print("\nCampain List\n");
        Utils.printSymbol("-", 25);
        String headers[] = {"CAMPAIGN NAME", "CAMPAIGN START DATE", "CAMPAIGN FINISH DATE","ESTIMATED COST","STAFFS WORKING"};
        Utils.printHeadings(headers.length, headers);
	Database.campaignList.forEach((campaign) -> {
            StringBuilder staffs = new StringBuilder();
            campaign.getStaffList().forEach((staff) -> {staffs.append(staff.getStaffName()).append(", ");});
            if(staffs.length() != 0)
            staffs.delete(((staffs.length())-2), ((staffs.length())-1));
            
            String items[] = {campaign.getTitle(),
                campaign.getStartDate(),
                campaign.getFinishDate(),
                campaign.getEstimatedCost().toString(),
                staffs.toString()
            };
            Utils.printItems(items.length, items);
            });
        Utils.println("");
    }
}
