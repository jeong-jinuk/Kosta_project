package TheFrontProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontAddW implements TheFrontInter{
    private String data,sel,word,mean;
    private String Path = "C:\\bigdataStudy\\java\\networkspace\\TheFront\\src\\TheFrontProject\\WordData.properties";
    private BufferedReader br;
    private StringTokenizer st;
    private ArrayList<WordDataPoJo> WordList;
    private boolean check;

    public TheFrontAddW() {//�ܾ� �߰��� ���� ������
        WordList = new ArrayList<WordDataPoJo>();
        WordList = checkword();
//�ܾ��߰��� �����Ű�� ����� properties�� �����͸� ���� ���ο� �迭�� �����
//�� �迭�� WordDataPoJo�� ���׸����� ���� WordList�� ����.
    }
    
    @Override
    public void set(String data) {
        st = new StringTokenizer(data);
//Ŭ���̾�Ʈ�κ��� ���� �����͸� StringTokenizer�� ���� ������� ����
        sel = st.nextToken("////");
//�� ��, ���� �����忡�� ������ ���� ���� �б��Ű�� ���� �־���� ���� ���� ������ ���ش�.
        String w =st.nextToken("////");
        String m = st.nextToken("////");//�����͸� ���� Ŭ�������� ����ϱ� ���� ����
        WordCheck(w);//�Է¹��� �����Ͱ� ����Ǿ��ִ��� Ȯ��.
        addWord(w, m);//���ٸ� �߰��� ����.
        
    }

    @Override
    public String get() {//�� Ŭ�������� ó���� �����͸� ��ȯ���ִ� �޼ҵ�
        if(!check){
        data = sel+"////"+"�̹������ϴ´ܾ��Դϴ�."+"////";
        }else{
        data = sel+"////"+"�����������߰��Ǿ����ϴ�."+"////";  
        }
        return data;
    }
    
    public boolean WordCheck(String word){//�Է¹��� �����͸� �ɰ��� �ܾ ������Ƽ���Ͽ� �����ϴ��� Ȯ��
        check = true;
            for(WordDataPoJo m: WordList){
                if(word.equals(m.getWord())){
                    check = false;
                    break;
                }  
            }
        return check;
    }

    public ArrayList checkword(){//�Է¹��� �����Ϳ� ���ϱ� ���� ������Ƽ ������ �迭���·� �������
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

   public void addWord(String word,String mean){//���������� �ܾ �߰��ϴ� ���
       if(check){  
            for(WordDataPoJo m : WordList){
                if(!word.equals(m.getWord())){//������Ƽ���Ͽ� �Է¹��� �ܾ ���ٸ�
                    this.word=word;//�������� �ӽ÷� �Է¹��� �ܾ�� ��ü
                    this.mean=mean;
                }
             }
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(Path,true));
                //new FileWriter(Path,true)���� true�� ������ �ִ� ������ ���ʿ� �ٿ���
                bw.write(this.word+"////"+this.mean);//������ �ӽ������ ���� ���Ͽ� ��
                bw.newLine();//�� ���� �����
                bw.flush();//bw ��ü�� �����
                bw.close();//�� ������ �ݾ���
                } catch (IOException ex) {
                ex.printStackTrace();
                }
       }
   }
}
