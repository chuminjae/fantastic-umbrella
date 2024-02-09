def swap(a, x, y):
    a[x], a[y] = a[y], a[x]

a = [0] * 1001
a[0] = 1000001
n = int(input())
cnt = 1
for i in range(n):
    a[cnt] = int(input())
    d = cnt
    while a[d // 2] < a[d] and d >= 1:
        swap(a, d, d // 2)
        d = d // 2
    cnt += 1
print(a[1])
