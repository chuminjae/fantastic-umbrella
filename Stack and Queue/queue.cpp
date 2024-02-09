//C++에서는 기본적으로 queue 자료구조를 지원한다 -- STLqueue
//header에 #include <queue> 추가 (STL queue일 경우)
//queue <데이터 타입> 이름;
///// STL Queue

#include <iostream>
#include <queue>

using namespace std;

int main(void) {
    queue<int>Q; // 비어있는 int타입의 queue 선언
    Q.push(1); // 1
    Q.push(2); // 1 2
    Q.push(3); // 1 2 3
    Q.pop(); // 1 2
    Q.size(); // queue의 크기를 반환
    Q.front(); // queue 가장 상단 원소 값 반환
    Q.back(); // queue 가장 아래 원소 값 반환
}

//큐가 비어있는데 pop() 함수를 호출하면 런타임 에러가 발생한다
