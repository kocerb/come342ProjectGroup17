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
        Utils.println("9- Show all staffs");
        Utils.println("10- Show grades");
        Utils.printSymbol("-", 20);
        
        Utils.print("\nYour choice: ");
                
        switch(Utils.scanInt()) {
            case 1:
                Utils.printSymbol("*", 30);
                Utils.println("\nAdd a new client");
                AddNewClient.getInstance().run();
                mainMenu();
                break;                
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
            case 4:
                Utils.printSymbol("*", 30);
                Utils.println("\nAdd a new grade");
                AddNewGrade.getInstance().run();
                mainMenu();
                break;                  
            case 5:
                Utils.printSymbol("*", 30);
                Utils.println("\nChange rate of a grade");
                ChangeRateForGrade.getInstance().run();
                mainMenu();
                break;                  
            case 6:
                Utils.printSymbol("*", 30);
                Utils.println("\nChange grade of a staff");
                ChangeGradeForStaff.getInstance().run();
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
            case 9:
                Utils.printSymbol("*", 30);
                showStaffList();
                mainMenu();
                break;       
            case 10:
                Utils.printSymbol("*", 30);
                showGradeList();
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
            
            client.getClientCampaign().forEach((campaign) -> {
                campaigns.append(campaign.getTitle()).append(", ");
            });
            
            if(campaigns.length() != 0)
            campaigns.delete(((campaigns.length())-2), ((campaigns.length())-1));
            
            String items[] = {client.getCompanyName(),
                client.getCompanyAddress(),
                client.getContactName(),
                campaigns.toString()};
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
            
            campaign.getStaffList().forEach((staff) -> {
                staffs.append(staff.getStaffName()).append(", ");
            });
            
            if(staffs.length() != 0)
            staffs.delete(((staffs.length())-2), ((staffs.length())-1));
            
            String items[] = {campaign.getTitle(),
                campaign.getStartDate().toString(),
                campaign.getFinishDate().toString(),
                campaign.getEstimatedCost().toString(),
                staffs.toString()
            };
            Utils.printItems(items.length, items);
        });
        Utils.println("");
    }
    private static void showStaffList(){
        Utils.print("\nStaff List\n");
        Utils.printSymbol("-", 25);
        String headers[] = {"STAFF NO", "STAFF NAME", "START DATE","E-MAIL","STAFF TYPE","GRADE"};
        Utils.printHeadings(headers.length, headers);
        
        Database.staffList.forEach((staff) -> {
            String items[] = {String.valueOf(staff.getStaffNo()),
                staff.getStaffName(),
                staff.getStaffStartDate().toString(),
                staff.getStaffEmail(),
                staff.getClass().getSimpleName(),
                staff.staffGrade.grade.getName()
            };
            Utils.printItems(items.length, items);
        });
        Utils.println("");
    }
    
    private static void showGradeList(){
        Utils.print("\nGrade List\n");
        Utils.printSymbol("-", 25);
        String headers[] = {"GRADE NAME", "GRADE RATE", "RATE START DATE", "PAST RATES"};
        Utils.printHeadings(headers.length, headers);

        Database.gradeList.forEach((grade) -> {
            StringBuilder pastRates = new StringBuilder();

            grade.gradeRate.pastRates.forEach((rate) -> {
                pastRates.append(rate.getRate()).append("/").append(rate.getFinishDate()).append(", ");
            });
            
            if(pastRates.length() != 0)
            pastRates.delete(((pastRates.length())-2), ((pastRates.length())-1));
            
            String items[] = {grade.getName(),
                String.valueOf(grade.gradeRate.getRate()),
                grade.gradeRate.getStartDate().toString(),
                pastRates.toString()
            };
            Utils.printItems(items.length, items);
        });
        Utils.println("");        
    }
}
