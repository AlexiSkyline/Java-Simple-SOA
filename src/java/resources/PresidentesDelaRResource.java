package resources;

import clases.EsquemaXML;
import clases.Transaccion;
import java.io.IOException;
import java.io.OutputStream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path( "presidenteRepublica" )
public class PresidentesDelaRResource 
{
    private Transaccion transaccion = new Transaccion();
    private EsquemaXML xml = new EsquemaXML();
    @GET
    @Path( "lista_xml" )
    @Produces( MediaType.APPLICATION_XML )
    public StreamingOutput getPresidentesRepXML()
    {
        StreamingOutput so = new StreamingOutput()
                            {
                                public void write( OutputStream os ) throws IOException, WebApplicationException
                                {
                                    xml.listPresidenteRep(os);
                                }
                            };
        return( so );
    }
}