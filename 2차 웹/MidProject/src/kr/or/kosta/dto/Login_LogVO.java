package kr.or.kosta.dto;

public class Login_LogVO {
   
   private int loginlog_number, member_number;
   private String loginlog_login, loginlog_logout;
   
   public int getLoginlog_number() {
      return loginlog_number;
   }
   public void setLoginlog_number(int loginlog_number) {
      this.loginlog_number = loginlog_number;
   }
   public int getMember_number() {
      return member_number;
   }
   public void setMember_number(int member_number) {
      this.member_number = member_number;
   }
   public String getLoginlog_login() {
      return loginlog_login;
   }
   public void setLoginlog_login(String loginlog_login) {
      this.loginlog_login = loginlog_login;
   }
   public String getLoginlog_logout() {
      return loginlog_logout;
   }
   public void setLoginlog_logout(String loginlog_logout) {
      this.loginlog_logout = loginlog_logout;
   }
   
   

}