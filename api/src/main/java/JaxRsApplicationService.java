
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import exposures.BookExposure;

@ApplicationPath("/")
public class JaxRsApplicationService extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>(Arrays.asList(BookExposure.class));

        return classes;
    }

}
