package org.ui.cross.platform.widgets.widgetfactory;

public class ListViewStrategy extends WidgetCreationStrategy {
    private WidgetData widgetData;

    ListViewStrategy(WidgetData widgetData) {
        super(widgetData);
        this.widgetData = widgetData;
    }

    @Override
    public void renderWidget() {
        System.out.println(this.widgetData.viewType);
    }
}
