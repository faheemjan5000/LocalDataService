
package introsde.project.adopter.recombee.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecombeeInterface", targetNamespace = "http://soap.recombee.adopter.project.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RecombeeInterface {


    /**
     * 
     * @param clientId
     * @param userId
     * @return
     *     returns introsde.project.adopter.recombee.soap.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetUserResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getUserRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getUserResponse")
    public User getUser(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

    /**
     * 
     * @param itemType
     * @param clientId
     * @param userId
     * @return
     *     returns introsde.project.adopter.recombee.soap.Item
     */
    @WebMethod
    @WebResult(name = "item", targetNamespace = "")
    @RequestWrapper(localName = "additem", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.Additem")
    @ResponseWrapper(localName = "additemResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AdditemResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/additemRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/additemResponse")
    public Item additem(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "itemType", targetNamespace = "")
        String itemType);

    /**
     * 
     * @param itemId
     * @param clientId
     * @param rating
     * @param time
     * @param userId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "addRating", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddRating")
    @ResponseWrapper(localName = "addRatingResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddRatingResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addRatingRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addRatingResponse")
    public int addRating(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "itemId", targetNamespace = "")
        String itemId,
        @WebParam(name = "rating", targetNamespace = "")
        double rating,
        @WebParam(name = "time", targetNamespace = "")
        XMLGregorianCalendar time);

    /**
     * 
     * @param itemId
     * @param clientId
     * @param rating
     * @param time
     * @param userId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "modifyRating", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.ModifyRating")
    @ResponseWrapper(localName = "modifyRatingResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.ModifyRatingResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/modifyRatingRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/modifyRatingResponse")
    public int modifyRating(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "itemId", targetNamespace = "")
        String itemId,
        @WebParam(name = "rating", targetNamespace = "")
        double rating,
        @WebParam(name = "time", targetNamespace = "")
        XMLGregorianCalendar time);

    /**
     * 
     * @param itemId
     * @param clientId
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.Evaluation>
     */
    @WebMethod
    @WebResult(name = "ratingList", targetNamespace = "")
    @RequestWrapper(localName = "getItemRating", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemRating")
    @ResponseWrapper(localName = "getItemRatingResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemRatingResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemRatingRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemRatingResponse")
    public List<Evaluation> getItemRating(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "itemId", targetNamespace = "")
        String itemId);

    /**
     * 
     * @param clientId
     * @param userId
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.Evaluation>
     */
    @WebMethod
    @WebResult(name = "ratingList", targetNamespace = "")
    @RequestWrapper(localName = "getUserRating", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetUserRating")
    @ResponseWrapper(localName = "getUserRatingResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetUserRatingResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getUserRatingRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getUserRatingResponse")
    public List<Evaluation> getUserRating(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

    /**
     * 
     * @param clientId
     * @param quantity
     * @param userId
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "recommendations", targetNamespace = "")
    @RequestWrapper(localName = "getRec4User", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetRec4User")
    @ResponseWrapper(localName = "getRec4UserResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetRec4UserResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getRec4UserRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getRec4UserResponse")
    public List<String> getRec4User(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity);

    /**
     * 
     * @param password
     * @param clientId
     * @return
     *     returns introsde.project.adopter.recombee.soap.RecombeeClient
     */
    @WebMethod
    @WebResult(name = "clientId", targetNamespace = "")
    @RequestWrapper(localName = "setRecombeeClient", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.SetRecombeeClient")
    @ResponseWrapper(localName = "setRecombeeClientResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.SetRecombeeClientResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/setRecombeeClientRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/setRecombeeClientResponse")
    public RecombeeClient setRecombeeClient(
        @WebParam(name = "clientId", targetNamespace = "")
        String clientId,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param itemId
     * @param clientId
     * @return
     *     returns introsde.project.adopter.recombee.soap.Item
     */
    @WebMethod
    @WebResult(name = "item", targetNamespace = "")
    @RequestWrapper(localName = "getitem", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.Getitem")
    @ResponseWrapper(localName = "getitemResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetitemResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getitemRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getitemResponse")
    public Item getitem(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "itemId", targetNamespace = "")
        String itemId);

    /**
     * 
     * @param clientId
     * @param preitem
     * @param userId
     * @return
     *     returns introsde.project.adopter.recombee.soap.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddUserResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addUserRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addUserResponse")
    public User addUser(
        @WebParam(name = "clientId", targetNamespace = "")
        RecombeeClient clientId,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "preitem", targetNamespace = "")
        List<String> preitem);

}
