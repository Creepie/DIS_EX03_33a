package eberth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

/**
 * @author Mario Eberth
 * this class provides a simple form of an Rest API
 */
@Path("/HelloWorld")
public class HelloWorld extends Application {

    /**
     * this method is to get a html formed response
     * @return a html formed output
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getDataHTML(){
        return "<html>" +
                "<head></head>" +
                "<body>Hello World (HTML text)!!!</body>" +
                "</html>";
    }

    /**
     * this method is to get a plain Text formed response
     * @return a plain text response
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getDataPlain(){
        return "Hello World (plain text)";
    }

    /**
     * this method is to get a xml text formed response
     * @return a xml text response
     */
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    public String getDataXML(){
        return "<HelloWorld>Hello World (XML text)!!!</HelloWorld>";
    }

    /**
     * this method is to get a json text formed response
     * @return a json response
     */
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDataJSON(){
        return "{\"val\":\"HelloWorld\"}";
    }
}
