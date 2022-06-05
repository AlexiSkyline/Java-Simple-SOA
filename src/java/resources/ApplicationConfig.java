package resources;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath( "servicios" )
public class ApplicationConfig extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add( PresidenteMuniResource.class );
        resources.add( RegidoresResource.class );
        resources.add( SindicosResource.class );
        resources.add( GobernadoresResource.class );
        resources.add( ElectorResource.class );
        resources.add( PresidentesDelaRResource.class );
        return( resources );
    }
}