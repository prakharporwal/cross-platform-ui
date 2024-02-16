package org.ui.cross.platform;

import org.ui.cross.platform.widgets.Widget;
import org.ui.cross.platform.widgets.widgetfactory.ProductCardWidgetFactory;
import org.ui.cross.platform.widgets.widgetfactory.WidgetCreationStrategy;
import org.ui.cross.platform.widgets.widgetfactory.WidgetData;

public class Main {
    public static void main(String[] args) {
        render();
    }

    public static void render(){
        WidgetData widgetData = new WidgetData("ProductCard", "LIST_VIEW");
        WidgetCreationStrategy wcs = ProductCardWidgetFactory.createStrategy(widgetData);
        wcs.renderWidget();
    }
}