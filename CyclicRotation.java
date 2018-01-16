class Solution {
    
    public int[] solution(int[] array, int shift) {
        if (shift > array.length) {
            shift = shift % array.length;    
        }
        if (shift == 0) {
            return array;
        }
        
        int[] shiftedArray = new int[array.length];
        
        System.arraycopy(array, 0, shiftedArray, shift, array.length - shift);
        System.arraycopy(array, array.length - shift, shiftedArray, 0, shift);
        
        return shiftedArray;
    }
    
}
