package TheFrontProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontSerch implements TheFrontInter{//수정하려는 아이디가 존재하는지 확인
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
    public void set(String data) {//아이디값을 받아와서 나눠서 저장
        st = new StringTokenizer(data);
        sel = st.nextToken("////");
        String ID = st.nextToken("////");
        idCheck(ID);
    }

    @Override
    public String get() {
        return sel+"////"+b+"////"+
                "입력된 아이디 정보 :"+sPW+","+sNAME+","+sELE;
    }
    
        public boolean idCheck(String id){  
//아이디가 이미 가입되어 있는지 파일에서 데이터를 다 읽어와서 비교해줌. 
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
            //파일을 읽어옴에 있어서 인코딩을 해줌
            //FileReader에서는 인코딩을 따로 해줄 수 없음
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
        return arr;//프로퍼티 파일의 자료를 배열로 생성
    }
        
    
}
