package chap1_10.inter;

// 인터페이스에서 상속은 implements
public class Rabbit implements Pet,Wild{

    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }
}
