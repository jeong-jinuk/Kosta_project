package TheFrontProject;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TheFrontMain extends javax.swing.JFrame {
    private CardLayout c,c1;
    private PrintWriter pw;
    private Socket s;
    private boolean b;
    private StringTokenizer st;
    private String e,sel,get,data,info;
    


    public TheFrontMain() {      
            initComponents();
            c= (CardLayout) pp.getLayout();//카드 레이아웃 사용!
            c1 = (CardLayout) adm.getLayout();
        try {
            s=new Socket("localhost", 9999);
            pw = new PrintWriter(s.getOutputStream(), true);    
        } catch (IOException ex) {
            ex.printStackTrace();//서버와의 통신을 위한 장소
        }
        
        new Thread(new Runnable() {
                @Override
                public void run() {   
                    try(BufferedReader br = new BufferedReader(
                            new InputStreamReader(s.getInputStream()));) {  
                     while(true){    
                        get = br.readLine();
                        st=new StringTokenizer(get);//서버로 부터 입력받은 값이 어느부분에서 사용하는지 판단!
                        if(get.startsWith("Login")){
                            String a = st.nextToken("////");
                            e= st.nextToken("////");
                            login();//분기에 따라 아래 추가된 메서드를 실행.    
                        }else if(get.startsWith("Serch")){ 
                            String a = st.nextToken("////");
                            e= st.nextToken("////");
                            info=st.nextToken("////");
                            serch(); 
                        }else if(get.startsWith("ReWriteM")){
                            String a = st.nextToken("////");
                            e= st.nextToken("////");
                            rewrite();
                        }else if(get.startsWith("RewriteWord")){
                            String a = st.nextToken("////");
                            e=st.nextToken("////");
                            reww();
                        }else if(data.startsWith("AddW")){
                            String a = st.nextToken("////");
                            e=st.nextToken("////");
                            addw();
                        }else if(data.startsWith("RemoveW")){
                            String a = st.nextToken("////");
                            e=st.nextToken("////");
                            remw();
                        }
                    } 
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDv = new javax.swing.JTextField();
        PWv = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();
        SignIn = new javax.swing.JButton();
        adm = new javax.swing.JPanel();
        admmenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        admem = new javax.swing.JButton();
        adword = new javax.swing.JButton();
        adReturn = new javax.swing.JButton();
        admmem = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        admreturnformem = new javax.swing.JButton();
        FindIDbtn = new javax.swing.JButton();
        FindID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        admremem = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        getID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        admrepw = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        showv = new javax.swing.JTextArea();
        admsujung = new javax.swing.JButton();
        admanID = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        NameRe = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        EleRe = new javax.swing.JTextField();
        admword = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        admreturnforword = new javax.swing.JButton();
        admrew = new javax.swing.JButton();
        admadw = new javax.swing.JButton();
        admrmw = new javax.swing.JButton();
        admkey = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Wshowv = new javax.swing.JTextArea();
        admvalue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel3.setText("관리하실 메뉴를 선택해주세요");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setBackground(new java.awt.Color(51, 51, 51));
        pp.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel2.setText("PW");

        IDv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDvActionPerformed(evt);
            }
        });

        PWv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWvActionPerformed(evt);
            }
        });

        LogIn.setText("Log-In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        SignIn.setText("Sign-in");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IDv, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PWv)
                            .addComponent(LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PWv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pp.add(login, "login");

        adm.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel4.setText("관리하실 메뉴를 선택해주세요");
        jLabel4.setToolTipText("");

        admem.setText("회원정보 수정");
        admem.setToolTipText("go member");
        admem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admemActionPerformed(evt);
            }
        });

        adword.setText("단어장 수정");
        adword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adwordActionPerformed(evt);
            }
        });

        adReturn.setText("처음으로 돌아가기");
        adReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admmenuLayout = new javax.swing.GroupLayout(admmenu);
        admmenu.setLayout(admmenuLayout);
        admmenuLayout.setHorizontalGroup(
            admmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admmenuLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(admmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adReturn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(adword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        admmenuLayout.setVerticalGroup(
            admmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admmenuLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(admem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(adword, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(adReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        adm.add(admmenu, "admmenu");

        jLabel5.setFont(new java.awt.Font("굴림", 1, 36)); // NOI18N
        jLabel5.setText("회원정보 수정 ");

        admreturnformem.setText("관리자 메뉴로 돌아가기");
        admreturnformem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admreturnformemActionPerformed(evt);
            }
        });

        FindIDbtn.setText("검색");
        FindIDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindIDbtnActionPerformed(evt);
            }
        });

        FindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindIDActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel11.setText("수정할 ID를 검색해 주세요");

        javax.swing.GroupLayout admmemLayout = new javax.swing.GroupLayout(admmem);
        admmem.setLayout(admmemLayout);
        admmemLayout.setHorizontalGroup(
            admmemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admmemLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(admmemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindID, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(admmemLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(admmemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(admreturnformem, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(FindIDbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        admmemLayout.setVerticalGroup(
            admmemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admmemLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(FindID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(FindIDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(admreturnformem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        adm.add(admmem, "admmem");

        jLabel10.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel10.setText("ID : ");

        getID.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        getID.setText("getID");

        jLabel12.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel12.setText("PW : ");

        admrepw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admrepwActionPerformed(evt);
            }
        });

        showv.setColumns(20);
        showv.setRows(5);
        jScrollPane2.setViewportView(showv);

        admsujung.setText("수정하기");
        admsujung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admsujungActionPerformed(evt);
            }
        });

        admanID.setText("다른아이디 찾기");
        admanID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admanIDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel13.setText("Name : ");

        NameRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameReActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel14.setText("초등학교");

        EleRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleReActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout admrememLayout = new javax.swing.GroupLayout(admremem);
        admremem.setLayout(admrememLayout);
        admrememLayout.setHorizontalGroup(
            admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admrememLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admrememLayout.createSequentialGroup()
                        .addGroup(admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admrememLayout.createSequentialGroup()
                        .addGroup(admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EleRe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameRe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admrepw, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(admrememLayout.createSequentialGroup()
                                .addGap(0, 169, Short.MAX_VALUE)
                                .addComponent(admanID, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(admsujung, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, admrememLayout.createSequentialGroup()
                                .addGroup(admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addComponent(getID, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(52, 52, 52))))
        );
        admrememLayout.setVerticalGroup(
            admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admrememLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admrepw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameRe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EleRe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(admrememLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admsujung, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admanID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        adm.add(admremem, "admremem");

        jLabel6.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel6.setText("단어장 수정");

        admreturnforword.setText("관리자 메뉴로 돌아가기");
        admreturnforword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admreturnforwordActionPerformed(evt);
            }
        });

        admrew.setText("단어 수정");
        admrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admrewActionPerformed(evt);
            }
        });

        admadw.setText("단어 추가");
        admadw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admadwActionPerformed(evt);
            }
        });

        admrmw.setText("단어 제거");
        admrmw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admrmwActionPerformed(evt);
            }
        });

        admkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admkeyActionPerformed(evt);
            }
        });

        Wshowv.setColumns(20);
        Wshowv.setRows(5);
        jScrollPane1.setViewportView(Wshowv);

        admvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admvalueActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel8.setText("단어");

        jLabel9.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel9.setText("뜻");

        javax.swing.GroupLayout admwordLayout = new javax.swing.GroupLayout(admword);
        admword.setLayout(admwordLayout);
        admwordLayout.setHorizontalGroup(
            admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admwordLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(admrmw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admadw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admreturnforword, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(admrew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admwordLayout.createSequentialGroup()
                        .addGroup(admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(admvalue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(admkey, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admwordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        admwordLayout.setVerticalGroup(
            admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admwordLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admkey, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(admwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admvalue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admrew, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admadw, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admrmw, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(admreturnforword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        adm.add(admword, "admword");

        pp.add(adm, "adm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        sel ="Login";           
        data = (sel+"////"+IDv.getText()+"////"+PWv.getText());
        pw.println(data);
    }//GEN-LAST:event_LogInActionPerformed

    private void IDvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDvActionPerformed
        sel ="Login";           
        data = (sel+"////"+IDv.getText()+"////"+PWv.getText());
        pw.println(data);
    }//GEN-LAST:event_IDvActionPerformed

    private void adwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adwordActionPerformed
        c1.show(adm, "admword");
    }//GEN-LAST:event_adwordActionPerformed

    private void admemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admemActionPerformed
        c1.show(adm, "admmem");
    }//GEN-LAST:event_admemActionPerformed

    private void adReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adReturnActionPerformed
        c.show(pp, "login");
    }//GEN-LAST:event_adReturnActionPerformed

    private void admreturnformemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admreturnformemActionPerformed
       c1.show(adm, "admmenu");
    }//GEN-LAST:event_admreturnformemActionPerformed

    private void admreturnforwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admreturnforwordActionPerformed
        c1.show(adm, "admmenu");
    }//GEN-LAST:event_admreturnforwordActionPerformed

    private void admrepwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admrepwActionPerformed
        sel = "ReWriteM";
        data = sel+"////"+FindID.getText()+"////"+admrepw.getText()
                +"////"+NameRe.getText()+"////"+EleRe.getText()+"////";
        pw.println(data);
    }//GEN-LAST:event_admrepwActionPerformed

    private void PWvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWvActionPerformed
        sel ="Login";           
        data = (sel+"////"+IDv.getText()+"////"+PWv.getText());
        pw.println(data);
    }//GEN-LAST:event_PWvActionPerformed

    private void FindIDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindIDbtnActionPerformed
        sel = "Serch";
        data = sel+"////"+FindID.getText();
        pw.println(data);
        getID.setText(FindID.getText());  
    }//GEN-LAST:event_FindIDbtnActionPerformed

    private void FindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindIDActionPerformed
        sel = "Serch";
        data = sel+"////"+FindID.getText();
        pw.println(data);
        getID.setText(FindID.getText());
    }//GEN-LAST:event_FindIDActionPerformed

    private void admanIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admanIDActionPerformed
        c1.show(adm, "admmem");
    }//GEN-LAST:event_admanIDActionPerformed

    private void NameReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameReActionPerformed
        sel = "ReWriteM";
        data = sel+"////"+FindID.getText()+"////"+admrepw.getText()
                +"////"+NameRe.getText()+"////"+EleRe.getText()+"////";
        pw.println(data);
    }//GEN-LAST:event_NameReActionPerformed

    private void EleReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleReActionPerformed
        sel = "ReWriteM";
        data = sel+"////"+FindID.getText()+"////"+admrepw.getText()
                +"////"+NameRe.getText()+"////"+EleRe.getText();
        pw.println(data);
    }//GEN-LAST:event_EleReActionPerformed

    private void admsujungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admsujungActionPerformed
        sel = "ReWriteM";
        data = sel+"////"+getID.getText()+"////"+admrepw.getText()
                +"////"+NameRe.getText()+"////"+EleRe.getText();
        pw.println(data);
    }//GEN-LAST:event_admsujungActionPerformed

    private void admkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admkeyActionPerformed
       
    }//GEN-LAST:event_admkeyActionPerformed

    private void admvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admvalueActionPerformed

    }//GEN-LAST:event_admvalueActionPerformed

    private void admrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admrewActionPerformed
        sel = "RewriteWord";
        data = sel+"////"+admkey.getText()+"////"+admvalue.getText();
        pw.println(data);
    }//GEN-LAST:event_admrewActionPerformed

    private void admadwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admadwActionPerformed
        sel = "AddW";
        data = sel+"////"+admkey.getText()+"////"+admvalue.getText();
        pw.println(data);
    }//GEN-LAST:event_admadwActionPerformed

    private void admrmwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admrmwActionPerformed
        sel = "RemoveW";
        data = sel+"////"+admkey.getText()+"////"+admvalue.getText();
        pw.println(data);
    }//GEN-LAST:event_admrmwActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheFrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheFrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheFrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheFrontMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheFrontMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EleRe;
    private javax.swing.JTextField FindID;
    private javax.swing.JButton FindIDbtn;
    private javax.swing.JTextField IDv;
    private javax.swing.JButton LogIn;
    private javax.swing.JTextField NameRe;
    private javax.swing.JTextField PWv;
    private javax.swing.JButton SignIn;
    private javax.swing.JTextArea Wshowv;
    private javax.swing.JButton adReturn;
    private javax.swing.JPanel adm;
    private javax.swing.JButton admadw;
    private javax.swing.JButton admanID;
    private javax.swing.JButton admem;
    private javax.swing.JTextField admkey;
    private javax.swing.JPanel admmem;
    private javax.swing.JPanel admmenu;
    private javax.swing.JPanel admremem;
    private javax.swing.JTextField admrepw;
    private javax.swing.JButton admreturnformem;
    private javax.swing.JButton admreturnforword;
    private javax.swing.JButton admrew;
    private javax.swing.JButton admrmw;
    private javax.swing.JButton admsujung;
    private javax.swing.JTextField admvalue;
    private javax.swing.JPanel admword;
    private javax.swing.JButton adword;
    private javax.swing.JLabel getID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel login;
    private javax.swing.JPanel pp;
    private javax.swing.JTextArea showv;
    // End of variables declaration//GEN-END:variables

