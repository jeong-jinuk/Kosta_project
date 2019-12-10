package TheFrontProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontReW implements TheFrontInter{//�ܾ��� ����
    private String data,word,mean,sel,w,m;
    private String Path = "C:\\bigdataStudy\\java\\networkspace\\TheFront\\src\\TheFrontProject\\WordData.properties";
    private BufferedReader br;
    private StringTokenizer st;
    private ArrayList<WordDataPoJo> WordList;
    private boolean check;

    public TheFrontReW() {
        WordList = new ArrayList<WordDataPoJo>();
        WordList = checkword();
    } 
    
    @Override
    public void set(String data) {//�����͸� �޾ƿ�
        st = new StringTokenizer(data);//�޾ƿ� �����͸� ������
        sel = st.nextToken("////");//�׼��� �б⸦ ���� ��ġ
        w =st.nextToken("////");
        m = st.nextToken("////");
        WordCheck(w);
        if(!check){
        updateWordFile(w, m);
        this.data=sel+"////"+"����Ǿ����ϴ�.";
        }else{
         this.data=sel+"////"+"���� �ܾ��Դϴ�.";   
        }
    }

    @Override
    public String get() {
        return data;
    }
    
    public boolean WordCheck(String word){//�ܾ �����ϴ��� üũ
        check = true;
            for(WordDataPoJo m: WordList){
                if(word.equals(m.getWord())){
                    check = false;
                    break;
                }  
            }
        return check;
    }
    
    public ArrayList checkword(){//���۰� ���ÿ� ������Ƽ�� ������ �迭�� ����
            ArrayList arr = new ArrayList();   
            String readLine = null;          
            try {
            br = new BufferedReader(new FileReader(Path));
            while((readLine=br.readLine()) != null){
                st = new StringTokenizer(readLine);
                word = st.nextToken("////");
                mean = st.nextToken("////");
                arr.add(new WordDataPoJo(word,mean));
            }
            br.close();
        } catch (IOException ex) {
        }
        return arr;
    }
    
    public void updateWordFile(String word,String mean){//�ܾ ������
        if(!check){  
            for(WordDataPoJo m : WordList){
                if(word.equals(m.getWord())){
                    m.setMean(mean);
                    break;
                }
            }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Path));//���� �Է¹��� �ܾ �������� ����
                for(WordDataPoJo m : WordList){
                    bw.write(m.getWord()+"////"+m.getMean());
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
