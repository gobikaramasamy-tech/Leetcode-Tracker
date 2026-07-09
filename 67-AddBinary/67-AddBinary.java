// Last updated: 7/9/2026, 3:19:16 PM
class Solution {
    public String addBinary(String a, String b) {
        int i= a.length() - 1,j=b.length()-1,carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0||j>=0||carry ==1){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i--)- '0';
            if(j>=0) sum+=b.charAt(j--)- '0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }
}