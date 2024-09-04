# 单if语句
num1 = 5
num2 = int(input("数字1为 5 ，请输入数字2："))
if num2 > num1:
    print(f"{num2}大于5")  # 成立执行语句，不成立则没有操作

# if-else语句
num1 = 5
num2 = int(input("数字1为 5 ，请输入数字2："))
if num2 >= num1:
    print(f"{num2}大于等于5")  # num2 >= num1成立 执行该语句
else:
    print(f"{num2}小于5")  # num2 >= num1不成立 执行该语句

# if-elif-else语句
num1 = int(input("请输入数字1："))
num2 = int(input("请输入数字2："))
if num1 > num2:
    print(f"{num1}>{num2}")
elif num1 == num2:  # 可以有多个elif条件
    print(f"{num1}={num2}")
else:
    print(f"{num1}<{num2}")

# 嵌套
age = int(input("请输入年龄："))
if age > 0:
    if age <= 18:
        print("你未成年")
    else:
        print("你已成年")
else:
    print("年龄必须大于0")

# 练习
import random
num_random = random.randint(1, 100)
print(num_random)
num_guess = int(input("输入数字"))
if num_guess == num_random:
    print("猜中了")
else:
    if num_guess > num_random:
        print("大了")
    else:
        print("小了")

    num_guess = int(input("输入数字"))
    if num_guess == num_random:
        print("猜中了")
    else:
        if num_guess > num_random:
            print("大了")
        else:
            print("小了")

        num_guess = int(input("输入数字"))
        if num_guess == num_random:
            print("猜中了")
        else:
            if num_guess > num_random:
                print("大了")
            else:
                print("小了")