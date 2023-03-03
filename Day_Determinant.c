/*
 * Auth: Philip Favour B.
 * File: Day_Determinant.c
 */

/* #This code will print out the day of the week based on user input on the date

#FORMULA                                    #y = y - (14 - m) / 12;
#x = y + (y / 4) - (y / 100) + (y / 400);
#m = m + 12 * ((14 - m) / 12) - 2;
#d = (d + x + (31 * m) / 12) % 7;
*/
#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[])
{
	int day, month, year;
	int y, x, m, d;

	printf("\n");
	printf("\n");

	printf("Welcome to the fastest way to get the day of the week of any occurence based on your input of the date. Viola!\n");

	printf("\n");
	printf("\n");

	printf("Enter the numeric value of the day: \n");
	scanf("%d", &day);

	printf("\n");

	printf("Enter the numeric value of the month: \n");
        scanf("%d", &month);

	printf("\n");

	printf("Enter the numeric value of the year: \n");
        scanf("%d", &year);

	y = year - (14 - month) / 12;
	x = y + (y / 4) - (y / 100) + (y / 400);
	m = month + 12 * ((14 - month) / 12) - 2;
	d = (day + x + (31 * m) / 12) % 7;
	printf("\n");
	printf("\n");

	//printf("%d %d %d %d\n", y, x, m, d);
	if (d == 0)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Sunday.\n", day, month, year);
	}
	else if (d == 1)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Monday.\n", day, month, year);
	}
	else if (d == 2)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Tuesday.\n", day, month, year);
	}
	else if (d == 3)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Wednesday.\n", day, month, year);
	}
	else if (d == 4)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Thursday.\n", day, month, year);
	}
	else if (d == 5)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Friday.\n", day, month, year);
	}
	else if (d == 6)
	{
		printf("Gregorian calendar says that %d/%d/%d is on Saturday.\n", day, month, year);
	}
	return EXIT_SUCCESS;
}
