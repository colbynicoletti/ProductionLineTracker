package productlinetracker;

public class Employee {
  private StringBuilder name;
  private String username;
  private String password;
  private String email;

  private void setName(StringBuilder name){

  }

  private void setUsername(String username){
    this.username = username;
  }

  private void createUsername(StringBuilder name){

  }

  private boolean checkName(StringBuilder name){
    String[] arraySplit = name.toString().split(" ");
    return arraySplit.length != 1;
  }
}