public void login(){//로그인 시에 아이디나 비밀번호가 비었거나 정보가 다른경우 경고창을 띄워줌
             b=(this.e.equals("true"));
            if(IDv.getText().equals("")){
               JOptionPane.showMessageDialog(this, "아이디를 입력해주세요", "아이디입력", JOptionPane.WARNING_MESSAGE);
               IDv.setText("");
               PWv.setText("");
           }else if(IDv.getText().equals("admin")){
               if(PWv.getText().equals("")){
                JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요", "비밀번호입력", JOptionPane.WARNING_MESSAGE);  
               }
               else if(b){
               c.show(pp, "adm");
               IDv.setText("");
               PWv.setText("");
               }else{
               JOptionPane.showMessageDialog(this, "정보가 다릅니다.","비밀번호 확인",JOptionPane.WARNING_MESSAGE);
               IDv.setText("");
               PWv.setText("");
           }
           }else{
               if(PWv.getText().equals("")){
                JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요", "비밀번호입력", JOptionPane.WARNING_MESSAGE);  
           }
               else if(b){
               c.show(pp, "word");
               }else{
               JOptionPane.showMessageDialog(this, "정보가 다릅니다.","비밀번호 확인",JOptionPane.WARNING_MESSAGE);
               IDv.setText("");
               PWv.setText("");
           }
           }
}

