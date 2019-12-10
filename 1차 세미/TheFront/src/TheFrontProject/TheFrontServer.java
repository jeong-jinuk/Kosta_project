package TheFrontProject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheFrontServer {
    
    private ServerSocket ss;
    private ArrayList<TheFrontServerThread> cList;
    private ExecutorService executorService;

    public TheFrontServer() {
        
        try {
            ss=new ServerSocket(9999);//서버가 사용할 포트
            System.out.println("ServerStart!");
            cList = new ArrayList<>();
            executorService = Executors.newFixedThreadPool(4);//쓰레드풀 동시접속자에대한 제한
        } catch (IOException ex) {
            System.out.println("이미 사용중인 port입니다.");
        }
    }
    
    public void execute(){
        while(true){            
            try {
                Socket s = ss.accept();//소켓에서 통신을 담당
                TheFrontServerThread tt = new TheFrontServerThread(s,this);
                executorService.submit(tt);
                System.out.println("Current number id clients :"+cList.size());
            } catch (IOException ex) {
                ex.printStackTrace();
            }          
        }
    }
    
    public static void main(String[] args) {
        TheFrontServer server = new TheFrontServer();
        server.execute();
    }
  
}
