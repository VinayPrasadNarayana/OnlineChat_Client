
package threadserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the threadserver package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://ThreadServer/", "helloResponse");
    private final static QName _GetNumOfMessagesResponse_QNAME = new QName("http://ThreadServer/", "getNumOfMessagesResponse");
    private final static QName _GetThreads_QNAME = new QName("http://ThreadServer/", "getThreads");
    private final static QName _SetisEditingResponse_QNAME = new QName("http://ThreadServer/", "setisEditingResponse");
    private final static QName _ResetIsEditingResponse_QNAME = new QName("http://ThreadServer/", "resetIsEditingResponse");
    private final static QName _Hello_QNAME = new QName("http://ThreadServer/", "hello");
    private final static QName _CreateMessage_QNAME = new QName("http://ThreadServer/", "createMessage");
    private final static QName _ReturnMessages_QNAME = new QName("http://ThreadServer/", "returnMessages");
    private final static QName _CreateMessageResponse_QNAME = new QName("http://ThreadServer/", "createMessageResponse");
    private final static QName _ReturnMessagesResponse_QNAME = new QName("http://ThreadServer/", "returnMessagesResponse");
    private final static QName _FindThreadResponse_QNAME = new QName("http://ThreadServer/", "findThreadResponse");
    private final static QName _ResetIsEditing_QNAME = new QName("http://ThreadServer/", "resetIsEditing");
    private final static QName _AddThread_QNAME = new QName("http://ThreadServer/", "AddThread");
    private final static QName _GetThreadsResponse_QNAME = new QName("http://ThreadServer/", "getThreadsResponse");
    private final static QName _GetMessagesInfoResponse_QNAME = new QName("http://ThreadServer/", "getMessagesInfoResponse");
    private final static QName _FindThread_QNAME = new QName("http://ThreadServer/", "findThread");
    private final static QName _GetThreadInfo_QNAME = new QName("http://ThreadServer/", "getThreadInfo");
    private final static QName _SetisEditing_QNAME = new QName("http://ThreadServer/", "setisEditing");
    private final static QName _SaveThreadsResponse_QNAME = new QName("http://ThreadServer/", "saveThreadsResponse");
    private final static QName _SaveThreads_QNAME = new QName("http://ThreadServer/", "saveThreads");
    private final static QName _AddThreadResponse_QNAME = new QName("http://ThreadServer/", "AddThreadResponse");
    private final static QName _GetNumOfThreads_QNAME = new QName("http://ThreadServer/", "getNumOfThreads");
    private final static QName _GetMessagesInfo_QNAME = new QName("http://ThreadServer/", "getMessagesInfo");
    private final static QName _GetThreadInfoResponse_QNAME = new QName("http://ThreadServer/", "getThreadInfoResponse");
    private final static QName _GetNumOfMessages_QNAME = new QName("http://ThreadServer/", "getNumOfMessages");
    private final static QName _GetNumOfThreadsResponse_QNAME = new QName("http://ThreadServer/", "getNumOfThreadsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: threadserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessagesInfo }
     * 
     */
    public GetMessagesInfo createGetMessagesInfo() {
        return new GetMessagesInfo();
    }

    /**
     * Create an instance of {@link GetNumOfThreads }
     * 
     */
    public GetNumOfThreads createGetNumOfThreads() {
        return new GetNumOfThreads();
    }

    /**
     * Create an instance of {@link AddThreadResponse }
     * 
     */
    public AddThreadResponse createAddThreadResponse() {
        return new AddThreadResponse();
    }

    /**
     * Create an instance of {@link SaveThreads }
     * 
     */
    public SaveThreads createSaveThreads() {
        return new SaveThreads();
    }

    /**
     * Create an instance of {@link GetNumOfMessages }
     * 
     */
    public GetNumOfMessages createGetNumOfMessages() {
        return new GetNumOfMessages();
    }

    /**
     * Create an instance of {@link GetNumOfThreadsResponse }
     * 
     */
    public GetNumOfThreadsResponse createGetNumOfThreadsResponse() {
        return new GetNumOfThreadsResponse();
    }

    /**
     * Create an instance of {@link GetThreadInfoResponse }
     * 
     */
    public GetThreadInfoResponse createGetThreadInfoResponse() {
        return new GetThreadInfoResponse();
    }

    /**
     * Create an instance of {@link GetThreadInfo }
     * 
     */
    public GetThreadInfo createGetThreadInfo() {
        return new GetThreadInfo();
    }

    /**
     * Create an instance of {@link SetisEditing }
     * 
     */
    public SetisEditing createSetisEditing() {
        return new SetisEditing();
    }

    /**
     * Create an instance of {@link SaveThreadsResponse }
     * 
     */
    public SaveThreadsResponse createSaveThreadsResponse() {
        return new SaveThreadsResponse();
    }

    /**
     * Create an instance of {@link ResetIsEditing }
     * 
     */
    public ResetIsEditing createResetIsEditing() {
        return new ResetIsEditing();
    }

    /**
     * Create an instance of {@link AddThread }
     * 
     */
    public AddThread createAddThread() {
        return new AddThread();
    }

    /**
     * Create an instance of {@link FindThreadResponse }
     * 
     */
    public FindThreadResponse createFindThreadResponse() {
        return new FindThreadResponse();
    }

    /**
     * Create an instance of {@link ReturnMessagesResponse }
     * 
     */
    public ReturnMessagesResponse createReturnMessagesResponse() {
        return new ReturnMessagesResponse();
    }

    /**
     * Create an instance of {@link CreateMessageResponse }
     * 
     */
    public CreateMessageResponse createCreateMessageResponse() {
        return new CreateMessageResponse();
    }

    /**
     * Create an instance of {@link FindThread }
     * 
     */
    public FindThread createFindThread() {
        return new FindThread();
    }

    /**
     * Create an instance of {@link GetThreadsResponse }
     * 
     */
    public GetThreadsResponse createGetThreadsResponse() {
        return new GetThreadsResponse();
    }

    /**
     * Create an instance of {@link GetMessagesInfoResponse }
     * 
     */
    public GetMessagesInfoResponse createGetMessagesInfoResponse() {
        return new GetMessagesInfoResponse();
    }

    /**
     * Create an instance of {@link GetNumOfMessagesResponse }
     * 
     */
    public GetNumOfMessagesResponse createGetNumOfMessagesResponse() {
        return new GetNumOfMessagesResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CreateMessage }
     * 
     */
    public CreateMessage createCreateMessage() {
        return new CreateMessage();
    }

    /**
     * Create an instance of {@link ReturnMessages }
     * 
     */
    public ReturnMessages createReturnMessages() {
        return new ReturnMessages();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ResetIsEditingResponse }
     * 
     */
    public ResetIsEditingResponse createResetIsEditingResponse() {
        return new ResetIsEditingResponse();
    }

    /**
     * Create an instance of {@link GetThreads }
     * 
     */
    public GetThreads createGetThreads() {
        return new GetThreads();
    }

    /**
     * Create an instance of {@link SetisEditingResponse }
     * 
     */
    public SetisEditingResponse createSetisEditingResponse() {
        return new SetisEditingResponse();
    }

    /**
     * Create an instance of {@link UserThread }
     * 
     */
    public UserThread createUserThread() {
        return new UserThread();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumOfMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getNumOfMessagesResponse")
    public JAXBElement<GetNumOfMessagesResponse> createGetNumOfMessagesResponse(GetNumOfMessagesResponse value) {
        return new JAXBElement<GetNumOfMessagesResponse>(_GetNumOfMessagesResponse_QNAME, GetNumOfMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getThreads")
    public JAXBElement<GetThreads> createGetThreads(GetThreads value) {
        return new JAXBElement<GetThreads>(_GetThreads_QNAME, GetThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetisEditingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "setisEditingResponse")
    public JAXBElement<SetisEditingResponse> createSetisEditingResponse(SetisEditingResponse value) {
        return new JAXBElement<SetisEditingResponse>(_SetisEditingResponse_QNAME, SetisEditingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetIsEditingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "resetIsEditingResponse")
    public JAXBElement<ResetIsEditingResponse> createResetIsEditingResponse(ResetIsEditingResponse value) {
        return new JAXBElement<ResetIsEditingResponse>(_ResetIsEditingResponse_QNAME, ResetIsEditingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "createMessage")
    public JAXBElement<CreateMessage> createCreateMessage(CreateMessage value) {
        return new JAXBElement<CreateMessage>(_CreateMessage_QNAME, CreateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "returnMessages")
    public JAXBElement<ReturnMessages> createReturnMessages(ReturnMessages value) {
        return new JAXBElement<ReturnMessages>(_ReturnMessages_QNAME, ReturnMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "createMessageResponse")
    public JAXBElement<CreateMessageResponse> createCreateMessageResponse(CreateMessageResponse value) {
        return new JAXBElement<CreateMessageResponse>(_CreateMessageResponse_QNAME, CreateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "returnMessagesResponse")
    public JAXBElement<ReturnMessagesResponse> createReturnMessagesResponse(ReturnMessagesResponse value) {
        return new JAXBElement<ReturnMessagesResponse>(_ReturnMessagesResponse_QNAME, ReturnMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "findThreadResponse")
    public JAXBElement<FindThreadResponse> createFindThreadResponse(FindThreadResponse value) {
        return new JAXBElement<FindThreadResponse>(_FindThreadResponse_QNAME, FindThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetIsEditing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "resetIsEditing")
    public JAXBElement<ResetIsEditing> createResetIsEditing(ResetIsEditing value) {
        return new JAXBElement<ResetIsEditing>(_ResetIsEditing_QNAME, ResetIsEditing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "AddThread")
    public JAXBElement<AddThread> createAddThread(AddThread value) {
        return new JAXBElement<AddThread>(_AddThread_QNAME, AddThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getThreadsResponse")
    public JAXBElement<GetThreadsResponse> createGetThreadsResponse(GetThreadsResponse value) {
        return new JAXBElement<GetThreadsResponse>(_GetThreadsResponse_QNAME, GetThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getMessagesInfoResponse")
    public JAXBElement<GetMessagesInfoResponse> createGetMessagesInfoResponse(GetMessagesInfoResponse value) {
        return new JAXBElement<GetMessagesInfoResponse>(_GetMessagesInfoResponse_QNAME, GetMessagesInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "findThread")
    public JAXBElement<FindThread> createFindThread(FindThread value) {
        return new JAXBElement<FindThread>(_FindThread_QNAME, FindThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getThreadInfo")
    public JAXBElement<GetThreadInfo> createGetThreadInfo(GetThreadInfo value) {
        return new JAXBElement<GetThreadInfo>(_GetThreadInfo_QNAME, GetThreadInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetisEditing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "setisEditing")
    public JAXBElement<SetisEditing> createSetisEditing(SetisEditing value) {
        return new JAXBElement<SetisEditing>(_SetisEditing_QNAME, SetisEditing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "saveThreadsResponse")
    public JAXBElement<SaveThreadsResponse> createSaveThreadsResponse(SaveThreadsResponse value) {
        return new JAXBElement<SaveThreadsResponse>(_SaveThreadsResponse_QNAME, SaveThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "saveThreads")
    public JAXBElement<SaveThreads> createSaveThreads(SaveThreads value) {
        return new JAXBElement<SaveThreads>(_SaveThreads_QNAME, SaveThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "AddThreadResponse")
    public JAXBElement<AddThreadResponse> createAddThreadResponse(AddThreadResponse value) {
        return new JAXBElement<AddThreadResponse>(_AddThreadResponse_QNAME, AddThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumOfThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getNumOfThreads")
    public JAXBElement<GetNumOfThreads> createGetNumOfThreads(GetNumOfThreads value) {
        return new JAXBElement<GetNumOfThreads>(_GetNumOfThreads_QNAME, GetNumOfThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getMessagesInfo")
    public JAXBElement<GetMessagesInfo> createGetMessagesInfo(GetMessagesInfo value) {
        return new JAXBElement<GetMessagesInfo>(_GetMessagesInfo_QNAME, GetMessagesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getThreadInfoResponse")
    public JAXBElement<GetThreadInfoResponse> createGetThreadInfoResponse(GetThreadInfoResponse value) {
        return new JAXBElement<GetThreadInfoResponse>(_GetThreadInfoResponse_QNAME, GetThreadInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumOfMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getNumOfMessages")
    public JAXBElement<GetNumOfMessages> createGetNumOfMessages(GetNumOfMessages value) {
        return new JAXBElement<GetNumOfMessages>(_GetNumOfMessages_QNAME, GetNumOfMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumOfThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ThreadServer/", name = "getNumOfThreadsResponse")
    public JAXBElement<GetNumOfThreadsResponse> createGetNumOfThreadsResponse(GetNumOfThreadsResponse value) {
        return new JAXBElement<GetNumOfThreadsResponse>(_GetNumOfThreadsResponse_QNAME, GetNumOfThreadsResponse.class, null, value);
    }

}
