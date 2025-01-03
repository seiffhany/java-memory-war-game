package packages.commands;
import packages.AI;

public class MOV_R extends Command {

    public MOV_R(int source, int target) {
        this.source = source;
        this.target = target;
    }

    public String getName() {
        return "MOV_R";
    }

    public void execute(AI myAI) {
        int sourceIndex = myAI.getMemoryCellIndex(source);
        int targetIndex = myAI.getMemoryCellIndex(target);

        Command[] memory = AI.memory;
        memory[targetIndex] = AI.copyMemoryCell(sourceIndex);

        myAI.applySymbol(targetIndex);
        myAI.incrementProgramCounter();
    }
}