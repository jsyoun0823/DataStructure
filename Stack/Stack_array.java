public class Stack_array {
    private int size;

    private int top;
    private int[] stack;

    public Stack_array(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public void push(int data) {
        if(isFull()) {
            throw new IllegalStateException("스택이 꽉 찼습니다");
        }

        stack[++top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("스택이 비어있습니다..");
            return -1;
        }

        return stack[this.top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

        // 스택 꽉차면 사이즈 늘려주기
        // junit 써서 테스트 코드 만들기
}
