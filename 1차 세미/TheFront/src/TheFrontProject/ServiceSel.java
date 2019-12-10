package TheFrontProject;

import java.io.IOException;

public class ServiceSel {
    private TheFrontInter fi;
    private String A;
    
    public void ServiceSelSP(String data) {
        //클라이언트에서 보내는 data앞에 강제적으로 특정한 String을 부여하여
        //데이터의 앞부분을 확인하는 명령어를 통해 각 기능의 클래스로 분기!
        //데이터를 입력하고 받아오는 부분을 인터페이스화 하여, 분기한 내용에서는
        //데이터를 입력시키고 분기가 모두 끝난후에 한번만 데이터를 내보냄.
        if(data.startsWith("Login")){ 
            try {
                fi = new TheFrontLogin();
                fi.set(data);
            } catch (IOException ex) {
            }
            }else if(data.startsWith("Serch")){
                fi = new TheFrontSerch();
                fi.set(data);
            }else if(data.startsWith("ReWriteM")){
                fi = new TheFrontReWrite();
                fi.set(data);  
            }else if(data.startsWith("RewriteWord")){
                fi = new TheFrontReW();
                fi.set(data);
            }else if(data.startsWith("AddW")){
                fi = new TheFrontAddW();
                fi.set(data);
            }else if(data.startsWith("RemoveW")){
                fi=new TheFrontRemoveW();
                fi.set(data);
            }
            System.out.println("OutFutLOG:"+fi.get());
        }
    
    public String pass(){
       A = fi.get();
       return A;
    }
}
    

