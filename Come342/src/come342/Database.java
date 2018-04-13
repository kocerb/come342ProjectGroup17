package come342;

import java.util.ArrayList;
import java.util.List;
import model.Campaign;
import model.Client;

public class Database {
    public static List<Client> clientList = new ArrayList<Client>();
    public static List<Campaign> campaignList = new ArrayList<Campaign>();

    public static void init() {
        Client eti = new Client("ETI HOLDING", "İstanbul/Gebze", "Ahmet Bey");
        Campaign eti20 = new Campaign("ETI 20.YIL", "20/06/2017", "20/08/2017",1500000.00);
        eti.addNewCampaign(eti20);
        Client rbs = new Client("RBS TASARIM", "İstanbul/Mecidiyekoy", "Betül Hanım");
        Campaign rbs10 = new Campaign("RBS 10.YIL", "10/06/2017", "30/08/2017",1100000.00);
        rbs.addNewCampaign(rbs10);
        clientList.add(eti);
        clientList.add(rbs);
    }
}
