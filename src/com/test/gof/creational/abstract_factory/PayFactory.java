package com.test.gof.creational.abstract_factory;

import com.test.gof.creational.abstract_factory.pay_for_site_factory.CTCPaySystemFactory;
import com.test.gof.creational.abstract_factory.pay_for_site_factory.MarksPaySystemFactory;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.test.gof.creational.abstract_factory.pay_product.PayPalService;

public abstract class PayFactory {
    private static PayFactory cTCPayFactory = null;
    private static PayFactory marksPayFactory = null;

    public abstract CreditCardService getCreditCardService();
    public abstract PayPalService getPayPalService();

    public static PayFactory getFactory(final String site) {
        PayFactory result = null;

        switch (site) {
            case "ctc":
                if (cTCPayFactory == null) {
                    cTCPayFactory = new CTCPaySystemFactory();
                    result = cTCPayFactory;
                }
                break;
            case "marks":
                if (marksPayFactory == null) {
                    marksPayFactory = new MarksPaySystemFactory();
                    result = marksPayFactory;
                }
                break;
            default:
                throw new UnknownError();
        }

        return result;
    }
}
