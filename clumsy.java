import java.util.Stack;

class Clumsy {
    public static void main(String[] args) {
        Clumsy clumsy = new Clumsy();
        System.out.println("Enter a number:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int result = clumsy.clumsy(n); // Example input
        System.out.println("Result: " + result);
    }

    public int clumsy(int n) {
        Stack<Integer> stk = new Stack<>();
        stk.push(n);
        n--;
        int index = 0;

        while (n > 0) {
            if (index % 4 == 0) {
                stk.push(stk.pop() * n);
            } else if (index % 4 == 1) {
                stk.push(stk.pop() / n);
            } else if (index % 4 == 2) {
                stk.push(n);
            } else {
                stk.push(-n);
            }
            n--;
            index++;
        }

        int ans = 0;
        while (!stk.isEmpty()) {
            ans += stk.pop();
        }
        return ans;
    }
}