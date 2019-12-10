package TheFrontProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class TheFrontServerThread implements Runnable{
    private Socket socket;
    private TheFrontServer server;
    private BufferedReader br;
    private PrintWriter pw;
    private ServiceSel ss;

    public PrintWriter getPw() {
        return pw;
    }

    TheFrontServerThread(Socket s, TheFrontServer ser) {
        socket = s;
        server = ser;
        System.out.println("접속자 IP : "+s.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {        
        try {
            pw = new PrintWriter(
                    socket.getOutputStream(),true);//데이터를 클라이언트에 보내기 위한 부분
            br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));//데이터를 클라이언트로부터 받아오는 부분
            while(true){
                String data = br.readLine();
                System.out.println("LOG : "+data);//입력받은 부분을 LOG형태로 서버에 저장
                ss = new ServiceSel();//클라이언트의 데이터를 분기시키기 위한 클래스!
                ss.ServiceSelSP(data);
                pw.println(ss.pass());
            }
        } catch (IOException ex) {
        }
        
        }  
}