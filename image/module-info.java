module com.udacity.catpoint.image {
    exports com.udacity.catpoint.image.service to com.udacity.catpoint.security, com.udacity.catpoint.app;
    requires software.amazon.awssdk.auth;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.services.rekognition;
    requires org.slf4j;
    requires transitive java.desktop;
}