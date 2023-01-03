package exp3.t2;

public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，运算结果是：" + i);
    }

    public void undo() {
        int i = command.undo();
        if (i == -1) {
            System.out.println("已撤销至最新数据！");
        } else {
            System.out.println("执行撤销，运算结果是：" + i);
        }
    }

    public void redo() {
        int i = command.redo();
        if (i == -1) {
            System.out.println("已重做至最新数据！");
        } else {
            System.out.println("执行重做，运算结果是：" + i);
        }
    }


}
