package clases;

import enums.EndPoint;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.ws.rs.WebApplicationException;

public class EsquemaXML 
{
    private Transaccion transaccion = new Transaccion();
    public void listaPresidenteM( OutputStream os ) throws IOException, WebApplicationException
    {
        Object[][] presidentesMunicipales = transaccion.getContenido( EndPoint.PRESIDENTEMUNICIPAL );
        PrintStream writer = new PrintStream( os );
        String[] nodos = {
                            "nombre",
                            "idpuesto",
                            "idprovincia",
                            "idmunicipio"
                         };
        if( !( presidentesMunicipales == null ) )
        {
            writer.print( "<precidentesMunicipales>" );
            for( int i = 0; i < presidentesMunicipales.length; i++ )
            {
                writer.print( "<presidenteMunicipal id=\"" + presidentesMunicipales[i][0].toString() + "\">" );
                for( int j = 1; j < presidentesMunicipales[i].length; j++ )
                {
                    writer.println( "<" + nodos[ j - 1 ] + ">" + presidentesMunicipales[i][j].toString() + "</" + nodos[ j - 1 ] + ">" );
                }
                writer.println( "</presidenteMunicipal>" ); 
            }
            writer.println( "</precidentesMunicipales>" );
        }
        else
        {
            writer.print( "<error id=\"99\">" );
            writer.print( "<message>Empty list....</message>");
            writer.print( "</error>" );
        }
    }
    
    
    public void listRegidores( OutputStream os ) throws IOException, WebApplicationException
    {
        Object[][] condidato = transaccion.getContenido( EndPoint.REGIDORES );
        PrintStream writer = new PrintStream( os );
        String[] nodos = {
                            "nombre",
                            "idpuesto",
                            "idprovincia",
                            "idmunicipio"
                         };
        if( !( condidato == null ) )
        {
            writer.print( "<regidores>" );
            for( int i = 0; i < condidato.length; i++ )
            {
                writer.print( "<regidor id=\"" + condidato[i][0].toString() + "\">" );
                for( int j = 1; j < condidato[i].length; j++ )
                {
                    writer.println( "<" + nodos[ j - 1 ] + ">" + condidato[i][j].toString() + "</" + nodos[ j - 1 ] + ">" );
                }
                writer.println( "</regidor>" ); 
            }
            writer.println( "</regidores>" );
        }
        else
        {
            writer.print( "<error id=\"99\">" );
            writer.print( "<message>Empty list....</message>");
            writer.print( "</error>" );
        }
    }
    
    
    public void listSindicos( OutputStream os ) throws IOException, WebApplicationException
    {
        Object[][] condidatos = transaccion.getContenido( EndPoint.SINDICOS );
        PrintStream writer = new PrintStream( os );
        String[] nodos = {
                            "nombre",
                            "idpuesto",
                            "idprovincia",
                            "idmunicipio"
                         };
        if( !( condidatos == null ) )
        {
            writer.print( "<sindicos>" );
            for( int i = 0; i < condidatos.length; i++ )
            {
                writer.print( "<sindico id=\"" + condidatos[i][0].toString() + "\">" );
                for( int j = 1; j < condidatos[i].length; j++ )
                {
                    writer.println( "<" + nodos[ j - 1 ] + ">" + condidatos[i][j].toString() + "</" + nodos[ j - 1 ] + ">" );
                }
                writer.println( "</sindico>" ); 
            }
            writer.println( "</sindicos>" );
        }
        else
        {
            writer.print( "<error id=\"99\">" );
            writer.print( "<message>Empty list....</message>");
            writer.print( "</error>" );
        }
    }
    
    public void listGobernadores( OutputStream os ) throws IOException, WebApplicationException
    {
        Object[][] condidatos = transaccion.getContenido( EndPoint.GOBERNADORES );
        PrintStream writer = new PrintStream( os );
        String[] nodos = {
                            "nombre",
                            "idpuesto",
                            "idprovincia",
                            "idmunicipio"
                         };
        if( !( condidatos == null ) )
        {
            writer.print( "<gobernadores>" );
            for( int i = 0; i < condidatos.length; i++ )
            {
                writer.print( "<gobernador id=\"" + condidatos[i][0].toString() + "\">" );
                for( int j = 1; j < condidatos[i].length; j++ )
                {
                    writer.println( "<" + nodos[ j - 1 ] + ">" + condidatos[i][j].toString() + "</" + nodos[ j - 1 ] + ">" );
                }
                writer.println( "</gobernador>" ); 
            }
            writer.println( "</gobernadores>" );
        }
        else
        {
            writer.print( "<error id=\"99\">" );
            writer.print( "<message>Empty list....</message>");
            writer.print( "</error>" );
        }
    }
    
     public void listPresidenteRep( OutputStream os ) throws IOException, WebApplicationException
    {
        Object[][] condidatos = transaccion.getContenido( EndPoint.PRESIDENTEDELAREP );
        PrintStream writer = new PrintStream( os );
        String[] nodos = {
                            "nombre",
                            "idpuesto",
                            "idprovincia",
                            "idmunicipio"
                         };
        if( !( condidatos == null ) )
        {
            writer.print( "<presidentes>" );
            for( int i = 0; i < condidatos.length; i++ )
            {
                writer.print( "<presidente id=\"" + condidatos[i][0].toString() + "\">" );
                for( int j = 1; j < condidatos[i].length; j++ )
                {
                    writer.println( "<" + nodos[ j - 1 ] + ">" + condidatos[i][j].toString() + "</" + nodos[ j - 1 ] + ">" );
                }
                writer.println( "</presidente>" ); 
            }
            writer.println( "</presidentes>" );
        }
        else
        {
            writer.print( "<error id=\"99\">" );
            writer.print( "<message>Empty list....</message>");
            writer.print( "</error>" );
        }
    }
}
