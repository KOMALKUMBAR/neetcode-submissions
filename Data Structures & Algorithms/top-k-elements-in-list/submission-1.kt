class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val map = HashMap<Int, Int>()

        for (num in nums) {
            /*num =1*/
            map[num] = map.getOrDefault(num, 0) + 1
            /*1 =map .getorDefault(1,0)+1 1=1*/
        }

        val sorted = map.entries.sortedByDescending { it.value }

        val result = IntArray(k)

        for (i in 0 until k) {
            result[i] = sorted[i].key
        }

        return result
    }
}
