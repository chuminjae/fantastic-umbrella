n = int(input())
a = list(map(int, input().split()))

a.sort()
cnt = sum(a[i] * (n - i) for i in range(n))

print(cnt)
