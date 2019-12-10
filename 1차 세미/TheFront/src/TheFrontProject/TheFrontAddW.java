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

    public TheFrontAddW() {//단어 추가에 대한 생성자
        WordList = new ArrayList<WordDataPoJo>();
        WordList = checkword();
//단어추가를 실행시키면 연결된 properties의 데이터를 토대로 새로운 배열을 만들고
//그 배열을 WordDataPoJo를 제네릭으로 갖는 WordList에 저장.
    }
    
    @Override
    public void set(String data) {
        st = new StringTokenizer(data);
//클라이언트로부터 받은 데이터를 StringTokenizer를 통해 순서대로 분해
        sel = st.nextToken("////");
//이 때, 서버 스레드에서 데이터 값에 따라 분기시키기 위해 넣어줬던 값은 따로 저장을 해준다.
        String w =st.nextToken("////");
        String m = st.nextToken("////");//데이터를 현재 클래스에서 사용하기 위해 분해
        WordCheck(w);//입력받은 데이터가 저장되어있는지 확인.
        addWord(w, m);//없다면 추가를 실행.
        
    }

    @Override
    public String get() {//이 클래스에서 처리한 데이터를 반환해주는 메소드
        if(!check){
        data = sel+"////"+"이미존재하는단어입니다."+"////";
        }else{
        data = sel+"////"+"성공적으로추가되었습니다."+"////";  
        }
        return data;
    }
    
    public boolean WordCheck(String word){//입력받은 데이터를 쪼개서 단어가 프로퍼티파일에 존재하는지 확인
        check = true;
            for(WordDataPoJo m: WordList){
                if(word.equals(m.getWord())){
                    check = false;
                    break;
                }  
            }
        return check;
    }

    public ArrayList checkword(){//입력받은 데이터와 비교하기 위해 프로퍼티 파일을 배열형태로 만들어줌
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

   public void addWord(String word,String mean){//실질적으로 단어를 추가하는 장소
       if(check){  
            for(WordDataPoJo m : WordList){
                if(!word.equals(m.getWord())){//프로퍼티파일에 입력받은 단어가 없다면
                    this.word=word;//포조에서 임시로 입력받은 단어로 대체
                    this.mean=mean;
                }
             }
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(Path,true));
                //new FileWriter(Path,true)에서 true가 붙으면 있는 데이터 뒤쪽에 붙여줌
                bw.write(this.word+"////"+this.mean);//포조에 임시저장된 값을 파일에 씀
                bw.newLine();//한 줄을 띄워줌
                bw.flush();//bw 객체를 비워줌
                bw.close();//다 썼으니 닫아줌
                } catch (IOException ex) {
                ex.printStackTrace();
                }
       }
   }
}
