package Chain_of_Responsibiltiy;

public class MediumSupportSystemImpl implements SupporterSystem{

    SupporterSystem supporterSystem;

    public MediumSupportSystemImpl(SupporterSystem supporterSystem) {
        this.supporterSystem = supporterSystem;
    }

    @Override
    public void handle(String level) {
        if(level.equals(LevelEnum.MEDIUM.codeValue)){
            System.out.print("Medium can handle this\n");
            return;
        }
        System.out.print("Assigning to Upper.\n");
        supporterSystem.handle(level);
    }
}
