#include <iostream>
using namespace std;

int getReverseInteger(int number)
{

    int reverseInteger = 0;
    int remainder;

    while (number != 0)
    {
        remainder = number % 10;
        reverseInteger = reverseInteger * 10 + remainder;
        number = number / 10;
    }

    return reverseInteger;
}

int main()
{

    cout << "Enter a number to reverse it " << endl;
    int number;
    cin >> number;

    int reverseNumber = getReverseInteger(number);

    cout << reverseNumber << endl;

    return 0;
}