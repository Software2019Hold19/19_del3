package GameBoard;

public abstract class Field {
    private String name;
    private String type; // "start", "street", "chance" "jail" or "visit"
    private String subName;
    private String desc;

    public Field(String name, String subName, String desc, String type){
        this.name = name;
        this.type = type;
        this.subName = subName;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSubName() {
        return subName;
    }

    public String getDesc() {
        return desc;
    }

    public void landOnField(){}
}
