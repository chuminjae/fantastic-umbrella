import math

def count(a):
    b = 1
    while a // 10 != 0:
        a //= 10
        b += 1
    return b

def count1(a, c):
    x = 10 ** (c - 1)
    a //= x
    return a % 10

def radix_sort(arr):
    n = len(arr)
    max_val = max(arr)
    cnt = count(max_val)
    q = [[] for _ in range(10)]
    
    for j in range(1, cnt + 1):
        for num in arr:
            q[count1(num, j)].append(num)
        
        p = 0
        for k in range(10):
            while q[k]:
                arr[p] = q[k].pop(0)
                p += 1
    
    return arr

if __name__ == "__main__":
    n = int(input("Enter the number of elements: "))
    arr = list(map(int, input("Enter the elements separated by space: ").split()))

    sorted_arr = radix_sort(arr)

    print("Sorted array:", sorted_arr)
