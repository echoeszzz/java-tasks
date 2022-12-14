package task22;

public class OperationController {
    private Operation model;

    private OperationView view;

    public OperationController(Operation model, OperationView view){
        this.model=model;
        this.view=view;
    }

    public void setOperationSymbol(String symbol){
        model.setOperationSymbol(symbol);
    }
    public String getOperationSymbol(){return  model.getOperationSymbol();}

    public void setOperationDig1(int dig1){
        model.setOperationDig1(dig1);
    }
    public int getOperationDig1(){return  model.getOperationDig1();}

    public void setOperationDig2(int dig2){
        model.setOperationDig2(dig2);
    }
    public int getOperationDig2(){return  model.getOperationDig2();}

}