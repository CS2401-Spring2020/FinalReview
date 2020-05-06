
public class SimulateQueue {
	Stack s;
	
	SimulateQueue(){
		s = new Stack();
	}
	
	public void enqueue(int in) {
		s.push(in);
	}
	
	public int dequeue() {
		Stack temp = new Stack();
		while(s.getSize() > 1) temp.push(s.pop());
		int rtn = s.pop();
		while(!temp.isEmpty()) s.push(temp.pop());
		return rtn;
	}
	
	public boolean isEmpty() { return s.isEmpty(); }
	
	public void reverse() {
		if(!isEmpty()) {
			int temp = dequeue();
			reverse();
			enqueue(temp);
		}
	}
}
