package fr.utbm.dao.exception;

import java.util.Locale;
import javax.annotation.Resource;
import org.springframework.context.MessageSource;


public class BuildingInUseException extends Exception {

        @Resource
    private MessageSource messageSource;
        
    private Integer id;
    private String name;
    
    public BuildingInUseException(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getMessage(Locale l) {
        return messageSource.getMessage("BuildingInUseException", new Object[] {id, name}, l);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
