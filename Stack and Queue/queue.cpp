//C++에서는 기본적으로 queue 자료구조를 지원한다 -- STLqueue
//header에 #include <queue> 추가 (STL queue일 경우)
//queue <데이터 타입> 이름;

//iostream만 사용해서 queue구현하기
#include<iostream>

using namespace std;

template <typename T>

class queue {
private:
	T* arr;								//큐 원소 넣는 배열
	int q_size;							//큐의 사이즈
	int frontCursor;					//큐의 front가리키는 커서
	int rearCursor;						//큐의 back가리키는 커서

public:
	queue() {							//초기화
		q_size = 0;
		arr = new T[10'000];
		frontCursor = 5'000;
		rearCursor = 5'000;
	}
	~queue() {
		delete[] arr;
	}

	void push(T elem){						//원소 넣기
		arr[rearCursor] = elem;
		rearCursor++;
        q_size++;

	}
	void pop(T elem){						//원소 빼기
		if (q_size!=0) {						//비어있지 않을 때
			arr[frontCursor] = 0;
			frontCursor++;
            q_size--;
		}
		else {
			cout << "큐가 비어있습니다." << '\n';
		}
	}
	T front(){								//큐의 제일 앞 값(먼저 빠짐)
		return arr[frontCursor];
	}
	T back(){								//큐의 제일 뒷 값
		return arr[rearCursor-1];
	}
	bool empty(){							//큐가 비어있는지 여부
		if (q_size==0)
			return true;
		else return false;
	}
	int size(){								//큐의 크기
		return q_size;
	}
};


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
