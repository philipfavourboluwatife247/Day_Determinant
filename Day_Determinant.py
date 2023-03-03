#This code will print out the day of the week based on user input on the date 

#FORMULA
#y = y - (14 - m) / 12;
#x = y + (y / 4) - (y / 100) + (y / 400);
#m = m + 12 * ((14 - m) / 12) - 2;
#d = (d + x + (31 * m) / 12) % 7;
print("")
print("")
print("Welcome to the fastest way to get the day of the week of any occurence based on your input of the date. Viola!")
print("")
print("")
day = input("Enter the numeric value of the day: ")
print("")
month = input("Enter the numeric value of the month: ")
print("")
year = input("Enter the numeric value of the year: ")
y = int(int(year) - (14 - int(month)) / 12)
x = int(y + (y / 4) - (y / 100) + (y / 400))
m = int(int(month) + 12 * ((14 - int(month)) / 12) - 2)
d = int((int(day) + x + (31 * m) / 12) % 7)
print("")
print("")
#print(f"{y} {x} {m} {d}")
if d == 0:
    print(f"Gregorian calendar says that {day}/{month}/{year} is on Sunday.")

elif d == 1:
        print(f"Gregorian calendar says that {day}/{month}/{year} is on Monday.")

elif d == 2:
        print(f"Gregorian calendar says that {day}/{month}/{year} is on Tuesday.")

elif d == 3:
        print(f"Gregorian calendar says that {day}/{month}/{year} is on Wednesday.")

elif d == 4:
        print(f"Gregorian calendar says that {day}/{month}/{year} is on Thursday.")

elif d == 5:
        print(f"Gregorian calendar says that {day}/{month}/{year} is on Friday.")

elif d == 6:
        print(f"Gregorian calendar says that {day}/{month}/{year} is on Saturday.")
