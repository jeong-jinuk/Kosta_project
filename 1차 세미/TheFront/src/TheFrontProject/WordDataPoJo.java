package TheFrontProject;
//단어 데이터를 임시로 저장하고 읽어올 수 있도록 도와주는 POJO
public class WordDataPoJo {
    private String word,mean;
    private WordDataPoJo wp;

    public WordDataPoJo(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public WordDataPoJo getWp() {
        return wp;
    }

    public void setWp(WordDataPoJo wp) {
        this.wp = wp;
    }
    
}
