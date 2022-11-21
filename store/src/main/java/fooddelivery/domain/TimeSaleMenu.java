package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class TimeSaleMenu extends AbstractEvent {

    private Long id;
    private String foodid;
    private Long orderid;

    public TimeSaleMenu(StoreOrder aggregate){
        super(aggregate);
    }
    public TimeSaleMenu(){
        super();
    }
}
