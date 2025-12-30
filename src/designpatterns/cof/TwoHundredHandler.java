package designpatterns.cof;

public class TwoHundredHandler extends AbstractCashHandler {
    private int notesCount;

    public TwoHundredHandler(int notesCount){
        this.notesCount = notesCount;
    }
    @Override
    public int handle(int amount) {
        int requireNotes = amount / 200;
        int dispenseNotes = Math.min(requireNotes, notesCount);
        if(dispenseNotes > 0){
            System.out.println("₹200 x " + dispenseNotes);
        }
//        update inventory

        notesCount -= dispenseNotes;
        int remaining = amount -  ( dispenseNotes * 200);
        return forward(remaining);
    }
}
