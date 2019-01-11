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

//site two works with only pay pal system
public class SiteTwoFacade {

    public String charge() {
        String result;

        PayFactory payFactory = PayFactory.getFactory(SiteType.SITE2);
        payFactory.getCreditCardService().getConnectionToPayServer();
        result = payFactory.getPayPalService().charge();

        return result;
    }

    public AbstractOrder getOrder(final String user) {
        OrderBuildDirector orderBuildDirector = new OrderBuildDirector(new CartBuilderImpl());

        List<String> entities = new ArrayList<>();
        entities.add("prod1");
        entities.add("prod2");
        AbstractOrder abstractOrder = orderBuildDirector.construct(entities, user, new PayPalPayment());

        return abstractOrder;
    }

    public String payPayPal(){
        return new PaymentServiceAdapter().payPayPal();
    }

}
