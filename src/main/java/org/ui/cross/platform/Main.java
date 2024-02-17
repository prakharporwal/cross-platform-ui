package org.ui.cross.platform;

import org.ui.cross.platform.widgets.Widget;
import org.ui.cross.platform.widgets.widgetfactory.*;

public class Main {
    public static void main(String[] args) {
        render();
    }

    public static void render() {
        String requestRoute = "homepage";
        WidgetData data = new WidgetData("HomeCarouse", "LIST_VIEW");
        Widget homePageWidget = new Widget("homepage", data);

        System.out.println(requestRoute);
        WidgetData widgetData = new WidgetData(homePageWidget.getData().getType(), homePageWidget.getData().getViewType());
        WidgetCreationStrategy wcs = WidgetFactoryStrategy.getFactory(requestRoute).createStrategy(widgetData);
        wcs.renderWidget();
    }
}