package org.ui.cross.platform.widgets.widgetfactory;

public abstract class WidgetCreationStrategy {
    private WidgetData widgetData;

    WidgetCreationStrategy(WidgetData widgetData){
        this.widgetData = widgetData;
    }

    public void renderWidget() {

    }
}
