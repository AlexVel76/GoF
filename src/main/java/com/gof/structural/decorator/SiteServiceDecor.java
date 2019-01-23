package com.gof.structural.decorator;

public class SiteServiceDecor implements Service {
    private Service service;

    public SiteServiceDecor(Service service) {
        this.service = service;
    }

    @Override
    public void activate() {
        service.activate();
    }
}
