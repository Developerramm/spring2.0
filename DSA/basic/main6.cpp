#include <iostream>
using namespace std;

bool checkPrimeNumber(int number)
{
    if (number == 1 || number == 2)
        return true;

    for (int i = 2; i < number; i++)
    {
        if (number % i == 0)
            return false;
    }

    return true;
}

int main()
{

    cout << "Enter a number to check prime : " << endl;
    int number;
    cin >> number;

    bool ans = checkPrimeNumber(number);

    if (ans)
    {
        cout << "Prime number " << endl;
    }
    else
    {
        cout << "Not a prime number " << endl;
    }

    return 0;
}