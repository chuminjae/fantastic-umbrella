cnt = 0
def check(c, a, aa):
    global cnt
    if c == 2:
        if sum(aa) == 13:
            cnt += 1
    else:
        for i in range(10):
            if not a[i]:
                a[i] = True
                aa[c] = i
                check(c + 1, a, aa)
                a[i] = False

def main():
    global cnt
    a = [False] * 11
    aa = [0] * 2
    check(0, a, aa)
    print(cnt)

if __name__ == "__main__":
    main()
