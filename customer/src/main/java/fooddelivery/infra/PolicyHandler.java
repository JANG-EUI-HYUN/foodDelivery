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
    @Autowired NotificationLogRepository notificationLogRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_KakaoAlarm(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener KakaoAlarm : " + accepted + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_KakaoAlarm(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener KakaoAlarm : " + rejected + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cooked'")
    public void wheneverCooked_KakaoAlarm(@Payload Cooked cooked){

        Cooked event = cooked;
        System.out.println("\n\n##### listener KakaoAlarm : " + cooked + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_KakaoAlarm(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener KakaoAlarm : " + paid + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_KakaoAlarm(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener KakaoAlarm : " + orderPlaced + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_KakaoAlarm(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener KakaoAlarm : " + deliveryStarted + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Coupon'")
    public void wheneverCoupon_KakaoAlarm(@Payload Coupon coupon){

        Coupon event = coupon;
        System.out.println("\n\n##### listener KakaoAlarm : " + coupon + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='TimeSaleMenu'")
    public void wheneverTimeSaleMenu_KakaoAlarm(@Payload TimeSaleMenu timeSaleMenu){

        TimeSaleMenu event = timeSaleMenu;
        System.out.println("\n\n##### listener KakaoAlarm : " + timeSaleMenu + "\n\n");


        

        // Sample Logic //
        NotificationLog.kakaoAlarm(event);
        

        

    }

}


