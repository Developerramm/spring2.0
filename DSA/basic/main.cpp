#include <iostream>
using namespace std;

int sumOfEvenNumber(int number)
{
    int sum = 0;

    for (int i = 0; i <= number; i++)
    {
        sum += i;
    }

    return sum;
}

int main()
{

    int n;
    cout << "Enter a number to get sum " << endl;
    cin >> n;

    int getSumOfEvenNumber = sumOfEvenNumber(n);

    cout << getSumOfEvenNumber << endl;

    return 0;
}