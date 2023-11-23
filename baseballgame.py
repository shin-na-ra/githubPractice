aNum = input("원하는 3개를 입력하세요 : ").split(" ")


count = 0
a = []
b = []
print("\n")
while True :
    
    bNum = input("A의 예상 숫자 3개를 입력하세요 : ").split(" ")
    
    # 중복되는 숫자가 있는지 확인
    a_check = (aNum[0] == aNum[1]) or (aNum[0] == aNum[2]) or (aNum[1] == aNum[2])
    b_check = (bNum[0] == bNum[1]) or (bNum[0] == bNum[2]) or (bNum[1] == bNum[2])
    
    # 숫자가 3개인지 확인
    if len(aNum) != 3 or len(bNum) != 3 :
        print("\n정확한 숫자 갯수를 입력하세요.")
    
    elif a_check or b_check:
        print("\n숫자가 중복되지 않게끔 입력해주세요.")

    b = []
    
    for num in range(len(aNum)):
        # 리스트를 int로 타입 전환
        a1 = aNum[int(num)]
        b2 = bNum[int(num)]

        # int로 타입 전환한 것들을 새로운 리스트에 저장
        a.append(a1)
        b.append(b2)


    #삼진 아웃
    strike3 = a[0] == b[0] and a[1] == b[1] and a[2] == b[2]

    # 2스트라이크
    strike2 = (a[0] == b[0] and a[1] == b[1]) or (a[0] == b[0] and a[2] == b[2]) or (a[1] == b[1] and a[2] == b[2])

    # 1스트라이크
    strike1 = (a[0] == b[0]) or (a[1] == b[1]) or (a[2] == b[2])

    # 3볼
    ball3 = (b[0] in a and b[1] in b and b[2] in a)

    # 2볼
    ball2 = (b[0] in a and b[1] in a) or (b[0] in a and b[2] in a) or (b[1] in a and b[2] in a)

    # 1볼
    ball1 = (b[0] in a) or (b[1] in a) or (b[2] in a)
    
    if strike3 :
    # if (a[0] == b[0] and a[1] == b[1]) or (a[0] == b[0] and a[2] == b[2]) or (a[1] == b[1] and a[2] == b[2]):
        print("game over")
        break

    elif strike2 :
        print("2 strike")
    
    elif strike1 :
        # 1스트라이크 데이터를 제외하고 나머지 숫자가 숫자안에 포함되어 있니?
        if (a[0] == b[0]) :
            ball2_1 = (b[1] in a and b[2] in a)
            ball1 = (b[1] in a) or (b[2] in b)
        elif (a[1] == b[1]) :
            ball2_1 = (b[0] in a and b[2] in a)
            ball1 = (b[0] in a) or (b[2] in b)
        elif (a[2] == b[2]) :
            ball2_1 = (b[0] in a and b[1] in a)
            ball1 = (b[0] in a) or (b[1] in b)
                
        if ball2_1 :
            print("1 strike 2 balls")

        elif ball1 :
            print("1 strike 1 ball")
        

    elif ball3 :
        print("3 balls")
    elif ball2 :
        print("2 balls")
    elif ball1 :
        print("1 ball")
    else :
        print("out")