package GameBoard;

public class Field {
    private String name;
    private String type;

    public Field(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
}
