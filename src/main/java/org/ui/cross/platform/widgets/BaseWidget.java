package org.ui.cross.platform.widgets;

import org.ui.cross.platform.styling.Style;

public abstract class BaseWidget {
    void getTracking(){};
    void renderHeader(){};
    void renderFooter(){};
    void renderBody(){};
    void renderWidget(){};
    Style setStyles(){
        return new Style();
    };
}
