def f(a, p):
    if a > p:
        return

    print(b[a], end="")
    f(a * 2, p)
    f(a * 2 + 1, p)

if __name__ == "__main__":
    b = input()
    b = "0" + b
    print(b)
    f(1, len(b) - 1)
