#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
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
    return temp;
    }
};

int main(int argc, char const *argv[])
{
    Solution solution;
    vector<int> nums = {3, 3, 1, 4, -2};
    int target = 5;
    vector<int> result = solution.twoSum(nums, target);
    for (int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }
   cout << endl;
   getchar();
    return 0;
    return 0;
}
