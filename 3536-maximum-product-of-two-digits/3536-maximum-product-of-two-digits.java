class Solution {
    public int maxProduct(int n) {
        
     String s = Integer.toString(n);

     char[] arr=s.toCharArray();
     Arrays.sort(arr);

     int largest=arr[arr.length-1]-'0';
    int sec_largest=arr[arr.length-2]-'0';
          return largest*sec_largest;
    }
}