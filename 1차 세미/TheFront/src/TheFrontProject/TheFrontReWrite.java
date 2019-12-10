package TheFrontProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class TheFrontReWrite implements TheFrontInter{//회원정보 수정
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
        st = new StringTokenizer(data);//입력받은 데이터 사용할수있게 나눔
        sel = st.nextToken("////");//분기를 위한 구분자역할!
        String ID = st.nextToken("////");
        String PW = st.nextToken("////");
        String NAME = st.nextToken("////");
        String ELE = st.nextToken("////");
        updateMemberFile(ID, PW, NAME,ELE);
    }

    @Override
    public String get() {  
        data=sel+"////"+"변경되었습니다.";
        return data;
    }
    
    
        public boolean idCheck(String id){  //아이디가 이미 가입되어 있는지 파일에서 데이터를 다 읽어와서 비교해줌. 
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
//입력받은 아이디 값이 존재하는지 체크한뒤 있다면 수정
            if(!check){               
//check메서드는 아이디가 있으면 false를 리턴함. 
//그렇기 때문에 !를 붙여서 메서드 결과가 false 면 조건을 타라는 부분
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
//파일에 바뀐 정보를 저장하기 위해 수정한 데이터를 포함한 회원의 모든 정보를 
//다시 전부 덮어씌움. 
//파일클래스는 원하는 정보만 읽어서 그부분만 수정하기가 안되거나 
//까다로우므로 한번에 덮어씌우는 방식을 선택...
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