public void serch(){
//회원정보의 수정을 위해 아이디를 검색할때, 존재하면 수정하는 화면으로 전환하고
//존재하지 않으면 아이디를 확인하라는 창을 출력
     b=(this.e.equals("true"));
     if(b){
        c1.show(adm, "admremem");
        showv.append(info);
        showv.append("\n");
        FindID.setText("");
     }else{
        JOptionPane.showMessageDialog(this, "없는 아이디 입니다.", "아이디입력", JOptionPane.WARNING_MESSAGE);
        FindID.setText("");
     }
  }

public void rewrite(){
    //회원정보가 수정된 상황을 텍스트필드에 출력
    showv.append(e);
    showv.append("\n");
    admrepw.setText("");
    NameRe.setText("");
    EleRe.setText("");
}

public void reww(){
   Wshowv.append(e);
   Wshowv.append("\n");
   admkey.setText("");
   admvalue.setText("");
}

public void addw(){
    Wshowv.append(e);
    Wshowv.append("\n");
    admkey.setText("");
    admvalue.setText("");
}

public void remw(){
    Wshowv.append(e);
    Wshowv.append("\n");
    admkey.setText("");
    admvalue.setText("");
}
//단어장의 정보가 추가 제거 수정 되었음을 알리는 메서드들
}