package TheFrontProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontSerch implements TheFrontInter{//�����Ϸ��� ���̵� �����ϴ��� Ȯ��
    private StringTokenizer st;
    private String Path = "C:\\bigdataStudy\\java\\networkspace\\TheFront\\src\\TheFrontProject\\memberData.properties";
    private ArrayList<MemberDataPojo> memberList;
    private BufferedReader br;
    private String sel,sID,b,sPW,sNAME,sELE;

    public TheFrontSerch() {
        memberList = new ArrayList<MemberDataPojo>();
        memberList = checkmem();
    }
    
    

    @Override
    public void set(String data) {//���̵��� �޾ƿͼ� ������ ����
        st = new StringTokenizer(data);
        sel = st.nextToken("////");
        String ID = st.nextToken("////");
        idCheck(ID);
    }

    @Override
    public String get() {
        return sel+"////"+b+"////"+
                "�Էµ� ���̵� ���� :"+sPW+","+sNAME+","+sELE;
    }
    
        public boolean idCheck(String id){  
//���̵� �̹� ���ԵǾ� �ִ��� ���Ͽ��� �����͸� �� �о�ͼ� ������. 
        boolean check = true;
            for(MemberDataPojo m: memberList){
                if(id.equals(m.getId())){
                    System.out.println();
                    b = "true";
                    check = false;
                    sPW=m.getPw();
                    sNAME = m.getName();
                    sELE = m.getEle();
                    break;
                }  else{
                    b="false";   
                }
            }
        return check;
    }
        public ArrayList checkmem(){
            ArrayList arr = new ArrayList();   
            String readLine = null;          
            try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(Path),"EUC-KR"));
            //������ �о�ȿ� �־ ���ڵ��� ����
            //FileReader������ ���ڵ��� ���� ���� �� ����
            while((readLine=br.readLine()) != null){
                st = new StringTokenizer(readLine);
                String ID = st.nextToken("////");
                String PW = st.nextToken("////");
                String NAME=st.nextToken("////");
                String ELE=st.nextToken("////");
                arr.add(new MemberDataPojo(ID,PW,NAME,ELE));
            }
            br.close();
        } catch (IOException ex) {
        }
        return arr;//������Ƽ ������ �ڷḦ �迭�� ����
    }
        
    
}
