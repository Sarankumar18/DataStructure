class Solution {
  public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low = 0;
        int high = people.length - 1;
        int boat = 0;
        while (low <= high) {
            if (people[low] + people[high] <= limit) {
                // If both the lightest and heaviest people can fit in the boat, pair them up
                low++;
                high--;
            } else {
                // If only the heaviest person fits, put them in the boat
                high--;
            }
            boat++; // Put the pair or single person in a boat
        }
        return boat;
    }


}