package homeWork2;

public class ex2 {
    public static void main(String[] args) {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{ 1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{ 1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{ 1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1,1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};
        int leftUpTorightDownsum = 0;
        int leftDownTorightUpsum = 0;
        for (int i= 0; i< arrayOfNumbers.length; i++){
            leftUpTorightDownsum += arrayOfNumbers[i][i];
            leftDownTorightUpsum +=arrayOfNumbers[i][arrayOfNumbers.length-i-1];
        }
        System.out.println(leftUpTorightDownsum);
        System.out.println(leftDownTorightUpsum);
    }
}
