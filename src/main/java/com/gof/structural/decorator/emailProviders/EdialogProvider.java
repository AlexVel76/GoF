package com.gof.structural.decorator.emailProviders;

import com.gof.structural.decorator.Service;
import com.gof.structural.decorator.SiteServiceDecor;

public class EdialogProvider extends SiteServiceDecor {

    public EdialogProvider(Service service) {
        super(service);
    }

    @Override
    public void activate() {
        super.activate();
        System.out.print("- Add Edialog Provider");
    }
}