package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Coupon extends AbstractEvent {

    private Long id;
    private String foodid;
    private Long orderid;

    public Coupon(StoreOrder aggregate){
        super(aggregate);
    }
    public Coupon(){
        super();
    }
}
