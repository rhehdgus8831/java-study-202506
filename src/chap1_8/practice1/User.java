package chap1_8.practice1;

public class User extends Messenger{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message){
        System.out.printf("[사용자] %s: %s \n",name,message);
    }
}
