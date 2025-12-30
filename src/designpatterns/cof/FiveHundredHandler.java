package designpatterns.cof;

public class FiveHundredHandler extends AbstractCashHandler{
    private int notesCount;

    public FiveHundredHandler(int notesCount){
        this.notesCount = notesCount;
    }
    @Override
    public int handle(int amount) {

        int requireNotes = amount / 500;
        int dispenseNotes = Math.min(requireNotes, notesCount);
        if(dispenseNotes > 0){
            System.out.println("₹500 x " + dispenseNotes);
        }
//        update inventory

        notesCount -= dispenseNotes;
        int remaining = amount -  ( dispenseNotes * 500);
        return forward(remaining);
    }
}
