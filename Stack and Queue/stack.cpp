//C++에서는 기본적으로 stack 자료구조를 지원한다 -- STLstack
//header에 #include <stack> 추가 (STL stack일 경우)
//queue <데이터 타입> 이름;

#include <iostream>
#include <stack>

using namespace std;

int main(int args , char** argv){
    stack<int> s;

    s.push(1);
    s.push(2);
    s.push(3);
    cout << "empty(0 is not empty, 1 is empty) : " << s.empty() << endl;
    cout << "size : " << s.size() << endl;
    cout << "stack values : ";
    while(!s.empty()){
        cout << s.top() << ' ';
        s.pop();
    }
    cout << "\n" << "empty(0 is not empty, 1 is empty): " << s.empty() << endl ;    
}









////////Array를 통한 구현
#include <iostream>

using namespace std;

struct Stack{
    // 스택의 크기를 나타내는 N
    // 스택의 값 저장소 arr
    int N = -1;
    int * arr;
};
using stack = Stack *;

// 1) empty
// stack s 가 비어있다면 true를 , 아니라면 false 를 출력.
bool empty(stack s){
    return (s->N == -1) ? true : false;
}
// 2) push
// stack s 에 num 값을 집어넣음.
void push (stack s , int num){
    s->arr[++s->N] = num;
}
// 3) pop
// stack s에서 가장 최근에 들어온 값을 뺌.
void pop (stack s){
    if(empty(s)){
        cout << "It doesn't work. stack is empty" << "\n";
    }
    else{
        s->N--;
    }
}
// 4) top
// stack s 에서 가장 최근에 들어온 값을 출력.
int top(stack s){
    if(empty(s)){
        return -1;
    }
    return s->arr[s->N];   
}
// 5) size
// stack s 의 크기를 출력.
int size(stack s){
    return s->N+1;
}