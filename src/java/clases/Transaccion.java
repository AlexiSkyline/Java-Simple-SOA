package clases;

import enums.DBType;
import enums.EndPoint;

public class Transaccion 
{
    int provincia=1, municipio=1;
    private DBConnection connection = new DBConnection( DBType.MySQL, "localhost", "electoral", "root", "root" );
    public Object[][] getContenido( EndPoint endPoint )
    {
        Object[][] contenido = null;
        String query = "";
        if( endPoint == EndPoint.PRESIDENTEMUNICIPAL )
        {
            query = "select * from vw_presidentemun where idprovincia = " + provincia + " and idmunicipio = " + municipio +";";
        }
        else if( endPoint == EndPoint.REGIDORES )
        {
            query = "select * from vw_regidores where idprovincia = " + provincia + " and idmunicipio = " + municipio +";";
        }
        else if( endPoint == EndPoint.SINDICOS )
        {
            query = "select * from vw_sindicos where idprovincia = " + provincia + " and idmunicipio = " + municipio +";";
        }
        else if( endPoint == EndPoint.GOBERNADORES )
        {
            query = "select * from vw_gobernadores where idprovincia = " + provincia + " and idmunicipio = " + municipio +";";
        }
        else if( endPoint == EndPoint.PRESIDENTEDELAREP )
        {
            query = "select * from vw_presidenterep where idprovincia = " + provincia + " and idmunicipio = " + municipio +";";
        }
        else if( endPoint == EndPoint.ELECTOR )
        {
            query = "select * from elector;";
        }
        
        connection.open();
        contenido = connection.RowListToMatrix( query );
        connection.close();
        return( contenido );
    }
}
