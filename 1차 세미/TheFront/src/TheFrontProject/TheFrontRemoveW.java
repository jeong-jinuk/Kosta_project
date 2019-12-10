package TheFrontProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TheFrontRemoveW implements TheFrontInter{//�ܾ�����
    private String data,sel,word,mean;
    private String Path = "C:\\bigdataStudy\\java\\networkspace\\TheFront\\src\\TheFrontProject\\WordData.properties";
    private BufferedReader br;
    private StringTokenizer st;
    private ArrayList<WordDataPoJo> WordList;
    private boolean check;
    private int i,j;

    public TheFrontRemoveW() {
        WordList = new ArrayList<WordDataPoJo>();
        WordList = checkword();
        i=0;
    }
    
    @Override
    public void set(String data) {
        st = new StringTokenizer(data);//������ ������
        sel = st.nextToken("////");
        String w =st.nextToken("////");
        String m = st.nextToken("////");
        WordCheck(w);//�ܾ �����ϴ��� Ȯ��
        j=i-1;//i���� �̿��Ͽ� üũ������ �迭���� ���� ������ �ε����� �˾Ƴ��� ������
        //i���� �ѹ� �� ����� ����� ����Ǿ �迭�� ������ ����ų� ������� �����͸� �����ϹǷ�
        //i���� ���� �ǵ��� �������� �ǵ����� ���� �۾�
        WordList.remove(j);
        i=0;
        if(!check){
            RemoveW(w, m);
            this.data = sel+"////"+"���������� ���ŵǾ����ϴ�.";
        }else{
            this.data = sel+"////"+"�ܾ �������� �ʽ��ϴ�";
        }
    }

    @Override
    public String get() {
        return data;
    }
    
    public boolean WordCheck(String word){
        check = true;
            for(WordDataPoJo m: WordList){
                i++;//����� ���� �ܾ��� �ε����� ã������ int��
                //�׷��� i���� ������� �ϴ� �ε��������� ū ������ ���
                if(word.equals(m.getWord())){
                    check = false;
                    break;
                }  
            }
        return check;
    }

    public ArrayList checkword(){//������Ƽ���Ͽ� �ִ� �����͸� �迭�� �ۼ�
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
    
    public void RemoveW(String word,String mean){//remove��ɾ ���� Ư�� �ε����� ���� 
        //�迭�� �̿��� ������Ƽ�� ������ �ٽþ�
        //��������� ���ϴ� ���븸�� ������ �� ����.
        if(!check){  
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Path));
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
