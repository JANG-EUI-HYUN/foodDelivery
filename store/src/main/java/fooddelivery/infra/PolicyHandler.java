package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired StoreOrderRepository storeOrderRepository;
    @Autowired MenuRepository menuRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_AddOrderList(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener AddOrderList : " + paid + "\n\n");


        

        // Sample Logic //
        StoreOrder.addOrderList(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_OrderCancelAlarm(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener OrderCancelAlarm : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        StoreOrder.orderCancelAlarm(event);
        

        

    }

}


