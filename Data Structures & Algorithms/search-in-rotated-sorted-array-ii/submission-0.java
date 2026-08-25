class Solution {

    public boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }

        // Pivot itself is target
        if (target == nums[pivot]) {
            return true;
        }

        // Search left sorted portion
        if (target >= nums[0]) {

            int result = binarySearch(nums, target, 0, pivot - 1);

            return result != -1;
        }

        // Search right sorted portion
        int result = binarySearch(nums, target, pivot + 1, nums.length - 1);

        return result != -1;
    }


    int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;

                if (end > start && arr[end - 1] > arr[end]) {
                    return end - 1;
                }

                end--;
            }

            else if (
                arr[start] < arr[mid]
                ||
                (arr[start] == arr[mid] && arr[mid] > arr[end])
            ) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }


    int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}