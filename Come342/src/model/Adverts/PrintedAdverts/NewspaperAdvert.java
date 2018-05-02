package model.Adverts.PrintedAdverts;

import java.time.LocalDate;
import model.Adverts.PrintedAdvert;

public class NewspaperAdvert extends PrintedAdvert{
    public NewspaperAdvert(String advertTitle,
            LocalDate targetCompletionDate,
            double estimatedAdvertCost,
            double actualAdvertCost){
        super(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost);
    }
}