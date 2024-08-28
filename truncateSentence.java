class Solution {
    public String truncateSentence(String s, int k) {
        String [] words= s.split(" ");

        // Append the first k words to the StringBuilder
        StringBuilder b = new StringBuilder();

 // Append the first k words to the StringBuilder
        for(int i =0;i<k;i++){
            b.append(words[i]);
            if(i<k-1){
                b.append(" ");
            }
        }
        return b.toString();
    }
}
