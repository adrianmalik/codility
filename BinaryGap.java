public class BinaryGap {
    
    public int solution(int number) {
        int maxGap = 0;
        int currentGap = 0;
        char[] bits = Integer.toBinaryString(number).toCharArray();
        boolean isOpenBit = false;
        
        for (char bit: bits) {
            if (bit == '1') {
                if (isOpenBit) { 
                    if (maxGap < currentGap) {
                        maxGap = currentGap;    
                    }
                    
                    currentGap = 0;
                } else { 
                    isOpenBit = true;    
                }
            } else if (isOpenBit && bit == '0') {
                currentGap++;
            }
        }

        return maxGap;
    }
}
