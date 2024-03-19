#include <iostream>
#include <vector>
using namespace std;

vector<int> twoSum(vector<int> &nums, int target);
void xuatMang(vector<int> a);

int main(int argc, char const *argv[])
{
    // vector<int> nums = {8, 7, 2};
    // int target = 9;
    // vector<int> result = twoSum(nums, target);

    // xuatMang(result);
    getchar();



    return 0;
}

void xuatMang(vector<int> a)
{

    for (int i = 0; i < a.size(); i++)
    {
        cout << a[i] << " ";
    }
}

vector<int> twoSum(vector<int> &nums, int target)
{
    vector<int> temp = {};
    for (int i = 0; i < nums.size(); i++)
    {
        int test = nums[i];

        for (int j = i + 1; j < nums.size(); j++)
        {
            if (target - nums[j] == test)
            {
                temp.push_back(i);
                temp.push_back(j);
                return temp;
            }
        }
    }
};