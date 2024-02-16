package org.ui.cross.platform.widgets.widgetfactory;

public class CardViewStrategy extends WidgetCreationStrategy{
    private WidgetData widgetData;
    CardViewStrategy(WidgetData widgetData) {
        super(widgetData);
        this.widgetData = widgetData;
    }
    @Override
    public void renderWidget(){
        System.out.println(this.widgetData.type);
    }
}