package de.schneidexe.mvcjson;

import java.util.Locale;

public class DemoObject {

    private String demoString;
    private Long demoLong;
    private Double demoDouble;
    private Locale demoLocale;
    private DemoObject nestedDemoObject;

    public String getDemoString() {
        return demoString;
    }

    public void setDemoString(String demoString) {
        this.demoString = demoString;
    }

    public Long getDemoLong() {
        return demoLong;
    }

    public void setDemoLong(Long demoLong) {
        this.demoLong = demoLong;
    }

    public Double getDemoDouble() {
        return demoDouble;
    }

    public void setDemoDouble(Double demoDouble) {
        this.demoDouble = demoDouble;
    }

    public Locale getDemoLocale() {
        return demoLocale;
    }

    public void setDemoLocale(Locale demoLocale) {
        this.demoLocale = demoLocale;
    }

    public DemoObject getNestedDemoObject() {
        return nestedDemoObject;
    }

    public void setNestedDemoObject(DemoObject nestedDemoObject) {
        this.nestedDemoObject = nestedDemoObject;
    }
}
