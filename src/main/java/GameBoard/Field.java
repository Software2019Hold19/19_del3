package GameBoard;

public abstract class Field {
    private String name;
    private String type; // "start", "street", "chance" or "visit"

    public Field(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void landOnField(){}
}
