package model.Adverts.DigitalAdverts;

import java.time.LocalDate;
import model.Adverts.DigitalAdvert;

public class TvAdvert extends DigitalAdvert{
    public TvAdvert(String advertTitle,
            LocalDate targetCompletionDate,
            double estimatedAdvertCost,
            double actualAdvertCost){
        super(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost);
    }
}
