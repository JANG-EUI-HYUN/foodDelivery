package fooddelivery.domain;

import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Menu_table")
@Data

public class Menu  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){
    }

    public static MenuRepository repository(){
        MenuRepository menuRepository = StoreApplication.applicationContext.getBean(MenuRepository.class);
        return menuRepository;
    }






}
