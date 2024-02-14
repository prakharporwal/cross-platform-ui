package org.ui.cross.platform.database.models;

public interface DbDriver {
    void connect();
    DbDriver getConnection();

    void Query();
}
