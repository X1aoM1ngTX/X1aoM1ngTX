# 练习
name = "XM"
stock_price = 9.99
stock_code = "007274"
stock_price_daily_growth_factor = 1.2
growth_days = 7
stock_price_now = stock_price * stock_price_daily_growth_factor ** (growth_days - 1)
print(f"公司：{name}，股价代码：{stock_code}，今日股价：{stock_price}")
print('今天是第%d天，增长系数：%.1f，股票为：%.2f' % (growth_days, stock_price_daily_growth_factor, stock_price_now))

# 语句
num1 = input("请输入第一个数字：")
num1 = int(num1)                             # input输入字符串类型<str> 要转换成<float><int>
num2 = input("请输入第二个数字：")
num2 = int(num2)
num3 = num1 * num2
print(f"{num1} 乘 {num2} 等于 {num3}")

# input练习
user_name = input("请输入用户名：")
user_password = input("请输入密码：")
user_password = int(user_password)
print(f"登陆成功，你好{user_name}")
