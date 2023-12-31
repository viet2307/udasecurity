module com.udacity.catpoint.security {
    requires transitive com.udacity.catpoint.image;
    requires transitive java.desktop;
    requires com.google.gson;
    requires java.prefs;
    requires com.google.common;
    exports com.udacity.catpoint.security.service to com.udacity.catpoint.app;
    exports com.udacity.catpoint.security.data to com.udacity.catpoint.app;
    exports com.udacity.catpoint.security.application to com.udacity.catpoint.app;

    opens com.udacity.catpoint.security.service;
}