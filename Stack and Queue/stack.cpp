//C++에서는 기본적으로 stack 자료구조를 지원한다 -- STLstack
//header에 #include <stack> 추가 (STL stack일 경우)
//queue <데이터 타입> 이름;

# include <bits/stdc++.h>
using namespace std;
int main(){
    stack<int> s;
    s.push(1); //1
    s.push(2); // 2 1
    s.push(3); // 3 2 1 
    cout << "empty(0 is not empty, 1 is empty) : " << s.empty() << endl;
    cout << "size : " << s.size() << endl; // stack안에 들어있는 원소의 개수
    cout << "stack values : ";
    while(!s.empty()){
        cout << s.top() << ' '; // 탑은 3 2 1 순으로 바꿈
        s.pop(); // top에 있는 원소를 제거
    }
    cout << "\n" << "empty(0 is not empty, 1 is empty): " << s.empty() << endl ;    
}
