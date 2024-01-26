package main.behavioral.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        AuthenticationHandler authenticationHandler = new AuthenticationHandler("123345");
        ContentTypeHandler contentTypeHandler = new ContentTypeHandler("json");
        PayloadHandler payloadHandler = new PayloadHandler("Body: {\"username\" = \"John\"}");

        authenticationHandler.next = contentTypeHandler;
        contentTypeHandler.next = payloadHandler;

        String withAuth = authenticationHandler.addHandler("Headers with auth");
        System.out.println(withAuth);
        System.out.println("-------");
        String withoutAuth = contentTypeHandler.addHandler("Headers without auth");
        System.out.println(withoutAuth);

    }


}
