
package userserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the userserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OnLoginResponse_QNAME = new QName("http://UserServer/", "onLoginResponse");
    private final static QName _OnLogin_QNAME = new QName("http://UserServer/", "onLogin");
    private final static QName _HelloResponse_QNAME = new QName("http://UserServer/", "helloResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://UserServer/", "registerResponse");
    private final static QName _CheckPassword_QNAME = new QName("http://UserServer/", "checkPassword");
    private final static QName _Hello_QNAME = new QName("http://UserServer/", "hello");
    private final static QName _CheckPasswordResponse_QNAME = new QName("http://UserServer/", "checkPasswordResponse");
    private final static QName _Register_QNAME = new QName("http://UserServer/", "register");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: userserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OnLogin }
     * 
     */
    public OnLogin createOnLogin() {
        return new OnLogin();
    }

    /**
     * Create an instance of {@link OnLoginResponse }
     * 
     */
    public OnLoginResponse createOnLoginResponse() {
        return new OnLoginResponse();
    }

    /**
     * Create an instance of {@link CheckPassword }
     * 
     */
    public CheckPassword createCheckPassword() {
        return new CheckPassword();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link CheckPasswordResponse }
     * 
     */
    public CheckPasswordResponse createCheckPasswordResponse() {
        return new CheckPasswordResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "onLoginResponse")
    public JAXBElement<OnLoginResponse> createOnLoginResponse(OnLoginResponse value) {
        return new JAXBElement<OnLoginResponse>(_OnLoginResponse_QNAME, OnLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "onLogin")
    public JAXBElement<OnLogin> createOnLogin(OnLogin value) {
        return new JAXBElement<OnLogin>(_OnLogin_QNAME, OnLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "checkPassword")
    public JAXBElement<CheckPassword> createCheckPassword(CheckPassword value) {
        return new JAXBElement<CheckPassword>(_CheckPassword_QNAME, CheckPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "checkPasswordResponse")
    public JAXBElement<CheckPasswordResponse> createCheckPasswordResponse(CheckPasswordResponse value) {
        return new JAXBElement<CheckPasswordResponse>(_CheckPasswordResponse_QNAME, CheckPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserServer/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

}
