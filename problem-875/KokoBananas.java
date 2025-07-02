public class KokoBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hoursNeeded = getTotalHours(piles, mid);

            if (hoursNeeded <= h) {
                result = mid;  // Try a smaller k
                right = mid - 1;
            } else {
                left = mid + 1;  // Need to eat faster
            }
        }

        return result;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private int getTotalHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  // Same as ceil(pile / k)
        }
        return hours;
    }

    // Example usage
    public static void main(String[] args) {
        KokoBananas kb = new KokoBananas();

        int[] piles1 = {3, 6, 7, 11};
        System.out.println("Output 1: " + kb.minEatingSpeed(piles1, 8)); // 4

        int[] piles2 = {30, 11, 23, 4, 20};
        System.out.println("Output 2: " + kb.minEatingSpeed(piles2, 5)); // 30

        int[] piles3 = {30, 11, 23, 4, 20};
        System.out.println("Output 3: " + kb.minEatingSpeed(piles3, 6)); // 23
    }
}
