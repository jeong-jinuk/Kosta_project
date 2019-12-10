package TheFrontProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class TheFrontReWrite implements TheFrontInter{//ȸ������ ����
    private String Path = "C:\\bigdataStudy\\java\\networkspace\\TheFront\\src\\TheFrontProject\\memberData.properties";
    private ArrayList<MemberDataPojo> memberList;
    private StringTokenizer st;
    private BufferedReader br;
    private String sel,sID,sPW,sNAME,sELE,data;
    private boolean check;

    public TheFrontReWrite() {
        memberList = new ArrayList<MemberDataPojo>();
        memberList = checkmem();
    }
 
    @Override
    public void set(String data) {
        st = new StringTokenizer(data);//�Է¹��� ������ ����Ҽ��ְ� ����
        sel = st.nextToken("////");//�б⸦ ���� �����ڿ���!
        String ID = st.nextToken("////");
        String PW = st.nextToken("////");
        String NAME = st.nextToken("////");
        String ELE = st.nextToken("////");
        updateMemberFile(ID, PW, NAME,ELE);
    }

    @Override
    public String get() {  
        data=sel+"////"+"����Ǿ����ϴ�.";
        return data;
    }
    
    
        public boolean idCheck(String id){  //���̵� �̹� ���ԵǾ� �ִ��� ���Ͽ��� �����͸� �� �о�ͼ� ������. 
        check = true;
            for(MemberDataPojo m: memberList){
                if(id.equals(m.getId())){
                    check = false;
                    break;
                }  
            }
        return check;
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
                sNAME = st.nextToken("////");
                sELE = st.nextToken("////");
                arr.add(new MemberDataPojo(sID,sPW,sNAME,sELE));
            }
            br.close();
        } catch (IOException ex) {
        }
        return arr;
    }
        
   public void updateMemberFile(String id,String pw,String name,String ele){ 
//�Է¹��� ���̵� ���� �����ϴ��� üũ�ѵ� �ִٸ� ����
            if(!check){               
//check�޼���� ���̵� ������ false�� ������. 
//�׷��� ������ !�� �ٿ��� �޼��� ����� false �� ������ Ÿ��� �κ�
                for(MemberDataPojo m : memberList){
                    if(id.equals(m.getId())){
                        m.setPw(pw);
                        m.setName(name);
                        m.setEle(ele);
                        break;
                    }
                }
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(Path));
                    for(MemberDataPojo m : memberList){
//���Ͽ� �ٲ� ������ �����ϱ� ���� ������ �����͸� ������ ȸ���� ��� ������ 
//�ٽ� ���� �����. 
//����Ŭ������ ���ϴ� ������ �о �׺κи� �����ϱⰡ �ȵǰų� 
//��ٷο�Ƿ� �ѹ��� ������ ����� ����...
                        bw.write(m.getId()+"////"+m.getPw()+"////"
                                +m.getName()+"////"+m.getEle()+"////");
                        bw.newLine();
                    }
                    bw.flush();             
                    bw.close();
                 } catch (IOException ex) {
                    ex.printStackTrace();
                 }
            } 
    }
}