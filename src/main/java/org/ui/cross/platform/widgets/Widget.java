package org.ui.cross.platform.widgets;

import org.ui.cross.platform.widgets.widgetfactory.WidgetData;

public class Widget {
    private String name;
    private WidgetData data;

    public Widget(String name, WidgetData data) {
        this.name = name;
        this.data = data;
    }

    public WidgetData getData() {
        return data;
    }

    public void render() {
        System.out.println(this.name);
    }
}
