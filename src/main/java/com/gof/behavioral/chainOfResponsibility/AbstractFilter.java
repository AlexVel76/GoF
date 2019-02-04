package com.gof.behavioral.chainOfResponsibility;

public abstract class AbstractFilter {

    private String filterRule;
    private AbstractFilter next;

    public AbstractFilter(String filterRule) {
        this.filterRule = filterRule;
    }

    public AbstractFilter() {
    }

    protected String doFilter(String data)
    {
        String result = applyFilter(data);
        if (next != null)
            result = next.doFilter(result);

        return result;
    }

    public abstract String applyFilter(String data);

    public void setNextFilter(AbstractFilter next) {
        if (this.next == null)
            this.next = next;
        else
            this.next.setNextFilter(next);
    }
}
