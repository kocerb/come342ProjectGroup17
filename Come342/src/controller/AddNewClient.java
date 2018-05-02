package controller;

import helper.Utils;
import come342.Database;
import model.Client;

public class AddNewClient {
    private static final AddNewClient instance = new AddNewClient();
    public static AddNewClient getInstance() {
        return instance;
    }
    
    private AddNewClient(){
    }
    
    public void run (){
        addClient();
    }
    
    public void addClient() {
        Utils.println("Enter client details");
		
	Utils.print("Company Name: ");
	String name = Utils.scanString();
	Utils.print("\n");

	Utils.print("Company Address: ");
	String address = Utils.scanString();
	Utils.print("\n");

	Utils.print("Company E-mail: ");
	String email = Utils.scanString();
	Utils.print("\n");		

	Utils.print("Contact Name: ");
	String conName = Utils.scanString();
	Utils.print("\n");
        
       	Utils.print("Contact E-mail: ");
	String conEmail = Utils.scanString();
	Utils.print("\n");	

	Client client = new Client(name, address, email, conName, conEmail);

	Database.clientList.add(client);

	Utils.println("Client added succesfully.");
        this.addCampaign(client);
    }
    
    public void addCampaign(Client client) {
        AddNewCampaign.getInstance().init(client);
    }
}
