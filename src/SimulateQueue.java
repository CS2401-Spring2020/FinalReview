
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
	  while(s.getSize() > 1) {
	    temp.push(s.pop());
	  }
	  
	  int rtn = s.pop();
	  // s should be empty
	  assert(s.isEmpty());
	  
	  while(!temp.isEmpty()) {
	    s.push(temp.pop());
	  }
	  
	  return rtn;
	}
	
	public boolean isEmpty() { return s.isEmpty(); }
	public int getSize() { return s.getSize(); }
	
	public void reverse() {
	  // base case
	  if(getSize() <= 1) return;
	  
	  int save = dequeue();
	  reverse();
	  enqueue(save);
	}
}
