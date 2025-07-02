package chap1_8.practice1;

public class Admin extends Messenger{

    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message){
        System.out.printf("[관리자] %s: %s \n",name,message);
    }
}
