package com.client;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 4/9/13
 * Time: 5:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestClient {
    public static void main(String[] args) {
        HelloWorldService service = new HelloWorldService();
        HelloWorld helloWorld = service.getHelloWorldPort();

        helloWorld.sayHelloWorldFrom("Jim");
    }
}
