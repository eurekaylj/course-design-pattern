package exp3.t2;

import java.util.Stack;

public class AddCommand extends AbstractCommand {
    // 存有当前结果
    private Adder adder = new Adder();
    // 返回栈，用来记录所做的每一步操作，用于撤回
    private Stack<Integer> undoStack = new Stack<Integer>();
    // 重复栈，用来存储返回栈弹出的数据，由于重复
    private Stack<Integer> redoStack = new Stack<Integer>();

    @Override
    public int execute(int value) {
        int tmp = 0;
        // + value
        tmp = adder.add(value);
        // value的值放入undoStack
        undoStack.push(value);
        // 清空redoStack
        if (!redoStack.isEmpty()) {
            redoStack.clear();
        }
        return tmp;
    }

    @Override
    public int undo() {
        int tmp = -1;
        int i = 0;
        if (!undoStack.isEmpty()) {
            // pop出undoStack第一个值放到redoStack
            i = undoStack.pop();
            redoStack.push(i);
            tmp = adder.add(-i);
        }
        return tmp;
    }

    @Override
    public int redo() {
        int tmp = -1;
        int i = 0;
        if (!redoStack.isEmpty()) {
            // pop出redoStack第一个值放到undoStack
            i = redoStack.pop();
            undoStack.push(i);
            tmp = adder.add(i);
        }
        return tmp;
    }
}
