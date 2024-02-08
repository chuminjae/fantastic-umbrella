class Stack:
    #리스트를 이용한 스택 구현
    def __init__(self):
        self.top = []
    #스택 크기 반환
    def __len__(self) -> bool :
        return len(self.top)
    
    #구현함수
    #스택에 원소 삽입
    def push(self, item):
        self.top.append(item)
    #스택 가장 위에 있는 원소를 삭제하고 반환   
    def pop(self):
        if not self.isEmpty():
            return self.top.pop(-1)
        else:
            print("Stack underflow")
            exit()
    #스택 가장 위에 있는 원소를 반환
    def peek(self):
        if not self.isEmpty():
            return self.top[-1]
        else:
            print("underflow")
            exit()
    #스택이 비어있는 지를 bool값으로 반환
    def isEmpty(self) -> bool :
        return len(self.top)==0
    



###### Dequeue 라이브러리를 사용해서 스택을 구현 할 수 있다.
dq=deque() # 덱 생성
dq.append() # 덱의 가장 오른쪽에 원소 삽입
dq.popleft() # 가장 왼쪽 원소 반환
dq.appendleft() # 덱의 가장 왼쪽에 원소 삽입
dp.pop() # 가장 오른쪽 원소 반환
dp.clear() # 모든 원소 제거
dp.copy() # 덱 복사
dp.count(x) #x와 같은 원소의 개수를 계산