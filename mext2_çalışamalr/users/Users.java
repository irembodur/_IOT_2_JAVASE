package mext2_çalışamalr.users;

public class Users {
    public String userName;
    private String password;
    private int age;
    private String name;


    public Users(String userName, String name, String password, int age){
        this.userName = userName;
        this.age=age;
        this.password = password;
        this.name = name;
    }

    public  String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public  String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
