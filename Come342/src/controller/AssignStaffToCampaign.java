package controller;

import helper.Utils;
import come342.Database;
import model.Client;
import model.Campaign;
import model.CreativeStaff;
import model.StaffMember;

public class AssignStaffToCampaign {
    private static final AssignStaffToCampaign instance = new AssignStaffToCampaign();
    private Campaign selectedCampaign;
    private StaffMember selectedStaff;
    
    public static AssignStaffToCampaign getInstance() {
        return instance;
    }
    
    private AssignStaffToCampaign(){
    }
    
    public void init(Campaign campaign){
        this.getStaffs();
        this.selectStaff();
        this.assignStaff(campaign);
    }
    public void run (){
        this.getCampaigns();
        this.selectCampaign();
        this.getStaffs();
        this.selectStaff();
        this.assignStaff();
    }
    
    public void getCampaigns(){
	  	Utils.println("Select a campaign to assign staff:");
	  	  	 for(int i=1;i<=Database.campaignList.size();i++){   
	  		 Utils.print(i + ". ");
	  		 Utils.print(Database.campaignList.get(i-1).getTitle());
	  		 Utils.print("\n");        
	  	}
	  	Utils.println("Selection: ");
	}
    
    public void selectCampaign(){
        int choice = Utils.scanInt();
	this.selectedCampaign = Database.campaignList.get(choice - 1);
    }
    
    public void getStaffs(){
        	  	Utils.println("Select a staff to assign staff:");
	  	  	 for(int i=1;i<=Database.staffList.size();i++){   
	  		 Utils.print(i + ". ");
	  		 Utils.print(Database.staffList.get(i-1).getStaffName());
	  		 Utils.print("\n");        
	  	}
	  	Utils.println("Selection: ");
    }
    
    public void selectStaff(){
        int choice = Utils.scanInt();
        this.selectedStaff = Database.staffList.get(choice-1);
    }
    public void assignStaff(){
        selectedCampaign.assignStaff(selectedStaff);
    }
    public void assignStaff(Campaign campaign){
        campaign.assignStaff(selectedStaff);
    }
}
