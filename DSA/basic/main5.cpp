#include <iostream>
using namespace std;

int findFactorial(int number)
{
    if (number == 0 || number == 1)
        return 1;

    int factorial = 1;

    for (int i = 2; i <= number; i++)
        factorial *= i;

    return factorial;
}

int main()
{
    cout << "Enter a number to find factorial " << endl;
    int number;
    cin >> number;

    int factorial = findFactorial(number);
    cout << factorial << endl;

    return 0;
}