n = int(input())
a = [0] * 100000

# Input and count occurrences of each element
for _ in range(n):
    x = int(input())
    a[x] += 1

# Print the sorted array
for i in range(100000):
    while a[i] != 0:
        print(i)
        a[i] -= 1
