class Solution {
    public int totalFruit(int[] fruits) {
        int windowStart =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFruit = 0;
        for(int windowEnd = 0; windowEnd < fruits.length; windowEnd++){
            int lastFruit = fruits[windowEnd];
            map.put(lastFruit, map.getOrDefault(lastFruit, 0 ) + 1);

            while(map.size() > 2){
                int startFruit = fruits[windowStart];
                map.put(startFruit, map.get(startFruit) -1);
                if(map.get(startFruit) == 0){
                    map.remove(startFruit);
                }
                windowStart++;
            }
            
            maxFruit = Math.max(maxFruit, windowEnd - windowStart + 1);
        }

        return maxFruit;
    }
}