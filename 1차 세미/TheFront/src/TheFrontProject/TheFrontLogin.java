package TheFrontProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontLogin implements TheFrontInter {//�α��� ó�� Ŭ����
    private String Path =
            "C:\\bigdataStudy\\java\\networkspace\\TheFront\\src\\TheFrontProject\\memberData.properties";
    private ArrayList<MemberDataPojo> memberList;
    private BufferedReader br;
    private String sID,sPW,b,sel,p;
    private StringTokenizer st;

    public TheFrontLogin() throws FileNotFoundException, IOException {
        memberList = new ArrayList<MemberDataPojo>();
    }

    @Override
    public void set(String data) {//Ŭ���̾�Ʈ���� �Է¹��� ���� ���� �� �ְ� ����
        st = new StringTokenizer(data);
        sel = st.nextToken("////");
        String id = st.nextToken("////");
        if(st.hasMoreTokens()){//��й�ȣ�� �������� ���ξ��� ��� ������ ���߹Ƿ� �ڿ� ���� ��ū�� �ִ��� Ȯ�� �� ����
        p = st.nextToken("////");
        }
        memberList = checkmem();
        for(MemberDataPojo m: memberList){
        if(id.equals(m.getId())){
            if(p.equals(m.getPw())){
//���̵� �����ϴ��� Ȯ��! Ȯ�� �� �����ϸ� true�� ����
//������ false�� ����
                b = "true";
                break;
            }else if(!p.equals(m.getPw())){
                b = "false";               
                break;
            }else if(p.equals("null")){
                b = "false";               
                break;
            }   
            }else if(!id.equals(m.getId())){
                System.out.println("���¾��̵�.");
                b="false";
                break;    
        }
        }
    }

    @Override
    public String get() {
        String data;//������ ó���� �� ���� �����
         data= sel+"////"+b;
        return data;
    }

    public ArrayList checkmem(){
            ArrayList arr = new ArrayList();   
            String readLine = null;          
            try {
            br = new BufferedReader(new FileReader(Path));
            while((readLine=br.readLine()) != null){
                st = new StringTokenizer(readLine);
                sID = st.nextToken("////");
                sPW = st.nextToken("////");
                arr.add(new MemberDataPojo(sID,sPW));
            }
            br.close();
        } catch (IOException ex) {
        }
        return arr;
    }
  
}
