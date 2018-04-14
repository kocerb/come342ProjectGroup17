package controller;

import helper.Utils;
import come342.Database;
import model.Client;
import model.Campaign;

public class AddNewCampaign {
    private static final AddNewCampaign instance = new AddNewCampaign();
    public static AddNewCampaign getInstance() {
        return instance;
    }
    
    private AddNewCampaign(){
    }
    
    public void init (){
       	getClients();
    	selectClient();
    }

    private void getClients() {
	  	Utils.println("Select a client to add campaign:");
	  	int i = 1;
	  	Database.clientList.forEach((client) -> {
	  		 Utils.print(i + ". ");
	  		 Utils.print(client.getCompanyName());
	  		 Utils.print("\n");
	  	});
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

		Utils.print("Campaign Start Date: ");
		String cmStartDate = Utils.scanString();
		Utils.print("\n");

		Utils.print("Campaign Finish Date: ");
		String cmFinishDate = Utils.scanString();
		Utils.print("\n");		

		Utils.print("Estimated Cost: ");
		double cmCost = Utils.scanDouble();
		Utils.print("\n");

		Campaign campaign = new Campaign(cmName, cmStartDate, cmFinishDate, cmCost);

		client.addNewCampaign(campaign);

		Utils.println("Campaign added succesfully.");
	}

}