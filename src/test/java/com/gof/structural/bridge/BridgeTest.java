package com.gof.structural.bridge;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.gof.creational.common.Order;
import com.gof.structural.bridge.paymentSystem.AliPayPaymentServiceImpl;
import com.gof.structural.bridge.paymentSystem.CreditCardPaymentServiceImpl;
import com.gof.structural.bridge.paymentSystem.PayPalPaymentServiceImpl;

public class BridgeTest {

    @Test
    void bridgeTest() {
        AbstractSiteService siteOneAliPay = new SiteOneService(new AliPayPaymentServiceImpl());
        AbstractSiteService siteOneCreditCard = new SiteOneService(new CreditCardPaymentServiceImpl());
        AbstractSiteService siteOnePayPal = new SiteOneService(new PayPalPaymentServiceImpl());

        AbstractSiteService siteTwoAliPay = new SiteTwoService(new AliPayPaymentServiceImpl());
        AbstractSiteService siteTwoPayPal = new SiteTwoService(new PayPalPaymentServiceImpl());


        List<AbstractSiteService> sites = new ArrayList<>();
        sites.add(siteOneAliPay);
        sites.add(siteOneCreditCard);
        sites.add(siteOnePayPal);
        sites.add(siteTwoAliPay);
        sites.add(siteTwoPayPal);

        for (AbstractSiteService site : sites) {
            site.pay(new Order());
        }
    }
}
