package org.example.SingleTone;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonBean")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Singletone {
    public Singletone(){
        System.out.println("Singletone.Singletone()");
    }
}
