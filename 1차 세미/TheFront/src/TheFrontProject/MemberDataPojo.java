package TheFrontProject;
//�������� �ӽ� �����
public class MemberDataPojo {
    private String id,pw,name,ele;  //���̵� ��й�ȣ �̸� �����
    private MemberDataPojo mData;

    public MemberDataPojo(String id,String pw,String name,String ele){
        this.id = id;
        this.pw = pw;
        this.name=name;
        this.ele=ele;
    }
    public MemberDataPojo(String id,String pw){
        this.id = id;
        this.pw = pw;
    }
    
    public MemberDataPojo(String id){
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public MemberDataPojo getmData() {
        return mData;
    }

    public void setmData(MemberDataPojo mData) {
        this.mData = mData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEle() {
        return ele;
    }

    public void setEle(String ele) {
        this.ele = ele;
    }
    
    
}
