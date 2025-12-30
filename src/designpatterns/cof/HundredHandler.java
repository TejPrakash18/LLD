package designpatterns.cof;

public class HundredHandler extends AbstractCashHandler{
    private int notesCount;

    public HundredHandler(int notesCount){
        this.notesCount = notesCount;
    }
    @Override
    public int handle(int amount) {
        int requireNotes = amount / 100;
        int dispenseNotes = Math.min(requireNotes, notesCount);
        if(dispenseNotes > 0){
            System.out.println("₹100 x " + dispenseNotes);
        }
//        update inventory

        notesCount -= dispenseNotes;
        int remaining = amount -  ( dispenseNotes * 500);
        return forward(remaining);
    }
}
