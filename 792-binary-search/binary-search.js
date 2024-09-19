/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 // function name = search compulsory
function search(nums, target) {
    let left = 0,
    right = nums.length -1;


    while (left <= right) {
        let middle = left + Math.floor((right - left) / 2);
        if (nums[middle] === target) {
            return middle;
        } else if (nums[middle] < target) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        
    }
    return -1;
};

console.log(search([-1,0,3,5,9,12], 9));