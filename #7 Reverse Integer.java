class Solution {
    public int reverse(int x) {
        try {
            boolean xIsNegative = (x < 0);
            if (xIsNegative) {
                x = Math.abs(x);
            }
            String num = String.valueOf(x);
            char[] chs = num.toCharArray();
			
            for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
                char temp = chs[i];
                chs[i] = chs[j];
                chs[j] = temp;
	    	}
                
            String revNum = new String(chs);
                
            if (xIsNegative) {
                revNum = "-" + revNum;
            }
                
            return Integer.parseInt(revNum);
		}
       	catch(Exception e) {
            return 0;
		}
    }
}
