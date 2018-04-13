
    import java.util.ArrayList; 
    import java.util.List; 
    package javaapplication1; 
    public class Client { 
        private String companyName; 
        private String companyAddress; 
        private String contactName; 
        private List<Campaign> CampaignList = new ArrayList<Campaign>(); 
        public Client(){} 
        public List<Campaign> getClientCampaign(){ 
            return CampaignList; 
        } 
        public void setcompanyName(String cname){ 
            companyName=cname; 
        } 
        public void setcompanyAddress(String cadd){ 
            companyAddress=cadd; 
        } 
        public void setcontactName(String conName){ 
            contactName=conName; 
        } 
        public String getContactName(){ 
            return contactName; 
        } 
        public String getcompanyName(){
            return companyName;
        } 
        public String getcompanyAddress(){ return companyAddress; } 
    }
    
}
