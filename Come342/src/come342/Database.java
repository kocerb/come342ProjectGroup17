package come342;

import helper.Utils;
import java.util.ArrayList;
import java.util.List;
import model.Campaign;
import model.Client;
import model.StaffMember;
import model.CreativeStaff;
import model.AdminStaff;
import model.Grade;

public class Database {
    public static List<Client> clientList = new ArrayList<Client>();
    public static List<Campaign> campaignList = new ArrayList<Campaign>();    
    public static List<StaffMember> staffList = new ArrayList<StaffMember>();    
    public static List<Grade> gradeList = new ArrayList<Grade>();

    public static void init() {
        Client eti = new Client("ETI HOLDING", "İstanbul/Gebze", "info@eti.com","Ahmet Bey","ahmet_bey@yonja.com");
        Campaign eti20 = new Campaign("ETI 20.YIL", "20/06/2017", "20/08/2017",1500000.00);
        eti.addNewCampaign(eti20);
        Client rbs = new Client("RBS TASARIM", "İstanbul/Mecidiyekoy", "information@rbetuls.com", "Betul Bey","Betul_bey@hotmail.com");
        Campaign rbs10 = new Campaign("RBS 10.YIL", "10/06/2017", "30/08/2017",1100000.00);
        rbs.addNewCampaign(rbs10);
        
        AdminStaff aStaff1 = new AdminStaff(125, "aStaff1", "start1", "email1");
        staffList.add(aStaff1);
        CreativeStaff cStaff1 = new CreativeStaff(125, "cStaff1", "start1", "email1");
        staffList.add(cStaff1);
        AdminStaff aStaff2 = new AdminStaff(125, "aStaff2", "start1", "email1");
        staffList.add(aStaff2);
        CreativeStaff cStaff2 = new CreativeStaff(125, "cStaff2", "start1", "email1");
        staffList.add(cStaff2);
        CreativeStaff cStaff3 = new CreativeStaff(125, "cStaff3", "start1", "email1");
        staffList.add(cStaff3);
        
        clientList.add(eti);
        clientList.add(rbs);
    }
}
