package model.Adverts.DigitalAdverts;

import java.time.LocalDate;
import model.Adverts.DigitalAdvert;

public class RadioAdvert extends DigitalAdvert{
    public RadioAdvert(String advertTitle,
            LocalDate targetCompletionDate,
            double estimatedAdvertCost,
            double actualAdvertCost){
        super(advertTitle,targetCompletionDate,estimatedAdvertCost,actualAdvertCost);
    }
}