package org.ui.cross.platform.widgets.widgetfactory;

public class WidgetFactoryStrategy {
    public static WidgetFactory getFactory(String route) {
        switch (route) {
            case "product":
                return new ProductCardWidgetFactory();
            case "homepage":
                return new HomePageWidgetFactory();
            default:
                throw new IllegalArgumentException("Cannot find factory for the path");
        }
    }
}
