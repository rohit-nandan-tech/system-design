package Chain_of_Responsibiltiy;

public class UpperSupportSystemImpl implements SupporterSystem{

    @Override
    public void handle(String level) {
        if(level.equals(LevelEnum.UPPER.codeValue)){
            System.out.print("Upper can handle this.");
            return;
        }
        System.out.print("No one can handle this.");
    }
}
