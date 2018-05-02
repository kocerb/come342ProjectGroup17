package model.Adverts.PrintedAdverts;

import java.time.LocalDate;
import model.Adverts.PrintedAdvert;

public class LeafletAdvert extends PrintedAdvert{
    public LeafletAdvert(String advertTitle,
            LocalDate targetCompletionDate,
            double estimatedAdvertCost,
            double actualAdvertCost){
        super(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost);
    }
}
