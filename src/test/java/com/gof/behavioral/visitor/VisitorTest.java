package com.gof.behavioral.visitor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.gof.behavioral.chainOfResponsibility.FilterLowCaseAlphabet;
import com.gof.behavioral.chainOfResponsibility.FilterNumeric;
import com.gof.behavioral.chainOfResponsibility.FilterSimbols;

class VisitorTest {

    @Test
    void test() {
        List<Visitable> order = new ArrayList<>();

        order.add(new FoodItem(20));
        order.add(new FoodItem(50));
        order.add(new VineItem(10));

        DiscountVisitor discountVisitor =  new DiscountVisitor();

        for (Visitable visitable : order) {
            visitable.apply(discountVisitor);
        }

        assertEquals(discountVisitor.getTotalDiscount(), 15d);
    }
}