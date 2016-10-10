package com.app;

import com.app.controllers.HelloWorldController;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * A Basic Spring Application
 *
 * @author Ulhas Pai
 */
@ApplicationPath("service")
public class SeedApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new java.util.HashSet<>();
        // following code can be used to customize Jersey 2.0 JSON provider:
        try {
            final Class jsonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
            // Class jsonProvider = Class.forName("org.glassfish.jersey.moxy.json.MoxyJsonFeature");
            // Class jsonProvider = Class.forName("org.glassfish.jersey.jettison.JettisonFeature");
            resources.add(jsonProvider);
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName())
                                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Add your own resources here.
     */
    private void addRestResourceClasses(final Set<Class<?>> resources) {
        resources.add(HelloWorldController.class);
    }

}
