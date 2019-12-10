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

public class TheFrontRemoveW implements TheFrontInter{//단어제거
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
        st = new StringTokenizer(data);//데이터 나누기
        sel = st.nextToken("////");
        String w =st.nextToken("////");
        String m = st.nextToken("////");
        WordCheck(w);//단어가 존재하는지 확인
        j=i-1;//i값을 이용하여 체크워드의 배열에서 지울 내용의 인덱스를 알아내려 했지만
        //i값이 한번 더 연산된 결과로 저장되어서 배열의 범위를 벗어나거나 상관없는 데이터를 삭제하므로
        //i값을 원래 의도한 내용으로 되돌리기 위한 작업
        WordList.remove(j);
        i=0;
        if(!check){
            RemoveW(w, m);
            this.data = sel+"////"+"성공적으로 제거되었습니다.";
        }else{
            this.data = sel+"////"+"단어가 존재하지 않습니다";
        }
    }

    @Override
    public String get() {
        return data;
    }
    
    public boolean WordCheck(String word){
        check = true;
            for(WordDataPoJo m: WordList){
                i++;//지우고 싶은 단어의 인덱스를 찾기위한 int값
                //그러나 i값이 지우고자 하는 인덱스값보다 큰 값으로 출력
                if(word.equals(m.getWord())){
                    check = false;
                    break;
                }  
            }
        return check;
    }

    public ArrayList checkword(){//프로퍼티파일에 있는 데이터를 배열로 작성
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
    
    public void RemoveW(String word,String mean){//remove명령어를 통해 특정 인덱스를 지운 
        //배열을 이용해 프로퍼티의 내용을 다시씀
        //결과적으로 원하는 내용만을 삭제할 수 있음.
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
