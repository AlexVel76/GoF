package com.test.gof.creational.abstract_factory.pay_for_site_factory;

import com.test.gof.creational.abstract_factory.PayFactory;
import com.test.gof.creational.abstract_factory.pay_product.CTCCreditCardServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.CTCPayPalServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.test.gof.creational.abstract_factory.pay_product.PayPalService;

public class CTCPaySystemFactory extends PayFactory {

    @Override
    public CreditCardService getCreditCardService() {
        return new CTCCreditCardServiceImpl();
    }

    @Override
    public PayPalService getPayPalService() {
        return new CTCPayPalServiceImpl();
    }
}
