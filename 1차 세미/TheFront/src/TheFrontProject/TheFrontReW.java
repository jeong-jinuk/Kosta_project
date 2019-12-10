package TheFrontProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TheFrontReW implements TheFrontInter{//단어장 수정
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
    public void set(String data) {//데이터를 받아옴
        st = new StringTokenizer(data);//받아온 데이터를 나눠줌
        sel = st.nextToken("////");//액션의 분기를 위한 장치
        w =st.nextToken("////");
        m = st.nextToken("////");
        WordCheck(w);
        if(!check){
        updateWordFile(w, m);
        this.data=sel+"////"+"변경되었습니다.";
        }else{
         this.data=sel+"////"+"없는 단어입니다.";   
        }
    }

    @Override
    public String get() {
        return data;
    }
    
    public boolean WordCheck(String word){//단어가 존재하는지 체크
        check = true;
            for(WordDataPoJo m: WordList){
                if(word.equals(m.getWord())){
                    check = false;
                    break;
                }  
            }
        return check;
    }
    
    public ArrayList checkword(){//시작과 동시에 프로퍼티의 내용을 배열로 생성
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
    
    public void updateWordFile(String word,String mean){//단어를 수정함
        if(!check){  
            for(WordDataPoJo m : WordList){
                if(word.equals(m.getWord())){
                    m.setMean(mean);
                    break;
                }
            }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Path));//새로 입력받은 단어를 덧씌워서 저장
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
