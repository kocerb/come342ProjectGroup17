package controller;

import helper.Utils;
import helper.Database;
import model.Client;
import model.Campaign;

public class AddNewCampaign {
    public AddNewCampaign() {
    	getClients();
    	selectClient();
    	addCampaign();    
    }

 	private List<Client> getClients() {
	  	Utils.println("Select a client to add campaign:");
	  	int i = 1;
	  	Database.clientList.forEach((client) -> {
	  		 Utils.print(i + ". ");
	  		 Utils.print(client.getCompanyName());
	  		 Utils.print("\n");
	  	});
	  	Utils.println("Selection: ");
	}

	private selectClient() {
	  	int choice = Utils.scanInt();
	  	Client selectedClient = Database.clientList.get(choice - 1);
		this.addCampaign(selectedClient);
	}

	private addCampaign(Client client) {
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
		String cmCost = Utils.scanDouble();
		Utils.print("\n");

		Campaign campaign = new Campaign(cmName, cmStartDate, cmFinishDate, cmCost);

		client.addNewCampaign(Campaign campaign);

		Utils.println("Campaign added succesfully.");
	}

}}