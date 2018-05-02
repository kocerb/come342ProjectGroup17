package come342;

import model.Staffs.AdminStaff;
import model.Staffs.CreativeStaff;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import model.*;

public class Database {
    public static List<Client> clientList = new ArrayList<Client>();
    public static List<Campaign> campaignList = new ArrayList<Campaign>();    
    public static List<StaffMember> staffList = new ArrayList<StaffMember>();    
    public static List<Grade> gradeList = new ArrayList<Grade>();

    public static void init() {
        Client eti = new Client("ETI HOLDING", "İstanbul/Gebze", "info@eti.com", "Ahmet Bey", "ahmet_bey@yonja.com");
        Campaign eti20 = new Campaign("ETI 20.YIL", LocalDate.of(2018, 3, 20), LocalDate.of(2018, 8, 20), 1500000.00);
        eti.addNewCampaign(eti20);
        Client rbs = new Client("RBS TASARIM", "İstanbul/Mecidiyekoy", "information@rbetuls.com", "Betul Karatay", "betul_karatay@rbs.com");
        Campaign rbs10 = new Campaign("RBS 10.YIL", LocalDate.of(2018, 3, 10), LocalDate.of(2018, 5, 20), 1100000.00);
        rbs.addNewCampaign(rbs10);
        clientList.add(eti);
        clientList.add(rbs);
        
        GradeRate rate1 = new GradeRate(2500.0, LocalDate.of(2018, 1, 1));
        Grade grade1 = new Grade("Kademe 1");
        grade1.setRate(rate1);
        gradeList.add(grade1);
        
        GradeRate rate2 = new GradeRate(3500.0, LocalDate.of(2018, 1, 1));
        Grade grade2 = new Grade("Kademe 2");
        grade2.setRate(rate2);
        gradeList.add(grade2);
        
        GradeRate rate3 = new GradeRate(5000.0, LocalDate.of(2018, 1, 1));
        Grade grade3 = new Grade("Kademe 3");
        grade3.setRate(rate3);
        gradeList.add(grade3);
        
        AdminStaff aStaff1 = new AdminStaff(511, "Haydar Haydar", LocalDate.of(2017, 2, 16), "haydar@agate.com");
        StaffGrade asGrade1 = new StaffGrade(grade3, LocalDate.of(2018, 1, 1));
        aStaff1.setStaffGrade(asGrade1);
        staffList.add(aStaff1);
        
        CreativeStaff cStaff1 = new CreativeStaff(120, "Engin Deniz", LocalDate.of(2018, 1, 7), "engin@agate.com");
        StaffGrade csGrade1 = new StaffGrade(grade1, LocalDate.of(2018, 1, 7));
        cStaff1.setStaffGrade(csGrade1);
        staffList.add(cStaff1);
        
        AdminStaff aStaff2 = new AdminStaff(512, "Seda Sayaç", LocalDate.of(2016, 10, 25), "seda@agate.com");
        StaffGrade asGrade2 = new StaffGrade(grade3, LocalDate.of(2017, 2, 25));
        aStaff2.setStaffGrade(asGrade2);
        staffList.add(aStaff2);
        
        CreativeStaff cStaff2 = new CreativeStaff(121, "Bilal Mersedes", LocalDate.of(2017, 11, 10), "bilal@agate.com");
        StaffGrade csGrade2 = new StaffGrade(grade1, LocalDate.of(2017, 11, 10));
        cStaff2.setStaffGrade(csGrade2);
        staffList.add(cStaff2);
        
        CreativeStaff cStaff3 = new CreativeStaff(122, "Sevinc Erbil", LocalDate.of(2017, 3, 5), "sevinc@agate.com");
        StaffGrade csGrade3 = new StaffGrade(grade2, LocalDate.of(2018, 1, 1));
        cStaff3.setStaffGrade(csGrade3);     
        staffList.add(cStaff3);
        
        CreativeStaff cStaff4 = new CreativeStaff(123, "Canan Karatay", LocalDate.of(2018, 2, 1), "karatay_diyeti@agate.com");
        StaffGrade csGrade4 = new StaffGrade(grade1, LocalDate.of(2018, 2, 1));
        cStaff4.setStaffGrade(csGrade4);
        staffList.add(cStaff4);
        

    }
}
