package org.ui.cross.platform.widgets.widgetfactory;

public class WidgetData {
    String type;
    String viewType;
    RenderableComponent value;
    public WidgetData(String type, String viewType){
        this.type = type;
        this.viewType = viewType;
    }
}
