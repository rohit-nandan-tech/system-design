package Chain_of_Responsibiltiy;

public enum LevelEnum {
    BASE("base"),
    MEDIUM("medium"),
    UPPER("upper"),
    NA("NA");

    public String codeValue;

    LevelEnum(String codeValue) {
        this.codeValue = codeValue;
    }

    public static LevelEnum fromType(String codeValue){
        for(LevelEnum levelEnum : values()){
            if(levelEnum.codeValue.equals(codeValue)){
                return levelEnum;
            }
        }
        return LevelEnum.NA;
    }
}
