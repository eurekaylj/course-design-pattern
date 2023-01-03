package exp3.t2;

public class Client {
    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        AddCommand addCommand = new AddCommand();
        calculatorForm.setCommand(addCommand);
        //计算
        System.out.println("------计算过程-----");
        calculatorForm.compute(1);
        calculatorForm.compute(2);
        calculatorForm.compute(3);
        //多次撤回
        System.out.println("------撤回过程-----");
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
        calculatorForm.undo();
        //多次恢复
        System.out.println("------恢复过程-----");
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.redo();
        calculatorForm.redo();
    }
}
