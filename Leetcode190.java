public class Leetcode190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binaryStr = Integer.toBinaryString(n);
        List<Integer> numArr = new ArrayList<>();

        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            numArr.add(binaryStr.charAt(i) - '0');
        }
        for (int j = 0; j < (32 - binaryStr.length()); j++) {
            numArr.add(0);
        }
        int num = 0;
        for (int item : numArr) {
            num = num * 2 + item;
        }
        return num;
    }
}