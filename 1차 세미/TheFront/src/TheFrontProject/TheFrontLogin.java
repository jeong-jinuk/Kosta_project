package TheFrontProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontLogin implements TheFrontInter {//로그인 처리 클래스
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
    public void set(String data) {//클라이언트에서 입력받은 값을 비교할 수 있게 나눔
        st = new StringTokenizer(data);
        sel = st.nextToken("////");
        String id = st.nextToken("////");
        if(st.hasMoreTokens()){//비밀번호를 공백으로 놔두었을 경우 실행이 멈추므로 뒤에 남은 토큰이 있는지 확인 후 저장
        p = st.nextToken("////");
        }
        memberList = checkmem();
        for(MemberDataPojo m: memberList){
        if(id.equals(m.getId())){
            if(p.equals(m.getPw())){
//아이디가 존재하는지 확인! 확인 후 존재하면 true를 리턴
//없으면 false를 리턴
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
                System.out.println("없는아이디.");
                b="false";
                break;    
        }
        }
    }

    @Override
    public String get() {
        String data;//서버가 처리한 뒤 나온 결과물
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
