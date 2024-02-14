package org.ui.cross.platform.pages;

import org.ui.cross.platform.store.State;

public interface Page {
    void setContainerStyles();
    void render();
    void getPageData();
    State getUserState();
    void  setUserState();
    void createView();

    void onPageUpdate();

    void onPageLoadComplete();
    void onPageRemoved();
}
