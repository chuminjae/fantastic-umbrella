//// Class import 해와서 쓰기
import java.util.Stack;

class StackEx {
    public static void main(String[] args) {
        // Integer형 스택 선언
        Stack<Integer> stackInt = new Stack<>();

        // 값 추가 push()
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        // 1, 2, 3 순으로 값 추가

        // 값 제거
        stackInt.pop();
        stackInt.pop();
        stackInt.pop();
        // 3, 2, 1 순으로 값 제거

        // 값 추가 add()
        stackInt.add(1);
        stackInt.add(2);
        stackInt.add(3);
        // 1, 2, 3 순으로 값 추가

        // 값 모두 제거
        stackInt.clear();
    }
}

