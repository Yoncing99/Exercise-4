class QuestionOne {
	private int count;
	
	public QuestionOne(){
		count = 1;
	}
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
}
public class Q1 {
	public static void main (String []arg) {
		QuestionOne q1;
		q1 = new QuestionOne();
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}
