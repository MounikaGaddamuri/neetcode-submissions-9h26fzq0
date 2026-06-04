/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        while(true){
            mid = start +(end - start) / 2;
            int pickedNumber = guess(mid);
            // System.out.println(pickedNumber);
            // if(pickedNumber == 0)
            //     return mid;
            if (pickedNumber < 0)
                end = mid - 1;
            else if(pickedNumber > 0)
                start = mid + 1;
            else
                return mid;
        }
    }
}
