# 파이썬에는 큐 모듈 자체가 있어서 queue모듈을 import 해온뒤에 사용할수 있다.
# Queue 모듈에서는 queue, PriorityQueue (우선순위큐), LifoQueue (스택) 을 지원한다.


###Queue 구현

qlist = []

def enqueue(qlist, data): #Queue에 원소 하나 추가
    qlist.append(data)

def dequeue(qlist): #Queue에서 원소 제거
    data = qlist[0]
    del qlist[0]
    return data

### Queue() 쓰기

import queue

Q = queue.Queue()
Q.put(1) # 1
Q.put("could_dragon") # 1 cloud_dragon
Q.qsize() # 2
Q.get() # 1
Q.qsize() # 1
