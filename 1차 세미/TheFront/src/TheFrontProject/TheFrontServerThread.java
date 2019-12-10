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
        System.out.println("������ IP : "+s.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {        
        try {
            pw = new PrintWriter(
                    socket.getOutputStream(),true);//�����͸� Ŭ���̾�Ʈ�� ������ ���� �κ�
            br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()));//�����͸� Ŭ���̾�Ʈ�κ��� �޾ƿ��� �κ�
            while(true){
                String data = br.readLine();
                System.out.println("LOG : "+data);//�Է¹��� �κ��� LOG���·� ������ ����
                ss = new ServiceSel();//Ŭ���̾�Ʈ�� �����͸� �б��Ű�� ���� Ŭ����!
                ss.ServiceSelSP(data);
                pw.println(ss.pass());
            }
        } catch (IOException ex) {
        }
        
        }  
}