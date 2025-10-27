package org.example.SingleTone;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeDemo")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeBeanDemo {
    public  ProtoTypeBeanDemo(){
        System.out.println("ProtoTypeBeanDemo.ProtoTypeBeanDemo");
    }
}
