package com.gof.structural.decorator;

import org.junit.jupiter.api.Test;

import com.gof.structural.decorator.emailProviders.EdialogProvider;
import com.gof.structural.decorator.emailProviders.GoogleMail;
import com.gof.structural.decorator.paymentSystem.AliPayPaymentServiceImpl;
import com.gof.structural.decorator.paymentSystem.PayPalPaymentServiceImpl;
import com.gof.structural.decorator.site.SiteOneService;

class DecoratorTest {

    @Test
    public void test() {
        Service siteOneService = new GoogleMail(
                new AliPayPaymentServiceImpl(
                        new PayPalPaymentServiceImpl(
                                new SiteOneService())));

        Service siteOneService2 = new GoogleMail(
                new EdialogProvider(
                        new AliPayPaymentServiceImpl(
                                new SiteOneService())));

        siteOneService.activate();
        siteOneService2.activate();
    }
}