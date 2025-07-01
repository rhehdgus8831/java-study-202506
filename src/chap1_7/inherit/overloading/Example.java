package chap1_7.inherit.overloading;

public class Example {
    /*
    *  # 매서드 오버로딩
       : 하나의 클래스 안에서 이름이 같은 메서드를 여러 개 만드는 것
        - 규칙
        1. 파라미터의 타입이 다를 것!
        2. 파라미터의 순서가 다를 것!
        3. 파라미터의 갯수가 다를 것!
        4. 리턴타입이나 접근 제어자는 아무 영향을 주지 않는다.
    */

    void add(){
        System.out.println();
    }
    void add(int x){}
    // void add(int ttt){}
    void add(double x){}
    void add(int x,int y){}
    void add(int x,double y){}
    void add(double x,int y){}
/*    double add(double x,int y){
        return x+y;
    }
*/

    // 사각형의 넓이를 구하는 메서드
    int calcRectArea(int width, int height){
        return width*height;
    }
    int calcRectArea(int height){
        return height*height;
    };

    public static void main(String[] args) {

        Example ex = new Example();
        int result1 = ex.calcRectArea(10, 20);
        System.out.println("result1 = " + result1);

        int result2 = ex.calcRectArea(30);
        System.out.println("result2 = " + result2);
    }

}
