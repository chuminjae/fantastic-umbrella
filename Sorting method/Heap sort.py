def swap(arr, x, y):
    arr[x], arr[y] = arr[y], arr[x]

# Function to perform heap sort
def heap_sort(arr):
    n = len(arr)
    # Build max heap
    for i in range(1, n):
        d = i
        while d > 0 and arr[d // 2] < arr[d]:
            swap(arr, d, d // 2)
            d //= 2
    
    # Heap sort
    for j in range(n):
        i = 1
        swap(arr, i, n - j)
        cnt = n - j - 1
        while True:
            h, p = 0, 0
            if i * 2 <= cnt and arr[i] < arr[i * 2]:
                h = arr[i * 2]
            if i * 2 + 1 <= cnt and arr[i] < arr[i * 2 + 1]:
                p = arr[i * 2 + 1]
            if h > p and h != 0:
                swap(arr, i, i * 2)
                i = i * 2
            elif h <= p and p != 0:
                swap(arr, i, i * 2 + 1)
                i = i * 2 + 1
            else:
                break

# Input
n = int(input())
arr = list(map(int, input().split()))

# Set arr[0] to maximum integer value
arr.insert(0, float('inf'))

# Perform heap sort
heap_sort(arr)

# Output the sorted array
print(*arr[1:])
