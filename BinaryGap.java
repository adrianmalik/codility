class BinaryGap {
    
    public int solution(int number) {
        int maxGap = 0;
        int currentGap = 0;
        char[] bits = Integer.toBinaryString(number).toCharArray();
        boolean isOpenBit = false;
        
        for (char bit: bits) {
            if (bit == '1') {
                if (isOpenBit) { 
                    currentGap = 0;
                } else { 
                    isOpenBit = true;    
                }
            } else if (isOpenBit && bit == '0') {
                if (maxGap < ++currentGap) {
                    maxGap = currentGap;    
                }
            }
        }

        return maxGap;
    }
}
