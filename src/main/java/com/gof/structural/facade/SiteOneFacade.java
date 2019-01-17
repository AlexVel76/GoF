package com.gof.structural.facade;

import java.util.ArrayList;
import java.util.List;

import com.gof.PaymentType;
import com.gof.creational.SiteType;
import com.gof.creational.abstract_factory.PayFactory;
import com.gof.creational.builder.CartBuilderImpl;
import com.gof.creational.builder.OrderBuildDirector;
import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.PayPalPayment;
import com.gof.creational.common.PaymentSystem;
import com.gof.structural.adapter.PaymentServiceAdapter;

//site one works with both pay system credit card and paypal
public class SiteOneFacade {

    public String charge(PaymentType paymentType) {
        String result;

        PayFactory payFactory = PayFactory.getFactory(SiteType.SITE1);
        payFactory.getCreditCardService().getConnectionToPayServer();
        result = (paymentType == PaymentType.CREDITCARD) ? payFactory.getCreditCardService().charge()
                :  payFactory.getPayPalService().charge();

        return result;
    }

    public AbstractOrder getOrder(final String user, PaymentSystem paymentSystem) {
        OrderBuildDirector orderBuildDirector = new OrderBuildDirector(new CartBuilderImpl());

        List<String> entities = new ArrayList<>();
        entities.add("prod1");
        entities.add("prod2");
        AbstractOrder abstractOrder = orderBuildDirector.construct(entities, user, paymentSystem);

        return abstractOrder;
    }

    public String payCreditCard(){
        return new PaymentServiceAdapter().payCreditCard();
    }

    public String payPayPal(){
        return new PaymentServiceAdapter().payPayPal();
    }

}
