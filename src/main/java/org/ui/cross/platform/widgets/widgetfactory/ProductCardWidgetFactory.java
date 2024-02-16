package org.ui.cross.platform.widgets.widgetfactory;


public class ProductCardWidgetFactory extends WidgetFactory {
    public static WidgetCreationStrategy createStrategy(WidgetData widgetData) {
        System.out.println(widgetData.type);
        switch (widgetData.viewType) {
            case "LIST_VIEW":
                return new ListViewStrategy(widgetData);
            case "CARD_VIEW":
                return new CardViewStrategy(widgetData);
            default:
                throw new IllegalArgumentException("Invalid payment method: " + widgetData.viewType);
        }
    }
}

// -> ProductPageFactory -> ProductPageMapper
// -> ProductCardStrategy -> ProductCardGenerator
// -> Each Strategy class is a BaseWidget Child
// -> Each Page is a MultiWidgetPage which consists of a