class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int x = stack.pop();
                int y = stack.peek();
                int z = x+y;
                stack.push(x);
                stack.push(z);
            }
            else if(operations[i].equals("D")){
                int k = stack.peek();
                stack.push(2*k);            
            }
            else if(operations[i].equals("C")){
                stack.pop();         
            }
            else{
                int w = Integer.valueOf(operations[i]);
                stack.push(w);
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}