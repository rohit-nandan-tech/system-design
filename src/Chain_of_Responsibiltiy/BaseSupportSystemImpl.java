package Chain_of_Responsibiltiy;

public class BaseSupportSystemImpl implements SupporterSystem{

    SupporterSystem supporterSystem;

    public BaseSupportSystemImpl(SupporterSystem supporterSystem) {
        this.supporterSystem = supporterSystem;
    }

    @Override
    public void handle(String level) {
        if(level.equals(LevelEnum.BASE.codeValue)){
            System.out.print("Base can handle this\n");
            return;
        }
        System.out.print("Assigning to Medium\n");
        supporterSystem.handle(level);
    }
}
