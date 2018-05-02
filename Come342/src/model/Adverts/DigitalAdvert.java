package model.Adverts;

import java.time.LocalDate;
import model.Advert;

abstract public class DigitalAdvert extends Advert{
    public DigitalAdvert(String advertTitle,
            LocalDate targetCompletionDate,
            double estimatedAdvertCost,
            double actualAdvertCost){
        super.setAdvertTitle(advertTitle);
        super.setTargetCompletionDate(targetCompletionDate);
        super.setEstimatedAdvertCost(actualAdvertCost);
        super.setActualAdvertCost(actualAdvertCost);
    }
}
