package controller;

import helper.Utils;
import come342.Database;
import java.time.LocalDate;
import model.Client;
import model.Campaign;

public class AddNewCampaign {
    private static final AddNewCampaign instance = new AddNewCampaign();
    public static AddNewCampaign getInstance() {
        return instance;
    }
    
    private AddNewCampaign(){
    }
    
    public void init (Client client){
        this.addCampaign(client);
    }
    
    public void run (){
        getClients();
    	selectClient();
    }

    private void getClients() {
	  	Utils.println("Select a client to add campaign:");
	  	  	 for(int i=1;i<=Database.clientList.size();i++){   
	  		 Utils.print(i + ". ");
	  		 Utils.print(Database.clientList.get(i-1).getCompanyName());
	  		 Utils.print("\n");        
	  	}
	  	Utils.println("Selection: ");
	}

    private void selectClient() {
	  	int choice = Utils.scanInt();
	  	Client selectedClient = Database.clientList.get(choice - 1);
		this.addCampaign(selectedClient);
	}

    private void addCampaign(Client client) {
	Utils.println("Enter campaign details");
	
	Utils.print("Campaign Name: ");
	String cmName = Utils.scanString();
	Utils.print("\n");

	Utils.print("Campaign Start Date in format YYYY MM DD: ");
	int year = Utils.scanInt();
        int month = Utils.scanInt();
        int day = Utils.scanInt();
        LocalDate cmStartDate = LocalDate.of(year, month, day);
	Utils.print("\n");

        
	Utils.print("Campaign Finish Date in format YYYY MM DD: ");
	year = Utils.scanInt();
        month = Utils.scanInt();
        day = Utils.scanInt();
        LocalDate cmFinishDate = LocalDate.of(year, month, day);
	Utils.print("\n");		

	Utils.print("Estimated Cost: ");
	double cmCost = Utils.scanDouble();
	Utils.print("\n");

	Campaign campaign = new Campaign(cmName, cmStartDate, cmFinishDate, cmCost);

	client.addNewCampaign(campaign);

	Utils.println("Campaign added succesfully.");
	}

}