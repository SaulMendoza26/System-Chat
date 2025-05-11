package com.sistema_chat.model.websockets;
import jakarta.websocket.OnMessage;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class EchoServer {
   @OnMessage
    public String echo(String incomingMessage){
        return "I got this ("+ incomingMessage+")"+ "so iam sending it back";
    }
}
