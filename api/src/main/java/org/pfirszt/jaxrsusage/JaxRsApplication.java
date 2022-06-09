package org.pfirszt.jaxrsusage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.pfirszt.jaxrsusage.exposure.BookExposure;


@ApplicationPath("/")
public class JaxRsApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>(Arrays.asList(BookExposure.class));

        return classes;
    }

}
