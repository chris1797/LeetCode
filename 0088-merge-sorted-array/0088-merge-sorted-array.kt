class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var idx = m + n - 1
        var mIdx = m - 1
        var nIdx = n - 1
        var temp = 0

        while (nIdx >= 0) {
            if (mIdx >= 0 && nums1[mIdx] > nums2[nIdx]) {
                nums1[idx] = nums1[mIdx]
                mIdx--
            } else {
                nums1[idx] = nums2[nIdx]
                nIdx--
            }
            idx--
        }
    }
}