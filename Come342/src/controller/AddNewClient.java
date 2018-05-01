package controller;

import helper.Utils;
import come342.Database;
import model.Client;
//import model.Campaign;


public class AddNewClient {
    private static final AddNewClient instance = new AddNewClient();
    public static AddNewClient getInstance() {
        return instance;
    }
    
    private AddNewClient(){
    }
    
    public void init (){
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
		String conName = Utils.scanDouble();
		Utils.print("\n");
        
       	Utils.print("Contact E-mail: ");
		String conEmail = Utils.scanString();
		Utils.print("\n");	

		Client client = new Client(name, address, email, conName, conEmail);

		Database.clientList.add(client);

		Utils.println("Client added succesfully.");
        this.addCampaign(Client client);
    }
    
    public void addCampaign() {
        AddNewCampaign.getInstance.init(client);
    }
}
