package org.ui.cross.platform.widgets.widgetfactory;

public class HomePageWidgetFactory extends WidgetFactory {
    @Override
    public WidgetCreationStrategy createStrategy(WidgetData widgetData) {
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
