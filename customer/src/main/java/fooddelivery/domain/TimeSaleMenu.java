package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class TimeSaleMenu extends AbstractEvent {

    private Long id;
    private String foodid;
    private Long orderid;
}


