package TheFrontProject;

import java.io.IOException;

public class ServiceSel {
    private TheFrontInter fi;
    private String A;
    
    public void ServiceSelSP(String data) {
        //Ŭ���̾�Ʈ���� ������ data�տ� ���������� Ư���� String�� �ο��Ͽ�
        //�������� �պκ��� Ȯ���ϴ� ��ɾ ���� �� ����� Ŭ������ �б�!
        //�����͸� �Է��ϰ� �޾ƿ��� �κ��� �������̽�ȭ �Ͽ�, �б��� ���뿡����
        //�����͸� �Է½�Ű�� �бⰡ ��� �����Ŀ� �ѹ��� �����͸� ������.
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
    

