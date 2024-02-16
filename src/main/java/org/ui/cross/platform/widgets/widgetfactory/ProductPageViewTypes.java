package org.ui.cross.platform.widgets.widgetfactory;

public enum ProductPageViewTypes {

    LIST_VIEW ("LIST_VIEW"),
    CARD_VIEW("CARD_VIEW");

    private String value;
    ProductPageViewTypes(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}